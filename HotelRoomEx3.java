import java.util.Scanner;
/*
 * Grace Du
 * UIN 332005944
 * CSCE 111 SEC 506
 * HotelRoomEx3
 * 09/21/2023
 * 
 */
public class HotelRoomEx3 {
    public static void main(String[] args) {
        // get start floor from user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the start floor: ");
        int startfloor = input.nextInt();

        if (3 <= startfloor && startfloor <= 6){
            System.out.println("Please enter the end floor: ");
            int endfloor = input.nextInt();
            // get end floor from user
            if ( endfloor < 22 ){
                System.out.println("Please enter the rooms: ");
                int endroom = input.nextInt();  
                // ger rooms from user
                System.out.println("Hotel Room Cleaning Roster\n");
                System.out.println("Room number\tCleaned");
                for (int floor = startfloor; floor <= endfloor; floor ++){
                    if (floor == 13){//skip 13th floor
                        continue;
                        
                    }
                    if (endfloor < 10){ //for floor less than 10
                        if (endroom < 10){
                            System.out.println(" ");
                            for (int room = 0; room <= endroom; room ++){
                                //loop from 0 to room number 
                                System.out.print(floor * 10);
                                System.out.println(room + "\t\t___"); //should print 3 digits
                            }
                        }
                        else if (endroom >= 10 && endroom < 100){ 
                            System.out.println(" ");
                            for (int room = 0; room < 10; room ++){
                                System.out.print(floor * 10);
                                System.out.println(room + "\t\t___"); 
                            }
                            for (int room = 10; room <= endroom; room ++){
                                System.out.print(floor);
                                System.out.println(room + "\t\t___");   
                            }

                    }
                        else if (endroom >= 100){
                            System.out.println(" ");
                            for (int room = 0; room < 10 ; room ++){
                                System.out.print(floor * 100);
                                System.out.println(room + "\t\t___"); 
                             
                            }
                            for (int room = 10; room < 100 ; room ++){
                                System.out.print(floor * 10);
                                System.out.println(room + "\t\t___"); 
                            }
                            for (int room = 100; room < endroom ; room ++){
                                System.out.print(floor * 1);
                                System.out.println(room + "\t\t___");
                            }
                    }
                        

                    }
                    
                    else if (endfloor >= 10){//for floor greater than 10
                        System.out.println(" ");

                        
                        if (floor < 10){
                            if (endroom < 10){
                                for (int room = 0; room <= endroom; room ++){
                                    System.out.print("0" + floor * 10);
                                    System.out.println(room + "\t\t___");  
                                }   
                            }
                        } 
                        else if (floor >= 10){  
                            if (endroom < 10) 
                                for (int room = 0; room <= endroom; room ++){    
                                    System.out.print(floor * 10);
                                    System.out.println(room + "\t\t___");  
                          }  
                      
                        }
                        
                            if (endroom >= 10 && endroom < 100){
                                if (floor < 10){
                                for (int room = 0; room <= 9; room ++){
                                    System.out.print("0" + floor * 10);
                                    System.out.println(room + "\t\t___");  
                                }
                                for (int room = 10; room <= endroom; room ++){
                                    System.out.print("0" + floor);
                                    System.out.println(room + "\t\t___");  
                                }
                                }
                                else if (floor >=10){
                                   for (int room = 0; room <= 9; room ++){
                                        System.out.print(floor * 10);
                                        System.out.println(room + "\t\t___");  
                                    } 
                                    for (int room = 10; room <= endroom; room ++){
                                        System.out.print(floor);
                                        System.out.println(room + "\t\t___");  
                                    }
                                }
                            }   
                   
                        
                                if (endroom >= 100){
                                    if (floor < 10){
                                    for (int room = 0; room < 10; room ++){
                                    System.out.print("0" + floor * 100);
                                    System.out.println(room + "\t\t___");  
                                    }
                                    for (int room = 10; room < 100; room ++){
                                    System.out.print("0" + floor * 10);
                                    System.out.println(room + "\t\t___");  
                                    }
                                    for (int room = 100; room <= endroom; room ++){
                                    System.out.print("0" + floor);
                                    System.out.println(room + "\t\t___");  
                                    }
                                    }
                                    else if (floor > 10){
                                    for (int room = 0; room < 10; room ++){
                                    System.out.print(floor * 100);
                                    System.out.println(room + "\t\t___");  
                                    }
                                    for (int room = 10; room < 100; room ++){
                                    System.out.print(floor * 10);
                                    System.out.println(room + "\t\t___");  
                                    }
                                    for (int room = 100; room <= endroom; room ++){
                                    System.out.print(floor);
                                    System.out.println(room + "\t\t___");  
                                    }   
                                    }
                                    
                                }
                            
                            
                             
                        
                    }
               
                }

            }
        }
    }
}
