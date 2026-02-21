import java.util.Scanner;

public class TaxSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter City No: ( 1:Ahmedabad / 2:Surat / 3:Rajkot ): ");
        int no = sc.nextInt();

        TaxCity tax = TaxFactory.getPropertyTax(no);

        if (tax == null) {
            System.out.println("Invalid No..");
            sc.close();
            return;
        }

        System.out.print("Enter property area (sq.m): ");
        double area = sc.nextDouble();

        System.out.print("Enter base rate: ");
        double baseRate = sc.nextDouble();

        double calculatedTax = tax.calculateTax(area, baseRate);

        System.out.println("Property Tax to Pay for city No " + no + " : " + calculatedTax);

        System.out.println("Paid property taxs : " + tax.payTax(calculatedTax));

        sc.close();
    }
}
