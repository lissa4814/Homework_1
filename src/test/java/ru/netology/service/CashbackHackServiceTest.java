package ru.netology.service;
public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void remainToGetCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void remainNoCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.testng.Assert.assertEquals(actual, expected);
    }
}
