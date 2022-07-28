public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);

        while (true) {
            System.out.println("Ваш баланс: " + bankAccount.getAmount());

            try {
                bankAccount.withDraw(1500);
            } catch (LimitException a) {
                System.out.println(a.getMessage() + "Было взято: " + a.getRemainingAmount());
                try {
                    bankAccount.withDraw((int) a.getRemainingAmount());
                    System.out.println("Осталось: " + bankAccount.getAmount());
                    break;
                } catch (LimitException wa) {
                    wa.printStackTrace();
                }
            }
        }
    }
}