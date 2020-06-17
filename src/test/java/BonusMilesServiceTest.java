import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Scanner;

class BonusMilesServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusMilesService service = new BonusMilesService();
        int price = 0;
        Scanner in = new Scanner(System.in);
        System.out.print ("Введите цену билета \n");
        price = in.nextInt();
        System.out.print ("Test1 \n" + service.calculate (price));
        assertEquals(price, price +1);
    }
    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusMilesService service = new BonusMilesService();
        int price = 0;
        Scanner in = new Scanner(System.in);
        System.out.print ("Введите цену билета \n");
        price = in.nextInt();
        System.out.print ("Test2 \n" + service.calculate (price));
        assertEquals(price, price + 1 - 1);
    }
}