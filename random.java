import java.util.*;

public class random{
    public static void main(String[] args) {
        //-->start here
        try {
            Random ran = new Random();
            Scanner scan = new Scanner(System.in);
            int pointUser = scan.nextInt();
            int pointA = ran.nextInt(6) + 1;
            // int pointB = ran.nextInt(6) + 1;
            System.out.println("AI:" + pointA);
            System.out.println("user:" + pointUser);
            // System.out.println(pointB);
            if (pointA == pointUser)
                System.out.println("even");
            else {
                System.out.println(pointA > pointUser ? "AI" : "user");
            }
            scan.close();
            
        } catch (Exception e) {
            System.out.println("you are an asshole..");
        }//int pointuser;
        
    }
}