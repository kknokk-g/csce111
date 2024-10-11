/*
 * Grace Du
 * UIN 332005944
 * CSCE 111 SEC 506
 * CardDeck.java
 * 10/06/2023
 * 
 */

public class CardDeck {

    public static void main(String[] args) {
        System.out.println("This is the deck of cards!"); // Print title of deck of cards

        String[] nums = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        String[] suits = new String[]{"H", "S", "C", "D"};

        int count = 0; // Track where should the card be in the deck
        String[] deck = new String[54]; // Array to hold the standard playing cards

        // Combine nums and suits together
        for (String suit : suits) {
            for (String num : nums) {
                String card = suit + num;
                deck[count] = card; // Add the card to the deck array
                count++;
            }
            deck[52] = "J0";//let jockers in deck
            deck[53] = "J1";//let jockers in deck
        }

        // Print the deck of cards using a for loop
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck[i] + " ");

            // let 13 cards in one line
            if ((i + 1) % 13 == 0) {
                System.out.println(); // Move to the next line
            }
        }
        int randnum = diceRoll();//get the random number
        String randcard = deck[randnum];//pick random card
        System.out.println("\nYour random card is " + randcard);
       
        String getnum = nums[randnum % 13];//get the num part of the card
        
        
        if((randcard.contains("D")&& (getnum!= "A")&& (getnum!= "T")&& (getnum!= "J") && (getnum!= "Q" )&&(getnum!= "K"))){
        System.out.println("You got " + getnum +" Dimonds");//case with D and number between 1 and 9
    }
        else if((randcard.contains("C")&& (getnum!= "A")&& (getnum!= "T")&& (getnum!= "J") && (getnum!= "Q" )&&(getnum!= "K"))){
        System.out.println("You got " + getnum +" Cars");//case with C and number between 1 and 9
    }
        else if((randcard.contains("S")&& (getnum!= "A")&& (getnum!= "T")&& (getnum!= "J") && (getnum!= "Q" )&&(getnum!= "K"))){
        System.out.println("You wrote " + getnum +" Sentences");//case with S and number between 1 and 9
    }
        else if((randcard.contains("H")&& (getnum!= "A")&& (getnum!= "T")&& (getnum!= "J") && (getnum!= "Q" )&&(getnum!= "K"))){
        System.out.println("You got " + getnum +" Houses");//case with S and number between 1 and 9
    }
     else if(randcard.contains("A")){
        System.out.println("You got a level A");//case of A
    }

     else if(randcard.equals("J0") || randcard.equals("J1")){
        System.out.println("You found the jocker ");//case of jockers
    }
    else if(randcard.contains("T") || randcard.contains("J") || randcard.contains("Q") || randcard.contains("K")){
        System.out.println("You got a kindom! ");//case of T J Q K
    }
       

    }
    public static int diceRoll() {//get random number
        return 1 + (int)(Math.random() * 54);
    }
}


