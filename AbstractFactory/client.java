import java.util.Scanner;

public class client
{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.print("Enter the OS (window/mac) or 'exit': ");
            String os = sc.nextLine().toLowerCase();

            GUIFactory factory;

            switch (os) {
                case "window" -> factory  = new windowFactory();

                case "mac" -> factory = new macFactory();

                case "exit" -> {
                    System.out.println("Exiting program...");
                    return;
                }

                default -> {
                    System.out.println("Invalid OS. Try again.\n");
                    continue;
                }
            }

            Button button = factory.createButton();
            checkBox checbox = factory.createCheckbox();

            System.out.println(button.click());
            System.out.println(checbox.checked());
        }
    }
}
