import java.io.*;

public class EX7_Suidou1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        final int MIN_USE = -1;
        final int USAGE_RATE = 50;              //従量料金

        /* 使用量に-1が入力されるまで処理を繰り返す */
        while(true) {
            System.out.print("使用量？ ");
            int use = Integer.parseInt(br.readLine());
            if (use == MIN_USE) {
                break;
            }

            if (use <= USAGE_RATE) {
                int amount = 1000 + 80 * use;
                System.out.println("料金=" + amount +"\n");
            } else {
                int amount = 5000 + 120 * (use - USAGE_RATE);
                System.out.println("料金=" + amount +"\n");
            }
        }
    }
}
