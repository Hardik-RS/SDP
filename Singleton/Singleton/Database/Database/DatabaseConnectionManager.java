import java.io.Serializable;

public class DatabaseConnectionManager implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private static volatile DatabaseConnectionManager instance;

    private String connection;

    private DatabaseConnectionManager() {

        // Reflection protection
        if (instance != null) {
            throw new RuntimeException("Reflection is not allowed.");
        }

        connection = "Database Connected Successfully";
        System.out.println("DB Connection Created");
    }

    public static DatabaseConnectionManager getInstance() {

        if (instance == null) {
            synchronized (DatabaseConnectionManager.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionManager();
                }
            }
        }
        return instance;
    }

    public String getConnection() {
        return connection;
    }

    // Serialization protection
    protected Object readResolve() {
        return getInstance();
    }

    // Cloning protection
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning is not allowed");
    }
}
