package model;

public class TransactionModel {

    private String accountNumber;
    private String currency;
    private int ammount;
    private Integer exchangeRate;

    @Override
    public String toString() {
        return "\naccountNumber='" + accountNumber + '\'' + "\n" +
                "currency='" + currency + '\'' + "\n"  +
                "ammount=" + ammount + "\n"  +
                "exchangeRate=" + exchangeRate + "\n";
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public int getAmmount() {
        return ammount;
    }

    public Integer getExchangeRate() {
        return exchangeRate;
    }
}
