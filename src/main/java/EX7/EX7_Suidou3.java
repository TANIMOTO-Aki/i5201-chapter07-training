import java.io.*;
import java.nio.charset.Charset;

public class EX7_Suidou3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
            System.in,Charset.forName(System.getProperty("native.encoding"))));
    
        final int USAGE_RATE = 50;              //従量料金

        /* 区分が未入力になるまで繰り返す */
        while (true) {
            int use = 0,amount = 0;
            System.out.println("区分(一般、営業、臨時、未入力で終了)？");
            String kubun = br.readLine();
            if (kubun.length()==0) {            //区分は未入力か？
                System.out.print("処理終了");
                break;
            }
            System.out.print("使用量？　");
            use = Integer.parseInt(br.readLine());
            switch (kubun) {
                case "一般":
                if (use <= USAGE_RATE) {
                    amount = 1000 + 80 * use;
                } else if (use > USAGE_RATE) {
                    amount = 5000 + 120 * (use - USAGE_RATE);
                }
                System.out.println("一般－－－－料金=" + amount +"\n");
                break;
            case "営業":
                amount = 1300 + 150 * use;
                System.out.println("営業－－－－料金=" + amount +"\n");
                break;
            case "臨時":
                amount = 2300 + 240 * use;
                System.out.println("臨時－－－－料金=" + amount +"\n");
                break;
            default:
                System.out.println("区分は(一般・営業・臨時)のいずれかを入力してください");
                break;
            }
        }
    }
}
