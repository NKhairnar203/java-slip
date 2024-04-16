/*
 
import java.sql.*;

public class S29Q1 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        
        String sql = "select * from donar";
        
        Statement stmt = conn.createStatement();
        stmt.executeQuery(sql);
        
        ResultSet rs = stmt.getResultSet();
        ResultSetMetaData rsmd = rs.getMetaData();
        
        int colCnt = rsmd.getColumnCount();
        System.out.println("Donar table Meta Data:");
        for(int i=1; i<colCnt; i++) {
            String colName = rsmd.getColumnName(i);
            String colType = rsmd.getColumnTypeName(i);
            int colSize = rsmd.getColumnDisplaySize(i);
            
            System.out.println(colName + " " + colType + "(" + colSize + ")");
        }
    }
}

 */



 /*
  
import java.util.*;

public class S29Q2 {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        int ch;
        
        do {
            System.out.println("Menu");
            System.out.println("1. Insert at head");
            System.out.println("2. Delete tail.");
            System.out.println("3. Display size");
            System.out.println("4. Exit");
            
            System.out.println("------------------------------");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            System.out.println();
            
            switch(ch) {
                case 1: System.out.println("Enter a number:");
                    l.addFirst(sc.nextInt());
                    break;
                case 2: l.removeLast();
                    break;
                case 3: 
                    System.out.println("Size : " + l.size() + "\n" + l);
                    break;
                default: System.out.println("Invalid choice.");
            }
            System.out.println("-------------------------------");
        } while(ch != 4);
    }
}

  */