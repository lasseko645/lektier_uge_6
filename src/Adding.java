import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {                    // main method

        double totalValues = 0.0;                                    // deklaring the varoable that will be used to display the total value
        double averageNum = 0.0;                                        // deklaring the variable that wil be used to keep track of the amount of numbers entered
        int playerInput = -1;                                   // deklaring the starting value to my input im not sure it nessecary to set it to -1 and do the if statement but it works
        int aboveZero = 0;                                      // deklaring the variable that keeps track of out values above 0
        int bellowZero = 0;                                     // deklaring the variable that keeps track of out values bellow 0

        Scanner input = new Scanner(System.in);                 // i make my scanner work


        while (playerInput != 0) {                               // i start the while loop

            System.out.print("\n enter a whole number, you can end the program by writing a 0 : ");     // output to user

            playerInput = input.nextInt();                      // promt a input from user

            if (playerInput != 0) {

                totalValues = totalValues + playerInput;            // here i add the current inpu to the total

                averageNum = averageNum + 1;                              // here i add 1 to our average, for use in a later line of code

                //System.out.println("\n the current total is : " + totalValues);      // here i print out for the user, a line to help them keep track of the curent total

                if (playerInput < 0 ){                                          // here i state that if the input is negative then the pregram will add 1 to the amount of number bellow 0

                    bellowZero = bellowZero + 1;                                // i just define what happens here

                } else if (playerInput > 0){                                    // here i state that if its not bellow 0 but is above 0 then ill add one to the amout of numbers above zero

                    aboveZero = aboveZero + 1;                                  // here i just make it add 1 to aboveZero

                }

            }
        }

        double average = totalValues / averageNum;              // deklaring the variable that will make sure we can get the average

        System.out.println("the final total is : " + totalValues);       // here i print out the total to the user

        System.out.println("the average of your values are : " + (average));        // here i print out the average

        System.out.println("the amount of numbers above 0 is : " + aboveZero);      // here i print the amount of numbers above 0

        System.out.println("the amount of nombers bellow 0 is : " + bellowZero);    // here i print the amount of numbers bellow 0

    }
}

