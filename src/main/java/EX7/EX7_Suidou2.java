import java.io.*;

public class EX7_Suidou2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        final int EXIT_SIGNAL = 0;
        final int USAGE_THRESHOLD = 50;              //一般のしきい値
        final int GENERAL_BASE_RATE = 1000;          //一般の基本料金
        final int GENERAL_USAGE_RATE1 = 80;          //一般の従量料金(使用量50㎡まで)
        final int GENERAL_USAGE_RATE2 = 120;         //一般の従量料金(使用量50㎡を超えるとき)
        
        final int COMMERCIAL_BASE_RATE = 1300;       //営業の基本料金
        final int COMMERCIAL_USAGE_RATE = 150;       //営業の従量料金

        final int TEMPORARY_BASE_RATE = 2300;       //臨時の基本料金
        final int TEMPORARY_USAGE_RATE = 240;       //臨時の従量料金


        /* 区分に0が入力されるまで繰り返す */
        while(true) {
            int use = 0,amount = 0;
            int baseRate = 0, usageRate = 0;
            String kubun = "";
            System.out.print("区分？　　");
            int section = Integer.parseInt(br.readLine());
            if (section == EXIT_SIGNAL) {
                break;
            }
            System.out.print("使用量？　");
            use = Integer.parseInt(br.readLine());
            switch (section) {
            case 1:
                if (use <= USAGE_THRESHOLD) {
                    baseRate = GENERAL_BASE_RATE;
                    usageRate = GENERAL_USAGE_RATE1;
                } else {
                    baseRate = GENERAL_BASE_RATE + GENERAL_USAGE_RATE1 * USAGE_THRESHOLD;
                    usageRate = GENERAL_USAGE_RATE2;
                    use -= USAGE_THRESHOLD;
                }
                kubun = "一般";
            case 2:
                baseRate = COMMERCIAL_BASE_RATE;
                usageRate = COMMERCIAL_USAGE_RATE;
                kubun = "営業";
                break;
            case 3:
                baseRate = TEMPORARY_BASE_RATE;
                usageRate = TEMPORARY_USAGE_RATE;
                kubun = "臨時";
                break;
            default:
                System.out.println("区分には1-3の整数を入力してください" + "\n" + "終了する場合は0を入力します");
                break;
            }
            amount = baseRate + use * usageRate;
            System.out.println(kubun + "－－－－料金=" + amount);
        }
    }
}