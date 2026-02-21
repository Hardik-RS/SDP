public class TaxFactory {

    public static TaxCity getPropertyTax(int no) 
    {
        TaxCity tax = null;   

        if (no==1) 
        {
            tax = new TaxAhmedabad();   
        }
        else if (no==2) 
        {
            tax = new TaxSurat();      
        }
        else if (no==3) 
        {
            tax = new TaxRajkot();      
        }
        return tax;
    }
}
