public class BankAccount {
    private double amount;

    public void deposit(double sum){
        amount += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount< sum){
            throw new LimitException("Ваша сумма меньше остатка. ", getAmount());
        }
        amount -= sum;

    }

    public double getAmount() {
        return amount;
    }
}
