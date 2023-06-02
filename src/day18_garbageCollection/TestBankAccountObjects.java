package day18_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        Warmup_BankAccount obj1 = new Warmup_BankAccount();
        obj1.setInfo("Gadir", 123456789);

        System.out.println(obj1);

        obj1.deposit(1000);

        obj1.checkBalance();


        obj1.withdraw(700);


        obj1.checkBalance();


        obj1.deposit(-1000);

        obj1.checkBalance();

        obj1.withdraw(5000);

        obj1.checkBalance();


        System.out.println("-------------------------------------------");

        Warmup_BankAccount account1 = new Warmup_BankAccount();

        Warmup_BankAccount account2 = new Warmup_BankAccount();

        account1.setInfo("Sebastian", 789456123);

        account2.setInfo("Umran", 456789123);


        account1.deposit(5000);
        account2.deposit(10000);

        System.out.println(account1);
        System.out.println(account2);


        account1.withdraw(1000);


        System.out.println(account1);
        System.out.println(account2);



    }

}

