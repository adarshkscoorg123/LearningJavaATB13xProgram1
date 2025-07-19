package ex_35_Java_Exceptions;

public class Lab_269_Custom_Exception_Example {

    public static void main(String[] args) throws CurrencyMismatchCustomException {
        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 250);

        int total = sbi.add(icici);
        System.out.println(total);

        //Bank jp_chase = new Bank("USD", 101);
        //int total_new = sbi.add(jp_chase);
        //System.out.println(total_new);
    }
}


class Bank {

    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws CurrencyMismatchCustomException {
        if(bankName.currency.equals("INR")){
            return bankName.amount + this.amount;
        }
        else {
            throw new CurrencyMismatchCustomException("Currency Mismatch");
        }
    }
}


class CurrencyMismatchCustomException extends Exception {

    public CurrencyMismatchCustomException(String msg){
        super(msg);

    }

}
