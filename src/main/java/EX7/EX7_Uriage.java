import java.io.*;

public class EX7_Uriage {
    public static void main(String[] args) throws IOException {
        /* 入力準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int uriage =0;              
        final int MIN_VOLUME = 0;

        /* ループ処理と数量・単価の入力 */
        while (true) {
            System.out.print("数量？ ");
            int volume = Integer.parseInt(br.readLine());
            if (volume <= MIN_VOLUME) {
                break;
            } else {
                System.out.print("単価？ ");
                int price = Integer.parseInt(br.readLine());
                int amount = volume * price;
                System.out.println("売上 = " + amount + "\n");
                uriage += amount;
            }
        }
        System.out.println("\n" + "合計 = " + uriage);
    }
}
