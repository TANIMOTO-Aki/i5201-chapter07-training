import java.io.*;

public class EX7_Uriage {
    public static void main(String[] args) throws IOException {
        /* 入力準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int uriage =0;

        /* ループ処理と数量・単価の入力 */
        while (true) {
            System.out.print("数量？ ");
            int vol = Integer.parseInt(br.readLine());
            /* 計算 */
            if (!( vol <= 0 )) {
                System.out.print("単価？ ");
                int price = Integer.parseInt(br.readLine());
                int amo = vol * price;
                System.out.println("売上 = " + amo + "\n");
                uriage += amo;
            } else {
                break;
            }
        }
        System.out.println("\n" + "合計 = " + uriage);
    }
}
