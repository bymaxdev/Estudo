public class Bank {
    private String name;
    private final Long account;
    private Double balance;

    public Bank(String name, Long account, double initialDeposit) {
        this.name = name;
        this.account = account;
        this.balance = 0.0;
        deposit(initialDeposit);
    }

    public Bank(String name, Long account) {
        this.name = name;
        this.account = account;
        this.balance = 0.0;
    }


    public void deposit(Double valDep){
        this.balance += valDep;
    }

    public void withdraw(Double valWit){
        this.setBalance(this.getBalance()-valWit-5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccount() {
        return account;
    }


    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account data:" + "\n" +
                "Account Number: " + this.getAccount() + "\n" +
                "Holder: " + this.getName() + "\n" +
                "Balance: R$ " + this.getBalance();
    }
}
