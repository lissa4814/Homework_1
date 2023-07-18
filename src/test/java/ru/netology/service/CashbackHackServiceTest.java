package ru.netology.service;
public class CashbackHackServiceTest {
    @org.junit.Test
    public void remainToGetCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void remainNoCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
}