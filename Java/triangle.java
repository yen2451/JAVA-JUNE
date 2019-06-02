import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        // -->start here
        float a, b, c;
        System.out.println("please type in the longest side of the triagle...");
        try {
            Scanner scan = new Scanner(System.in);
            c = scan.nextFloat();
            System.out.println("then the other two side...");
            a = scan.nextFloat();
            b = scan.nextFloat();
            while (!(a + b > c) || !(a - b < c)) {
                System.out.println("the three side CANNOT make a triangle,please checkup if there's any mistake.");
                System.out.print("current variety: \n" + a + "\n" + b + "\n" + c);
                System.out.println("\nplease make sure that if there's any mistake!!");
                System.out.print("the longest side is -->");
                scan = new Scanner(System.in);
                c = scan.nextFloat();
                System.out.println("\nthen the other two side are");
                System.out.print("-->");

                a = scan.nextFloat();
                System.out.print("\n-->");
                b = scan.nextFloat();
            }
            scan.close();
            System.out.print("the kind of triangle is ");
            if (a == b && b == c && a == c) {
                System.out.println("regular triangle");
            } else if (c * c == a * a + b * b) {
                if (a == b || b == c || c == a)
                    System.out.println("isosceles ");
                System.out.println("right triangle");
            } else if (c * c > a * a + b * b) {
                System.out.println("obtuse triangle");
            } else
                System.out.println("acute triangle");

        } catch (Exception e) {
            System.out.println("there might be some error");
        }

        // scan.close();

    }
}