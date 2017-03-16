/**
 * Created by dsm2017 on 2017-03-10.
 */
import java.util.Scanner;
public class Money {
    Scanner scanner = new Scanner(System.in);
    int bill = 0;
    public void GetMoney() throws Exception {
        System.out.println("입금하실 액수를 입력하십시오 : ");
        bill += scanner.nextInt();
        System.out.print(bill);
        System.out.println("원 입금되었습니다. 현재 잔돈 : " + bill + "원");
    }
    public void ReturnMoney() {
        System.out.print(bill);
        System.out.println("원 환불되었습니다.");
        bill = 0;
    }
}
