/*
 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class S13Q1 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");    
        DatabaseMetaData md = conn.getMetaData();
        
        System.out.println("" + md.getDatabaseProductName());
        System.out.println("" + md.getDatabaseProductVersion());
        System.out.println("" + md.getDriverName());
        System.out.println("" + md.getDriverVersion());
        
        ResultSet tables = md.getTables(null, null, "%", new String[]{"TABLE"});
        System.out.println("Tables in Database:");
        while(tables.next()) {
            String tableName = tables.getString("TABLE_NAME");
            System.out.println(tableName);
        }
    }
}

 */

 /*
  
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadLifeCycle extends Thread {
    private String threadName;
    
    ThreadLifeCycle(String threadName) {
        this.threadName = threadName;
    }
    
    public void run() {
        Random rand = new Random();
        int sTime = rand.nextInt(5000);
        System.out.println(threadName + " is created.");
        System.out.println("Sleep time of " + threadName + " is: " + sTime + "ms.");
        try {
            Thread.sleep(sTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadLifeCycle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(threadName + " is dead.");
    }
}

public class S13Q2 {
    public static void main(String[] args) {
        ThreadLifeCycle t1 = new ThreadLifeCycle("First");
        ThreadLifeCycle t2 = new ThreadLifeCycle("Second");
        ThreadLifeCycle t3 = new ThreadLifeCycle("Third");
        
        t1.start();
        t2.start();
        t3.start();
    }
}

  */