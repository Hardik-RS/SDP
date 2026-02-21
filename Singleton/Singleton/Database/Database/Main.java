public class Main {

    public static void main(String[] args) {

        System.out.println("Requesting DB connection first time...");
        DatabaseConnectionManager db1 = DatabaseConnectionManager.getInstance();
        System.out.println(db1.getConnection());

        System.out.println("\nRequesting DB connection second time...");
        DatabaseConnectionManager db2 = DatabaseConnectionManager.getInstance();
        System.out.println(db2.getConnection());

        System.out.println("\nChecking if both objects are same:");
        System.out.println("Hashcode of db1: " + db1.hashCode());
        System.out.println("Hashcode of db2: " + db2.hashCode());

        if (db1 == db2) {
            System.out.println("Only ONE instance exists (Singleton working)");
        } else {
            System.out.println("Multiple instances exist (Singleton broken)");
        }
    }
}
