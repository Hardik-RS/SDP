import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        DatabaseConnectionManager  s=DatabaseConnectionManager.getInstance();

        // Serialize
        ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("file.ser"));

        out.writeObject(s);
        out.close();

        // Deserialize
        ObjectInputStream in =new ObjectInputStream(new FileInputStream("file.ser"));

        DatabaseConnectionManager s2=(DatabaseConnectionManager) in.readObject();

        in.close();

        System.out.println(s);
        System.out.println(s2);
    }
}
