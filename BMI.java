import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        float weight ;
        float height ;
        float weightkg ;
        float heightmeters ;
        float bmi ;

        System.out.println("Enter Weight in Pound : ");
        weight = scanner.nextFloat();

        System.out.println("enter height in Inch : ");
        height = scanner.nextFloat();

        weightkg = weight * 0.45359237f ;
        System.out.println("Weight in KG is :" + weightkg);
        heightmeters = height * 0.0254f;
        System.out.println("Height in Meters is :" + heightmeters);

        System.out.println("Height * Height is : " + (heightmeters * heightmeters));
        System.out.println("weightkg / (heightmeters * heightmeters)");

        bmi = weightkg / (heightmeters * heightmeters);
        System.out.println("BMI is :" + bmi);
        

        scanner.close();

    }
}
