import java.io.*;

public class EX7_Suidou2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 区分に0が入力されるまで繰り返す */
        suidou:
        while(true) {
            int use = 0,amo = 0;
            System.out.print("区分？　　");
            int section = Integer.parseInt(br.readLine());
            switch (section) {
            case 0:
                break suidou;
            case 1:
                System.out.print("使用量？　");
                use = Integer.parseInt(br.readLine());
                if (use <= 50) {
                    amo = 1000 + 80 * use;
                    System.out.println("一般－－－－料金=" + amo +"\n");
                } else if (use > 50) {
                    amo = 5000 + 120 * (use - 50);
                    System.out.println("一般－－－－料金=" + amo +"\n");
                }
                break;
            case 2:
                System.out.print("使用量？　");
                use = Integer.parseInt(br.readLine());
                amo = 1300 + 150 * use;
                System.out.println("営業－－－－料金=" + amo +"\n");
                break;
            case 3:
                System.out.print("使用量？　");
                use = Integer.parseInt(br.readLine());
                amo = 2300 + 240 * use;
                System.out.println("臨時－－－－料金=" + amo +"\n");
                break;
            default:
                System.out.println("1-3の整数を入力してください" + "\n" + "終了する場合は0を入力します");
                break;
            }
        }
    }
}