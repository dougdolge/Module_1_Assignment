package edu.wctc;
import java.io.FilterWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
// First lets define the variables that we will need
        String[] choices = {"Mild or Spicy", "tea or coffee", "breakfast or brunch", "summer or winter", "paper or plastic"};
        int accuumresponces = 0;
        boolean isValid = false;
        int responce = 0;
        Scanner keyboard = new Scanner(System.in);

        // Now we need to display choices to keyboard operator, get their responce, validate their responce and accunulate the total value of their valid chpooices.
        // We want to handle each choice individually
        boolean tryAgain = true;
        char yorn = 'N';
        // while(tryAgain == true); {
do {
    for (String i : choices) {

        System.out.println(i);
        //  We will stay in this do loop until we get a user answer (valid answers are 0 and 1)
        do {

            System.out.println("Please enter a 0 to select the first choice or a 1 to select the second");
            responce = Integer.parseInt(keyboard.nextLine());
            if (responce == 0) {
                isValid = true;
            } else if (responce == 1) {
                isValid = true;
            } else {
                isValid = false;
                System.out.println("Come on how hard hard is it to choose a 0 or 1");
            }
        }
        // if the answer was not valid execute the do loop again
        while (isValid == false);  //end do loop
// OK we got a valid answer add the value in responce to the accumulator

        accuumresponces = accuumresponces + responce;
        isValid = false;
    } // end for loop
    // This set shouldn't be needed but something strange is going on in the loop so just to be sure
    // we are going to set isValid to false
    // increment the index and go display the next item in choices.


    if (accuumresponces < 3) {
        System.out.println("You are laid back");
    } else if (accuumresponces < 5) {
        System.out.println("You are a go getter");
    } else {
        System.out.println("Settle down or you will have a heart attack");
    }
    System.out.println("Would you like to try again Y for yes");
    String yornt = keyboard.nextLine();
    // String yornt = " ";
    // yornt = yornt.valueOf(yorn);

    if (yornt.toUpperCase().trim().equals("Y")) {
        tryAgain = true;
    } // end if
    else {
        tryAgain = false;
    } // end else
} // end do loop
            while (tryAgain);
            // } // end while loop
    } // end method main
} // end class