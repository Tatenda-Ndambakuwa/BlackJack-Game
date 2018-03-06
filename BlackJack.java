//*********************
// BlackJack Class
//-------------------------
// author: Tatenda Ndambakuwa
// version: 02/28/2018 
// Spring 2018 CMSC255 Section 2
// BlackJack.Java
// Project 3: Write a program that allows a human user to play a simplified version of Blackjack against a computer opponent. 
//*********************

import java.util.Scanner;

/**
 * This program
 */

public class BlackJack {
    public static void main(String[] args) {
        String name = "Tatenda Ndambakuwa";
        System.out.println(name);
        System.out.println("CMSC255 Section 2");
        System.out.println("Project 3");
        System.out.println("Welcome to Blackjack.");

        Scanner in = new Scanner(System.in);
        boolean play = true;
        boolean playAgain = true;

        while (playAgain) {

// initiating values
            int personCards = 0;
            int computerCards = 0;
            int personCards2 = 0;
            int computerCards2 = 0;
            int computerTotal = 0;
            int personTotal = 0;
            int nextPlayerCard = 0;


//Dealing the person's cards
            computerCards = (int) (Math.random() * 10) + 2;
            computerCards2 = (int) (Math.random() * 10) + 2;
            personCards = (int) (Math.random() * 10) + 2;
            personCards2 = (int) (Math.random() * 10) + 2;


//Cards received

            System.out.println("You got a " + personCards + " and a " + personCards2);
            personTotal = personCards + personCards2;
            System.out.println("Your total is " + personTotal);

            System.out.println("Dealer got a " + computerCards + " and a hidden card");
            computerTotal = computerCards + computerCards2;

            //player wants to hit or stay
            while (personTotal < 21 && play == true) {
                System.out.print("Would you like to hit 'h' or stay 's'?");

                char wantCard = in.next().charAt(0);
                if (wantCard == 'H' || wantCard == 'h') {
                    play = true;
                } else {
                    play = false;
                }

                if (play == true) {
                    nextPlayerCard = (int) (Math.random() * 10) + 2;
                    personTotal = nextPlayerCard + personTotal;
                    System.out.println("You drew a " + nextPlayerCard);
                    System.out.println("Your total is " + personTotal);

                }
            } // end while


            System.out.println("Okay dealer's turn.");
            System.out.println("His hidden card was a " + computerCards2);
            System.out.println("His total was " + computerTotal);



            /* dealer choosing to hit or stay
             * dealer less than or equal to 17 and dealer total is less than
             *
             */
            while (computerTotal <= 17 && computerTotal < personTotal && personTotal <= 21) {
                System.out.println("Dealer chooses to hit.");
                computerCards = (int) (Math.random() * 10) + 2;
                System.out.println("He draws " + computerCards);
                computerTotal = computerCards + computerTotal;
                System.out.println("His total is " + computerTotal);

            } // end while

            System.out.println("Dealer stays.");
            System.out.println("Dealer total is " + computerTotal);
            System.out.println("Your total is " + personTotal);
            if (personTotal <= 21 && computerTotal < personTotal && computerTotal > 21) {
                System.out.println("You win.");
            } else {
                System.out.println("You lose.");
            }


            System.out.println("want to play again? If no, enter 'N', otherwise we'll keep playing");

            char again = in.next().charAt(0);
            if (again == 'N' || again == 'n') {
                playAgain = false;
            } // end if
        }
    }
}

    
