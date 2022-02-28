public class CashRegister {
    
    // Variable to store the cash in the register
    private static int cashOnHand;

        // Default constructor
        // Set the cash in the register to 500 cents
        // Postcondition: cashOnHand = 500;
    public CashRegister() {
        cashOnHand = 500;
    }

        // Constructor with parameters
        // Cash in the register to a specific amount
        // Postcondition: cashOnHand = cashIn;
    public CashRegister(int cashIn) {
        if (cashIn >= 0)
            cashOnHand = cashIn;
        else
            cashOnHand = 500;
    }

        // Method to show the current amount in the register
        /* Postcondition:
         *   The value of the instance variable cashOnHand
         *   is returned
         */
    public int currentBalance() {
        return cashOnHand;
    }

        /* Method to receive the amount deposited by
         * the customer and update the amount in the
         * register
         * 
         * Postcondition: cashOnHand = cashOnHand + amountIn;
         */ 
    public void acceptAmount(int amountIn) {
        cashOnHand = cashOnHand + amountIn;
    }
}
