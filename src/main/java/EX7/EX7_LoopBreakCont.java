import java.io.*;

public class EX7_LoopBreakCont {
    public static void main(String[] args) throws IOException {
        /* 入力準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 無限ループと数字の入力 */
        while(true) {
            System.out.print("数字入力>");
            int number = Integer.parseInt(br.readLine());
            /* 判定 */
            if (number == 1) {
                break;
            } else if (number == 2) {
                System.out.println("CONTINUE ループ");
            } else {
                System.out.println("ループ");
            }
        }
    }
}