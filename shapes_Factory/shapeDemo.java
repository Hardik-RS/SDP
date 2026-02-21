import java.util.Scanner;
class shapeDemo {
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);

        System.out.println("Draw any Shape:");

        System.out.println("1:Circle");
        System.out.println("2:Square");
        System.out.println("3:Rectangle");
        System.out.print("Enter your Choise to draw a Shape:");
        int val=sc.nextInt();

                
        if(val==1)
        {
            System.out.println("Circle");
            Circle cir=new Circle(10.2);
            System.out.println(cir.draw());
            System.out.println(cir.fillColour());
        }
        else if(val==2)
        {
            System.out.println("Square");
            Square squ=new Square(13);
            System.out.println(squ.draw());
            System.out.println(squ.fillColour());
        }
        else if(val==3)
        {
            System.out.println("Rectangle");
            rectangle rec=new rectangle(15,46);
            System.out.println(rec.draw());
            System.out.println(rec.fillColour());
        }
        else 
        {
            System.out.println("Enter valid nuber..");
        }
    }
}