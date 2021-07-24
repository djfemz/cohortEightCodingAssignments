package bankAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void accountCanBeCreatedTest(){
        Account account1 = new Account("Jane Doe", 50.00);
        assertEquals("Jane Doe", account1.getName());
        assertEquals(50.00, account1.getBalance());
    }

    @Test
    public void accountCanBeDepositedIntoTest(){
        Account account2 = new Account("John Doe", -7.80);
        account2.deposit(25.00);
        assertEquals(25.00, account2.getBalance());
        assertEquals("John Doe", account2.getName());
    }

}