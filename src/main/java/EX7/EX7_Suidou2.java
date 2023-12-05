import java.io.*;

public class EX7_Suidou2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        final int MIN_USE = 0;
        final int USAGE_RATE = 50;              //従量料金

        /* 区分に0が入力されるまで繰り返す */
        while(true) {
            int use = 0,amount = 0;
            System.out.print("区分？　　");
            int section = Integer.parseInt(br.readLine());
            if (section == MIN_USE) {
                break;
            }
            System.out.print("使用量？　");
            use = Integer.parseInt(br.readLine());
            switch (section) {
            case 1:
                if (use <= USAGE_RATE) {
                    amount = 1000 + 80 * use;
                } else if (use > USAGE_RATE) {
                    amount = 5000 + 120 * (use - USAGE_RATE);
                }
                System.out.println("一般－－－－料金=" + amount +"\n");
                break;
            case 2:
                amount = 1300 + 150 * use;
                System.out.println("営業－－－－料金=" + amount +"\n");
                break;
            case 3:
                amount = 2300 + 240 * use;
                System.out.println("臨時－－－－料金=" + amount +"\n");
                break;
            default:
                System.out.println("区分には1-3の整数を入力してください" + "\n" + "終了する場合は0を入力します");
                break;
            }
        }
    }
}