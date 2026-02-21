public class TaxAhmedabad implements TaxCity {
    
    public double calculateTax(double area, double baseRate) 
    {
        return area * baseRate;
    }

    public double payTax(double amount) 
    {
        return amount;
    }
}
