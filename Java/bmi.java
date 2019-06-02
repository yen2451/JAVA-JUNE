import java.math.BigDecimal;
import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        // -->start here
        double bodyindex;
        System.out.println("BMI calculator");
        System.out.println();
        System.out.println("please type in your height (cm) !");
        Scanner myobj = new Scanner(System.in);
        double height = myobj.nextInt();

        System.out.println("please type in your weight (kg) !");
        Scanner myobj2 = new Scanner(System.in);
        double weight = myobj2.nextInt();

        height /= 100;
        bodyindex = weight / (height * height);
        BigDecimal abmi= new BigDecimal(bodyindex);
        abmi = abmi.setScale(2, BigDecimal.ROUND_HALF_UP);
        float bmi=abmi.floatValue();
        System.out.println("your BMI is " + bmi);
        System.out.print("your body status is ");
        if (bmi>=24)System.out.println("''Over weight!''");

        if (bmi < 24 && bmi >= 18.5)
            System.out.println("in Normal range!");
        if (bmi < 18.5)
            System.out.print("'Too Thin!");
        myobj.close();
        myobj2.close();
    }
}