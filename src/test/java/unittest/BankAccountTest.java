package unittest;

import Bank.BankAccount;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankAccountTest {

    private BankAccount account;
    private int balance = 300;

    @BeforeMethod
    public void setup() {
        this.account = new BankAccount(balance);
    }

    @Test
    public void getBalance() {
        Assert.assertEquals(this.account.getBalance(), 301, "account balance");
    }

    @Test
    public void depositMoney() {
        this.account.deposit(150);
        Assert.assertEquals(this.account.getBalance(), 451, "new account balance");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void withdrawMoney() {
        this.account.withdraw(350);
        Assert.assertEquals(this.account.getBalance(), 151, "new account balance");
    }
}
