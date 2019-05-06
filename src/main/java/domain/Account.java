package domain;

public final class Account {

    private final String accountNumber;
    private final String currency;
    private double ballance;

    public Account(String accountNumber, String currency, double ballance) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.ballance = ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBallance() {
        return ballance;
    }
}
