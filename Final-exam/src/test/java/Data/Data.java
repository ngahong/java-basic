package Data;

import Objects.Account;

public class Data {
    public static Account getDefaultAccount(){
        Account standard_acc = new Account();
        standard_acc.setUsername("John Doe");
        standard_acc.setPassword("ThisIsNotAPassword");
        return standard_acc;
    }
}
