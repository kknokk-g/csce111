import java.util.Scanner;
/*
 * Grace Du
 * UIN 332005944
 * CSCE 111 SEC 506
 * NameGame
 * 09/14/2023
 * 
 */

public class NameGame {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("The Name Game!");
        System.out.println("\n\n");
        System.out.println("Come on everybody, I said now lets play a game.\r\n" + //
                "I bet'cha I could make a rhyme\r\n" + //
                "Out of anybody's name...");
        System.out.println("\n");
        System.out.printf("What is your name?");
        String name = input.next();
        
        System.out.printf("\n\nHowdy " + name + "!");
        System.out.println("");
        
        
        
        


        String first_letter = name.substring(0,1);
        String second_letter = name.substring(1,2);
        name = name.toUpperCase();
        //System.out.println(first_letter);
        //System.out.println(second_letter);
     
        
        if (name.contains("itch") || name.contains("uck") || name.contains("ITCH") || name.contains("UCK")) {
            System.out.println("\n\nSorry " + name.toUpperCase() + ", but you can't play this game.");
            System.out.print("\u0007");
            System.exit(0);
        }
        
    //mart    
    else if (name.contains("art") || name.contains("Art") || name.contains("ART")){
        System.out.printf("\n\nHowdy, this name can be embarrassing for some users, would you like to continue? Type yes or no\n");   
        String answer = input.next();
        
            if (answer.equals("No") || answer.equals("no") || answer.equals("NO")){
                System.exit(0);
            }
            else if (answer.equals("Yes") || answer.equals("YES") || answer.equals("yes")){
               
             if (((first_letter.equals(("B")) || first_letter.equals(("b")))) && ((second_letter.equals("a") || second_letter.equals("e") || second_letter.equals("i") || second_letter.equals("o") || second_letter.equals("u"))|| (second_letter.equals("A") || second_letter.equals("E") || second_letter.equals("I") || second_letter.equals("O") || second_letter.equals("U")))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-" + name.substring(1, name.length()) );
                    System.out.println("Banana fana fo-F" + name.substring(1, name.length()));
                    System.out.println("fe fi mo-M" + name.substring(1, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                    }
                else if (first_letter.equals(("B")) || first_letter.equals(("b"))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-B" + name.substring(2, name.length()));
                    System.out.println("Banana fana fo-" + name.substring(2, name.length()));
                    System.out.println("fe fi mo-M" + name.substring(2, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                    
                }
                else if (((first_letter.equals(("F")) || first_letter.equals(("f")))) && ((second_letter.equals("a") || second_letter.equals("e") || second_letter.equals("i") || second_letter.equals("o") || second_letter.equals("u"))|| (second_letter.equals("A") || second_letter.equals("E") || second_letter.equals("I") || second_letter.equals("O") || second_letter.equals("U")))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-" + name.substring(1, name.length()) );
                    System.out.println("Banana fana fo-F" + name.substring(1, name.length()));
                    System.out.println("fe fi mo-M" + name.substring(1, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                    }
                else if (first_letter.equals(("F")) || first_letter.equals(("f"))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-B" + name.substring(2, name.length()));
                    System.out.println("Banana fana fo-" + name.substring(2, name.length()));
                    System.out.println("fe fi mo-M" + name.substring(2, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                }   
                
                else if (((first_letter.equals(("M")) || first_letter.equals(("m")))) && ((second_letter.equals("a") || second_letter.equals("e") || second_letter.equals("i") || second_letter.equals("o") || second_letter.equals("u"))|| (second_letter.equals("A") || second_letter.equals("E") || second_letter.equals("I") || second_letter.equals("O") || second_letter.equals("U")))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-B" + name.substring(1, name.length()) );
                    System.out.println("Banana fana fo-F" + name.substring(1, name.length()));
                    System.out.println("fe fi mo-" + name.substring(1, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                    }
                else if (first_letter.equals(("M")) || first_letter.equals(("m"))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-B" + name.substring(2, name.length()));
                    System.out.println("Banana fana fo-F" + name.substring(2, name.length()));
                    System.out.println("fe fi mo-M" + name.substring(2, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                }   

                
                else if (first_letter.equals("A") || first_letter.equals("E") || first_letter.equals("I") || first_letter.equals("O") || first_letter.equals("U") || first_letter.equals(("a")) || first_letter.equals(("e")) || first_letter.equals(("i")) || first_letter.equals(("o")) || first_letter.equals(("u"))) {
                    if ((second_letter.equals("a") || second_letter.equals("e") || second_letter.equals("i") || second_letter.equals("o") || second_letter.equals("u") || second_letter.equals("A") || second_letter.equals("E") || second_letter.equals("I") || second_letter.equals("O") || second_letter.equals("U")) && ((first_letter.equals("A") || first_letter.equals("E") || first_letter.equals("I") || first_letter.equals("O") || first_letter.equals("U") || (first_letter.equals("a")) || (first_letter.equals("e")) || (first_letter.equals("i")) || (first_letter.equals("o")) || (first_letter.equals("u"))))) {
                        System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                        System.out.println(" ");
                        System.out.println(name + " " + name + " bo-b" + name.substring(1, name.length()));
                        System.out.println("Banana fana fo-F" + name.substring(1, name.length()));
                        System.out.println("fe fi mo-M" + name.substring(1, name.length()));
                        System.out.println(name + "!");   
                        System.out.println("\n");
                        System.out.println("Thank you for playing, " + name +"!");
                    }//double vowel
                    else if (first_letter.equals("A") || first_letter.equals("E") || first_letter.equals("I") || first_letter.equals("O") || first_letter.equals("U") || (first_letter.equals("a")) || (first_letter.equals("e") || (first_letter.equals("i")) || (first_letter.equals("o")) || (first_letter.equals("u")))) {
                        System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                        System.out.println(" ");
                        System.out.println(name + " " + name + " bo-b" + name);
                        System.out.println("Banana fana fo-F" + name);
                        System.out.println("fe fi mo-M" + name);
                        System.out.println(name + "!");
                        System.out.println("\n");
                        System.out.println("Thank you for playing, " + name +"!");
                    }//single vowel
                }
                else if (!first_letter.equals("B") || !first_letter.equals("F") || !first_letter.equals("M") || !first_letter.equals("b") || !first_letter.equals("f") || !first_letter.equals("m")){//start with consonant
                    if ((second_letter.equals("a") || second_letter.equals("e") || second_letter.equals("i") || second_letter.equals("o") || second_letter.equals("u") || second_letter.equals("A") || second_letter.equals("E") || second_letter.equals("I") || second_letter.equals("O") || second_letter.equals("U"))){
                        System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(name + " " + name + " bo-B" + name.substring(1, name.length()));
                        System.out.println("Banana fana fo-F" + name.substring(1, name.length()));
                        System.out.println("fe fi mo-M" + name.substring(1, name.length()));    
                        System.out.println(name + "!");
                        System.out.println("\n");
                        System.out.println("Thank you for playing, " + name +"!");
                    }//single consonant
                    else if (name.equals("Grace")){
                        System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("HAHA you got the same name as me :)");
                        System.out.println(name + " " + name + " bo-B" + name.substring(2, name.length()));
                        System.out.println("Banana fana fo-F" + name.substring(2, name.length()));
                        System.out.println("fe fi mo-M" + name.substring(2, name.length())); 
                        System.out.println(name + "!");  
                        System.out.println("\n");
                        System.out.println("Thank you for playing, " + name +"!");
                    }
                    else{
                        System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                        System.out.println(" ");
                        System.out.println(name + " " + name + " bo-B" + name.substring(2, name.length()));
                        System.out.println("Banana fana fo-F" + name.substring(2, name.length()));
                        System.out.println("fe fi mo-M" + name.substring(2, name.length()));  
                        System.out.println(name + "!"); 
                        System.out.println("\n");
                        System.out.println("Thank you for playing, " + name +"!");
                    }//double consonant
                }System.out.println("\n"); 
                 System.exit(0); 

            
        }   
    }
    else{
        
                if (((first_letter.equals(("B")) || first_letter.equals(("b")))) && ((second_letter.equals("a") || second_letter.equals("e") || second_letter.equals("i") || second_letter.equals("o") || second_letter.equals("u"))|| (second_letter.equals("A") || second_letter.equals("E") || second_letter.equals("I") || second_letter.equals("O") || second_letter.equals("U")))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-" + name.substring(1, name.length()) );
                    System.out.println("Banana fana fo-F" + name.substring(1, name.length()));
                    System.out.println("fe fi mo-M" + name.substring(1, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                    }
                else if (first_letter.equals(("B")) || first_letter.equals(("b"))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-B" + name.substring(2, name.length()));
                    System.out.println("Banana fana fo-" + name.substring(2, name.length()));
                    System.out.println("fe fi mo-M" + name.substring(2, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                    
                }
                else if (((first_letter.equals(("F")) || first_letter.equals(("f")))) && ((second_letter.equals("a") || second_letter.equals("e") || second_letter.equals("i") || second_letter.equals("o") || second_letter.equals("u"))|| (second_letter.equals("A") || second_letter.equals("E") || second_letter.equals("I") || second_letter.equals("O") || second_letter.equals("U")))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-" + name.substring(1, name.length()) );
                    System.out.println("Banana fana fo-F" + name.substring(1, name.length()));
                    System.out.println("fe fi mo-M" + name.substring(1, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                    }
                else if (first_letter.equals(("F")) || first_letter.equals(("f"))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-B" + name.substring(2, name.length()));
                    System.out.println("Banana fana fo-" + name.substring(2, name.length()));
                    System.out.println("fe fi mo-M" + name.substring(2, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                }   
                
                else if (((first_letter.equals(("M")) || first_letter.equals(("m")))) && ((second_letter.equals("a") || second_letter.equals("e") || second_letter.equals("i") || second_letter.equals("o") || second_letter.equals("u"))|| (second_letter.equals("A") || second_letter.equals("E") || second_letter.equals("I") || second_letter.equals("O") || second_letter.equals("U")))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-B" + name.substring(1, name.length()) );
                    System.out.println("Banana fana fo-F" + name.substring(1, name.length()));
                    System.out.println("fe fi mo-" + name.substring(1, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                    }
                else if (first_letter.equals(("M")) || first_letter.equals(("m"))){
                    System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                    System.out.println(" ");
                    System.out.println(name + " " + name + " bo-B" + name.substring(2, name.length()));
                    System.out.println("Banana fana fo-F" + name.substring(2, name.length()));
                    System.out.println("fe fi mo-M" + name.substring(2, name.length()));
                    System.out.println(name + "!");
                    System.out.println("\n");
                    System.out.println("Thank you for playing, " + name +"!");
                    System.exit(0);
                }   

        else if (first_letter.equals("A") || first_letter.equals("E") || first_letter.equals("I") || first_letter.equals("O") || first_letter.equals("U") || first_letter.equals(("a")) || first_letter.equals(("e")) || first_letter.equals(("i")) || first_letter.equals(("o")) || first_letter.equals(("u"))) {
            if ((second_letter.equals("a") || second_letter.equals("e") || second_letter.equals("i") || second_letter.equals("o") || second_letter.equals("u") || second_letter.equals("A") || second_letter.equals("E") || second_letter.equals("I") || second_letter.equals("O") || second_letter.equals("U")) && ((first_letter.equals("A") || first_letter.equals("E") || first_letter.equals("I") || first_letter.equals("O") || first_letter.equals("U") || (first_letter.equals("a")) || (first_letter.equals("e")) || (first_letter.equals("i")) || (first_letter.equals("o")) || (first_letter.equals("u"))))) {
                System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                System.out.println(" ");
                System.out.println(name + " " + name + " bo-B" + name.substring(1, name.length()));
                System.out.println("Banana fana fo-F" + name.substring(1, name.length()));
                System.out.println("fe fi mo-M" + name.substring(1, name.length()));
                System.out.println(name + "!");   
            }//double vowel
            else if (first_letter.equals("A") || first_letter.equals("E") || first_letter.equals("I") || first_letter.equals("O") || first_letter.equals("U") || (first_letter.equals("a")) || (first_letter.equals("e") || (first_letter.equals("i")) || (first_letter.equals("o")) || (first_letter.equals("u")))) {
                System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                System.out.println(" ");
                System.out.println(name + " " + name + " bo-B" + name);
                System.out.println("Banana fana fo-F" + name);
                System.out.println("fe fi mo-M" + name);
                System.out.println(name + "!");
            }//single vowel
            
        }
        else{//start with consonant
            if ((second_letter.equals("a") || second_letter.equals("e") || second_letter.equals("i") || second_letter.equals("o") || second_letter.equals("u") || second_letter.equals("A") || second_letter.equals("E") || second_letter.equals("I") || second_letter.equals("O") || second_letter.equals("U"))){
                System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                System.out.println(" ");
                System.out.println(name + " " + name + " bo-B" + name.substring(1, name.length()));
                System.out.println("Banana fana fo-F" + name.substring(1, name.length()));
                System.out.println("fe fi mo-M" + name.substring(1, name.length()));    
                System.out.println(name + "!");
            }//single consonant
            else if (name.equals("Grace")){
                System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                System.out.println(" ");
                System.out.println("HAHA you got the same name as me :)");
                System.out.println(name + " " + name + " bo-B" + name.substring(2, name.length()));
                System.out.println("Banana fana fo-F" + name.substring(2, name.length()));
                System.out.println("fe fi mo-M" + name.substring(2, name.length())); 
                System.out.println(name + "!");  
            }
            else{
                System.out.println("\n\nOkay " + name.toUpperCase() +", here is your rhyme:");
                System.out.println(" ");
                System.out.println(name + " " + name + " bo-B" + name.substring(2, name.length()));
                System.out.println("Banana fana fo-F" + name.substring(2, name.length()));
                System.out.println("fe fi mo-M" + name.substring(2, name.length()));  
                System.out.println(name + "!"); 
            }//double consonant
        }System.out.println("\n");
         System.out.println("Thank you for playing, " + name +"!"); 
    
    }
}
}

