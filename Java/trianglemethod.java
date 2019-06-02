import java.util.Scanner;

public class trianglemethod {
    public static float a, b, c;
    public static Scanner scan = new Scanner(System.in);

    static float scanchecker(float a,float b, float c) {
        while (!(a + b > c) || !(a - b < c)) {
            System.out.println("the three side CANNOT make a triangle,please checkup if there's any mistake.");
            System.out.print("current variety: \n" + a + "\n" + b + "\n" + c);
            System.out.println("\nplease make sure that if there's any mistake!!");
            System.out.print("the longest side is -->");
            scan = new Scanner(System.in);
            c = scan.nextFloat();
            System.out.println("\nthen the other two side are");
            System.out.print("-->");
            b = scan.nextFloat();
            System.out.print("\n-->");
            a = scan.nextFloat();
        }
        return 1f;
    }
    public static void main(String[] args) {
        // -->start here
        float a, b, c;
        System.out.println("please type in the longest side of the triagle...");
        try {
            //input state    
            c = scan.nextFloat();
            System.out.println("then the other two side...");
            a = scan.nextFloat();
            b = scan.nextFloat();
            //check the input whether valid
            scanchecker(a,b,c);
            scan.close();
            //output the kind of triangle
            System.out.print("the kind of triangle is ");

            if (c * c == a * a + b * b) {
                if (a == b || b == c || c == a)
                    System.out.println("isosceles ");
                System.out.println("right triangle");
            } else if (c * c > a * a + b * b) {
                System.out.println("obtuse triangle");
            } else
                System.out.println("acute triangle");

        } catch (Exception e) {
            System.out.println("there might be some error, please restart the program.");
        }

        // scan.close();

    }
}