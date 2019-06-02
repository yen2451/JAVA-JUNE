import java.util.Scanner;

public class switchcase {
    public static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            int b = a % 2;
            switch (b) {
            case 1:
                System.out.println("it's an odd number'");
                break;
            case 0:
                System.out.println("it's an even number");
                break;
            }
            System.out.println("type in the next number..");

        }
        
        
    }
}