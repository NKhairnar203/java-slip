
import java.awt.Color;
import java.util.Random;
import javax.swing.*;

class BlinkText implements Runnable {
    private JFrame frame;
    private JLabel blink;
    
    public BlinkText() {
        frame = new JFrame("Blink Light");
        frame.setSize(200, 200);
        blink = new JLabel("Blink");
        frame.add(blink);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void run() {
        Random rand = new Random();
        while(true) {
            int r = rand.nextInt(255);
            int g = rand.nextInt(255);
            int b = rand.nextInt(255);
            blink.setForeground(new Color(r, g, b));
        }
    }
}

public class S4Q1 {
    public static void main(String[] args) {
        Thread t = new Thread(new BlinkText());
        t.start();
    }
}


/*
 
import java.util.*;

public class S4Q2 {
    public static void main(String[] args) {
        Map<String, String> cityMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        int ch;
        String code, city;
        do {
            System.out.println("Menu");
            System.out.println("1. Add City and std code.(no duplicates)");
            System.out.println("2. Remove City.");
            System.out.println("3. Search city name dsiplay std code");
            System.out.println("4. Exit");
            
            System.out.println("------------------------------");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            switch(ch) {
                case 1: System.out.println("Enter std code.");
                    code = sc.nextLine();
                    System.out.println("Enter City.");
                    city = sc.nextLine();
                    cityMap.put(code, city);
                    break;
                case 2: System.out.println("Enter std code.");
                    code = sc.nextLine();
                    cityMap.remove(code);
                    break;
                case 3: System.out.println("Enter city:");
                    city = sc.nextLine();
                    code = null;
                    for(Map.Entry<String, String> map : cityMap.entrySet()) {
                        if(map.getValue().equals(city))
                            code = map.getKey();
                    }
                    if(code != null)
                        System.out.println("Code is " + code);
                    else
                        System.out.println("Not found.");
                    break;
                default: System.out.println("Invalid choice.");
            }
            System.out.println("-------------------------------");
        } while(ch != 4);
    }
}

 */