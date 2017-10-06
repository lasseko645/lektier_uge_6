import java.util.Scanner;

public class Rocks {
    public static void main(String[] args) {



        int robotChoice = (int) (Math.random()*3);      //here i define my random value variable robotChoise

        Scanner sure = new Scanner(System.in);          // here i make SURE that the scanner will work, pun intended



        System.out.print( "\n choose one of the following options to play this game with me " +     // here i print the info about my primitive game
                "\n (0) scissors, (1) rocks, (2) paper, : ");                                       // here is the rest
        int playersChoise = sure.nextInt();                                                         // here is the input from the user defined into a variable playersChoise

        if (robotChoice == playersChoise){                                      // her i start my programs rules for what outcome comes out, and start by stating what happens if its a draw

            System.out.println("Its a draw !! Fun times... nobody WINS !!!");   // here i just print out the info to the unfortunate soul
        } else {                                                                // here i state that if its not a draw somthing else will execute
            boolean outcome =       (playersChoise == 0 && robotChoice == 2)    // i went back and forth about this .. but i feel that its only nessecary for the program to have the rules defined if its not a draw, so i ended up making it like this
                                ||  (playersChoise == 1 && robotChoice == 0)    // these 3 lines are just stating the different parameters that would make my boolean variable outcome true
                                ||  (playersChoise == 2 && robotChoice == 1);

                    if (outcome == true){                                       // here i make use of the outcome variable, to determine if the game was won or not

                        System.out.println("You did it!!! good job ^_^.. you're de best one");      // yay you win

                    } else {                                                                            // or

                        System.out.println("you suck.. you fail, come back when you don't suck as bad..."); // boo you lose

                    }




        }


    }


}
