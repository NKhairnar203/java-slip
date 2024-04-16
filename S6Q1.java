
/*
import java.util.*;

public class S6Q1 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many number:");
        int n = sc.nextInt();
        System.out.println("Eneter " + n + " values:");
        for(int i=0; i<n; i++)
            nums.add(sc.nextInt());
        
        System.out.println(nums);
        
        System.out.println("Enter key to search:");
        int key = sc.nextInt();
        if(nums.contains(key))
            System.out.println("Found.");
        else
            System.out.println("Not found.");
    }
} 
*/


/*
import java.util.logging.*;

class TrafficLight implements Runnable {
    String[] lights = {"Red", "Green", "Yellow"};
    
    @Override
    public void run() {
        int idx = 0;
        while(true) {
            System.out.println("Current Signal : " + lights[idx]);
            try {
                Thread.sleep(getDuration(lights[idx]) * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TrafficLight.class.getName()).log(Level.SEVERE, null, ex);
            }
            idx = (idx + 1) % lights.length;
        }
    }

    private int getDuration(String light) {
        switch(light) {
            case "Red": return 4;
            case "Green": return 7;
            case "Yellow": return 2;
            default : return 0;
        }
    }
    
}

public class S6Q2 {
    public static void main(String[] args) {
        Thread t = new Thread(new TrafficLight());
        t.start();
    }
}
 */