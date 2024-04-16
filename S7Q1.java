/*
 
import java.util.Random;
import java.util.logging.*;

class NumGenerator implements Runnable {
    Random rand = new Random();
    int n;

    @Override
    public void run() {
        while(true) {
            n = rand.nextInt(100);
            System.out.println("Generated number: " + n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NumGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class SqrGenerator implements Runnable {
    NumGenerator numGenerator;
    
    SqrGenerator(NumGenerator numGenerator) {
        this.numGenerator = numGenerator;
    }
    
    @Override
    public void run() {
        while(true) {
            int n = numGenerator.n;
            if(n % 2 == 0)
                System.out.println("Square of " + n + " is " + n*n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SqrGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class CubeGenerator implements Runnable {
    NumGenerator numGenerator;
    int n;
    
    CubeGenerator(NumGenerator numGenerator) {
        this.numGenerator = numGenerator;
    }
    
    @Override
    public void run() {
        while(true) {
            int n = numGenerator.n;
            if(n % 2 != 0)
                System.out.println("Cube of " + n + " is " + n*n*n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CubeGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

public class S7Q1 {
    public static void main(String[] args) {
        NumGenerator numGenerator = new NumGenerator();
        Thread t1 = new Thread(numGenerator);
        t1.start();
        
        SqrGenerator sqrGenerator = new SqrGenerator(numGenerator);
        Thread t2 = new Thread(sqrGenerator);
        t2.start();
        
        CubeGenerator cubeGenerator = new CubeGenerator(numGenerator);
        Thread t3 = new Thread(cubeGenerator);
        t3.start();
    }
}
 */


 
/*
 
import java.sql.*;
import java.util.Scanner;

public class S7Q2 {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        
        int ch;
        do {
            System.out.println("Menu");
            System.out.println("1. Create table Product.");
            System.out.println("2. Insert into Product.");
            System.out.println("3. Display records of product.");
            System.out.println("4. Exit.");
            
            System.out.println("------------------------------");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            
            switch(ch) {
                case 1: create(conn);
                    break;
                case 2: insert(conn);
                    break;
                case 3 : select(conn);
                    break;
                default : System.out.println("Invalid choice.");
                    break;
            }
        } while(ch != 4);
    }

    private static void create(Connection conn) throws SQLException {
        String sql = "create table if not exists product("
                        + "pid int primary key,"
                        + "pname varchar(30),"
                        + "price decimal(10, 2))";
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
    }

    private static void insert(Connection conn) throws SQLException {
        String sql = "insert into product values(?, ?, ?)";
        
        PreparedStatement pt = conn.prepareStatement(sql);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter pid:");
        int pid = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter pname:");
        String name = sc.nextLine();
        
        System.out.println("Enter price");
        float price = sc.nextFloat();
        
        pt.setInt(1, pid);
        pt.setString(2, name);
        pt.setFloat(3, price);
        pt.executeUpdate();
    }

    private static void select(Connection conn) throws SQLException {
        String sql = "select * from product";
        Statement stmt = conn.createStatement();
        stmt.executeQuery(sql);
        ResultSet res = stmt.getResultSet();
        
        while(res.next()) {
            System.out.println("Pid = " + res.getInt("pid"));
            System.out.println("PName = " + res.getString("pname"));
            System.out.println("Price = " + res.getFloat("price"));
            System.out.println("----------------------------------------------");
        }
    }
}
 */

