import org.junit.Test;
import ru.netology.service.Cashback;

import static org.junit.Assert.assertEquals;


public class CashbackTest {

    @Test
    public void CashbackForPurchaseOf1000() {
        Cashback cashback = new Cashback();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void CashbackForPurchaseOf500() {
        Cashback service = new Cashback();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test

    public void CashbackForPurchaseOfk700() {
        Cashback service = new Cashback();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }
}