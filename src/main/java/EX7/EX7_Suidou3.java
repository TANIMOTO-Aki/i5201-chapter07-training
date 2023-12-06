import java.io.*;
import java.nio.charset.Charset;

public class EX7_Suidou3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
            System.in,Charset.forName(System.getProperty("native.encoding"))));
    
        final int EXIT_SIGNAL = 0;
        final int USAGE_THRESHOLD = 50;              //一般のしきい値
        final int GENERAL_BASE_RATE = 1000;          //一般の基本料金
        final int GENERAL_USAGE_RATE1 = 80;          //一般の従量料金(使用量50㎡まで)
        final int GENERAL_USAGE_RATE2 = 120;         //一般の従量料金(使用量50㎡を超えるとき)
        
        final int COMMERCIAL_BASE_RATE = 1300;       //営業の基本料金
        final int COMMERCIAL_USAGE_RATE = 150;       //営業の従量料金
    
        final int TEMPORARY_BASE_RATE = 2300;       //臨時の基本料金
        final int TEMPORARY_USAGE_RATE = 240;       //臨時の従量料金

        /* 区分が未入力になるまで繰り返す */
        while (true) {
            int use = 0,amount = 0;
            int baseRate = 0, usageRate = 0;
            System.out.println("区分(一般、営業、臨時、未入力で終了)？");
            String kubun = br.readLine();
            if (kubun.length()==EXIT_SIGNAL) {            //区分は未入力か？
                System.out.print("処理終了");
                break;
            }
            System.out.print("使用量？　");
            use = Integer.parseInt(br.readLine());
            switch (kubun) {
            case "一般":
                if (use <= USAGE_THRESHOLD) {
                    baseRate = GENERAL_BASE_RATE;
                    usageRate = GENERAL_USAGE_RATE1;
                } else {
                    baseRate = GENERAL_BASE_RATE + GENERAL_USAGE_RATE1 * USAGE_THRESHOLD;
                    usageRate = GENERAL_USAGE_RATE2;
                    use -= USAGE_THRESHOLD;
                }
                break;
            case "営業":
                baseRate = COMMERCIAL_BASE_RATE;
                usageRate = COMMERCIAL_USAGE_RATE;
                break;
            case "臨時":
                baseRate = TEMPORARY_BASE_RATE;
                usageRate = TEMPORARY_USAGE_RATE;
                break;
            default:
                System.out.println("区分は(一般・営業・臨時)のいずれかを入力してください");
                break;
            }
            amount = baseRate + use * usageRate;
            System.out.println(kubun + "－－－－料金=" + amount + "\n");
        }
    }
}
