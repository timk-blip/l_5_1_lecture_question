import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        BonusMilesService service = new BonusMilesService();
        int price = 0;
        Scanner in = new Scanner(System.in);
        System.out.print ("Введите цену билета \n");
        price = in.nextInt();
        System.out.print ("Вам начислено бесплатных миль \n" + service.calculate (price));

    }
}