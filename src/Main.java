/**
 * Created by dsm2017 on 2017-03-10.
 * @author Xsoulte
 * @version 1.0
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Money money = new Money();
        DrinkBox drinkBox = new DrinkBox();
        int select;
        while(true) {
            System.out.println("=== 음료수 자판기 ===");
            System.out.println("숫자를 입력하여 기능을 선택하십시오.");
            System.out.println("1. 입금");
            System.out.println("2. 음료수 구매");
            System.out.println("3. 잔돈 반환");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    try {
                        money.GetMoney();
                    }
                    catch(Exception e)
                    {
                        System.out.println("선택하는 도중 오류가 발생하였습니다.");
                    }
                    break;
                case 2:
                    int drinkSelect;
                    drinkSelect = drinkBox.SelectDrink();
                    money.bill -= drinkBox.price[drinkSelect];
                    System.out.print(drinkBox.list[drinkSelect] + " ");
                    System.out.println("구매 완료!");
                    System.out.println("잔돈 : " + money.bill + "원");
                    break;
                case 3:
                    money.ReturnMoney();
                    break;
                default:
                    System.out.println("올바른 번호를 입력하십시오.");
                    break;
            }
        }
    }
}
