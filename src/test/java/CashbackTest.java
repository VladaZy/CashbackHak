import org.testng.annotations.Test;
import ru.netology.service.Cashback;

import static org.testng.Assert.assertEquals;


class CashbackTest {

    @Test
    public void CashbackForPurchaseOf1000() {
        Cashback cashback = new Cashback();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void CashbackForPurchaseOf200() {
        Cashback service = new Cashback();
        int amount = 200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test

    public void CashbackForPurchaseOfk900() {
        Cashback service = new Cashback();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void CashbackForPurchaseOf600() {
        Cashback service = new Cashback();
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);

    }

}