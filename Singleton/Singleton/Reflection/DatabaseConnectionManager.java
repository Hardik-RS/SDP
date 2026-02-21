
//How Reflection breaks Singleton

public class DatabaseConnectionManager {
    
    private static DatabaseConnectionManager instance;
    private DatabaseConnectionManager(){
        System.out.println("Narendra ");
    }
    public static DatabaseConnectionManager getInstance(){
          
        if (instance==null){
            instance=new DatabaseConnectionManager() ;
           
        }
        return instance;
    }

}

