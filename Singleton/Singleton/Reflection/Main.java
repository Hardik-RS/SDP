import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {

        DatabaseConnectionManager s1 =DatabaseConnectionManager.getInstance();

        constructor<DatabaseConnectionManager> constructor =DatabaseConnectionManager.class.getDeclaredConstructor();

        constructor.setAccessible(true); // break private access

        DatabaseConnectionManager s2 =constructor.newInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
