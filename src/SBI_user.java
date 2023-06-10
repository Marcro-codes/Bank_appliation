import java.util.UUID;

public class SBI_user implements Bank_Interface{
/* note :
if you have to implementing the interface then you have to
since it is private then we have to define all methods
*/

    private String name;
    private String accountNO;
    private double balance;
    private String password;
    private static double InterestRate;


//  IJ gives us this facilities ::  for constructor use : alt + insert
    public SBI_user(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.InterestRate = 6.5;

//        UUID generate's random numbers - universally unique identifier
//        it generates random 128 bit number - totally unique accross the world
        this.accountNO = String.valueOf(UUID.randomUUID());
    }


    // here just generates getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNO() {
        return accountNO;
    }

    public void setAccountNO(String accountNO) {
        this.accountNO = accountNO;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getInterestRate() {
        return InterestRate;
    }

    public static void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "See your updated balance : " + balance;
    }

    @Override
    public String withdrawMoney(int amount, String password) {
        return null;
    }

    @Override
    public double calculateInterest(int year) {
        return (balance*year*InterestRate)/100;
    }
}
