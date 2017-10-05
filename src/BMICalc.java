import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print(
                "\n input your weight in kilos: "
        );
        int weight = input.nextInt();

        System.out.print(
                "\n input height in meters: "
        );
        double height = input.nextDouble();

        System.out.print(
                "\n the BMI for a person who is "
                + height +
                " meters high, and weighs "
                + weight +
                " is: "
                + (weight / (height*height))
        );

    }
}
