/**
 * Created by dsm2017 on 2017-03-10.
 */

import java.util.Scanner;
public class DrinkBox {
    String[] list = {"사과주스", "콜라", "비타민워터"};
    int[] price = {500,800,1500};
    Scanner scanner = new Scanner(System.in);

    public int SelectDrink()
    {
        int select;
        for(int a = 0; a < list.length; a++) {
            System.out.print(list[a] + " ");
            System.out.println(price[a]);
        }
        System.out.println("음료를 선택하세요. : ");
        select = scanner.nextInt();


        return select-1;
    }
}
