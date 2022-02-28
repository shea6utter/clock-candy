public class Dispenser {
    
        // Variable to store the number of items in the dispenser
    private int numberOfItems;

        // Variable to store the cost of an item
    private int cost;

        // Default constructor
        // Set the cost and number of items to default values
        // Postcondition: numberOfItems = setNoOfItems; cost = 50;
    public Dispenser() {
        numberOfItems = 50;
        cost = 50;
    }

        // Constructor with parameters
        // Set the cost and number of items in the dispenser by the user
        // Post-condition: numberOfItem = setNoOfItems; cost = setCost;
    public Dispenser( int setNoOfItems, int setCost) {
        if (setNoOfItems >= 0)
            numberOfItems = setNoOfItems;
        else 
            numberOfItems = 50;

        if (setCost >= 0)
            cost = setCost;
        else
            cost = 50;
    }


        // Method to show the number of items in the dispenser
        // Postcondition: The value of the instance variable numberOfItems is returned
    public int getCount() {
        return numberOfItems;
    }

        // Method to show the cost of the item
        // Postcondition: The value of the instance variable cost is returned
    public int getProductCost() {
        return cost;
    }

        // Method to reduce the number of items by 1
        // Postcondition: numberOfItems = numberOfItems - 1;
    public void makeSale() {
        numberOfItems--;
    }
} 
