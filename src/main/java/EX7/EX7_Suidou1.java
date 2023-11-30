import java.io.*;

public class EX7_Suidou1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 使用量に-1が入力されるまで処理を繰り返す */
        while(true) {
            System.out.print("使用量？ ");
            int use = Integer.parseInt(br.readLine());
            if (use == -1) {
                break;
            } else if (use <= 50) {
                int amo = 1000 + 80 * use;
                System.out.println("料金=" + amo +"\n");
            } else if (use > 50) {
                int amo = 5000 + 120 * (use - 50);
                System.out.println("料金=" + amo +"\n");
            }
        }
    }
}
