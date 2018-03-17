//*********************
// BlackJack Class
//-------------------------
// Write a program that allows a human user to play a simplified version of Blackjack against a computer opponent. 
//*********************

import java.util.Scanner;

public class BlackJack { // Start BlackJack Class
    /*************************************************************************************
     *   Main Method
     * ------------------------------------------------------------------------------------
     *   Plays BlackJack
     * ***********************************************************************************/
    public static void main(String[] args) { //Start Main

        String name = "Tatenda Ndambakuwa";
        System.out.println(name);
        System.out.println("CMSC255 Section 2");
        System.out.println("Project 3");
        System.out.println("Welcome to Blackjack.");

        Scanner in = new Scanner(System.in); //  Intialize in variable as input buffer
        boolean play = true; //playing game is always true unless otherwise
        boolean playAgain = true; //playAgain is always true unless otherwise

        while (playAgain) {
/************************************************************************************
 *   Declare Variables:
 *   personCards -    the first card a person picks
 *   personCards2 -   the second card a person picks
 *   personTotal-     total value of person cards picked: personCards+ personCards2
 *   computerCards-   the first card a computer picks
 *   computerCards2-  the second card a computer picks
 *   computerTotal-   total value of computer cards picked: computerCards+computerCards2
 *   nextPlayerCard-  the third card a person picks
 *
 ************************************************************************************/
// initiating values
            int personCards = 0; //input randomly generated from values (2 to 11)
            int computerCards = 0; //input randomly generated from values (2 to 11)
            int personCards2 = 0; //input randomly generated from values (2 to 11)
            int computerCards2 = 0; //input randomly generated from values (2 to 11)
            int computerTotal = 0;  //output from adding computerCards + computerCards2
            int personTotal = 0;   //output from adding personCards + personCards2
            int nextPlayerCard = 0; //input randomly generated from values (2 to 11)


//Dealing the person's cards
            // Random generation of integer values from (2 to 11)
            computerCards = (int) (Math.random() * 10) + 2;
            computerCards2 = (int) (Math.random() * 10) + 2;
            personCards = (int) (Math.random() * 10) + 2;
            personCards2 = (int) (Math.random() * 10) + 2;

            play = true; //playing game is always true unless otherwise

            // showing the value of cards the person received
            System.out.println("You got a " + personCards + " and a " + personCards2);
            // showing the total value of cards the person received by adding the two values on the cards
            personTotal = personCards + personCards2;
            System.out.println("Your total is " + personTotal);
            
// showing the value of cards the dealer(computer) received
            System.out.println("Dealer got a " + computerCards + " and a hidden card");
            computerTotal = computerCards + computerCards2;

            /* asking whether person wants to hit or stay if they want to play */
            while (personTotal < 21 && play == true) //start while
            {
                System.out.print("Would you like to hit 'h' or stay 's'?");

// ask if person wants a card
                char wantCard = in.next().charAt(0);
                if (wantCard == 'H' || wantCard == 'h') // start if else
                {
                    play = true;
                } else {
                    play = false;
                } //end if else
// if person wants to play show the value of the card and add that value to person total to get a new value for person total
                if (play == true) {
                    nextPlayerCard = (int) (Math.random() * 10) + 2;
                    personTotal = nextPlayerCard + personTotal;
                    System.out.println("You drew a " + nextPlayerCard);
                    System.out.println("Your total is " + personTotal);

                }
            } // end while

// dealer's card reveals hidden card and computer calculates values for computer cards total value
            System.out.println("Okay dealer's turn.");
            System.out.println("His hidden card was a " + computerCards2);
            System.out.println("His total was " + computerTotal);

            /* dealer choosing to hit or stay
             * when dealer less than or equal to 17
             * and computer total is less than person total and personal total is less than or equal to twenty one
             * You win the game
             * if the above is not true, you lose the game
             */

            while (computerTotal <= 17 && computerTotal < personTotal && personTotal <= 21) //start while
            {
                System.out.println("Dealer chooses to hit.");
                computerCards = (int) (Math.random() * 10) + 2;
                System.out.println("He draws " + computerCards);
                computerTotal = computerCards + computerTotal;
                System.out.println("His total is " + computerTotal);

            } // end while
            
// calculates total and notifies if person won or lost
            
            System.out.println("Dealer stays.");
            System.out.println("Dealer total is " + computerTotal);
            System.out.println("Your total is " + personTotal);
            if (personTotal <= 21 && computerTotal < personTotal && computerTotal > 21) //start if else statement
            {
                System.out.println("You win.");
            } else {
                System.out.println("You lose.");
            } //end if else

// asks person if they want to play again
            System.out.println("want to play again? If no, enter 'N', otherwise we'll keep playing");

            char again = in.next().charAt(0);
            if (again == 'N' || again == 'n') //start if statement
            {
                playAgain = false;
            } // end if
        } // end playAgain
    } // end main
} //end class BlackJack

    
