public class CashRegister {
    
    private static int cashOnHand;

    public CashRegister() {
        cashOnHand = 500;
    }

    public CashRegister(int cashIn) {
        if (cashIn >= 0)
            cashOnHand = cashIn;
        else
            cashOnHand = 500;
    }

    public int currentBalance() {
        return cashOnHand;
    }

    public void acceptAmount(int amountIn) {
        cashOnHand = cashOnHand + amountIn;
    }
}
