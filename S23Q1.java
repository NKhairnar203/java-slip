/*
 
import java.util.Scanner;
import java.util.logging.*;

public class S23Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any string:");
        String str = sc.nextLine();
        
        Thread t = new Thread(() -> {
            for(int i=0; i<str.length(); i++) {
                String str2 = str.toLowerCase();
                char ch = str2.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(S18Q1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("3 seconds are passed....");
                }
            }
        });
        
        t.start();
    }
}

 */



 /*
  
 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class S23Q2 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        
        if(args.length == 0) {
            System.out.println("Please provide at least one argument..");
            return;
        }
        
        for(String name: args)
            names.add(name);
        
        System.out.println("Traversing using Iterator");
        Iterator itr = names.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
        System.out.println("Traversing using ListIterator");
        ListIterator lItr = names.listIterator();
        while(lItr.hasPrevious())
            System.out.println(lItr.previous());
    }
}

  */