import java.io.*;

public class EX7_Suidou1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        final int EXIT_SIGNAL = -1;
        final int USAGE_THRESHOLD = 50;             //一般料金のしきい値
        final int BASE_RATE = 1000;                 //基本料
        final int USAGE_RATE1 = 80;                 //従量料金(使用量50㎡まで)
        final int USAGE_RATE2 = 120;                //従量料金(使用量50㎡を超えるとき)

        /* 使用量に-1が入力されるまで処理を繰り返す */
        while(true) {
            System.out.print("使用量？ ");
            int amount = 0;
            int use = Integer.parseInt(br.readLine());
            if (use == EXIT_SIGNAL) {
                break;
            }

            if (use <= USAGE_THRESHOLD) {
                amount = BASE_RATE + USAGE_RATE1 * use;
            } else {
                amount = BASE_RATE + (USAGE_RATE1 * USAGE_THRESHOLD) + USAGE_RATE2 * (use - USAGE_THRESHOLD);
            }
            System.out.println("料金=" + amount +"\n");
        }
    }
}
