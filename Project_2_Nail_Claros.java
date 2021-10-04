import java.util.*; 
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Project_2_Nail_Claros
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      try
      { ////start of try/////////////////
      File file = new File("Rooms.txt");
      
      Scanner inputFile = new Scanner(file);
      
      String name; /////////// String for room name
      double roomL;/// room length variable
      double roomW; //room width variable
      String shadeinput;/// int for shade input selection
      int litR = 0;
           int modR  = 0;
           int abunR = 0;
      ///while loop to read and print out info
         while(inputFile.hasNext())
         { 
   
         name = inputFile.nextLine(); ///user enters room name here
         
         roomL = inputFile.nextDouble(); ///user enters room length here
      
         roomW = inputFile.nextDouble();///user enters room width here
      
         shadeinput = inputFile.next();///user enters a 1-3 here for room shade
      
         Room cont = new Room(name, roomL, roomW, shadeinput); /// array to access room class
         
             
                  if(inputFile.hasNext())
            { 
               inputFile.nextLine();//skips blank line 
            }
             if(inputFile.hasNext())
            { 
               inputFile.nextLine();//skips blank line 
            }
            
                   
           
           
      if(shadeinput.equals("Little"))
       litR+= 1;
       else if(shadeinput.equals("Moderate"))
       modR+= 1;
      else if(shadeinput.equals("Abundant"))
       abunR+= 1;
      
            
            System.out.println("\nRoom Name: " + cont.getName() +
                        "\nRoom Area: " + cont.getArea() +
                        "\nAmount of Shade: " + cont.getInput());
                      
         System.out.printf("BTUs Per Hour needed: %,.0f", cont.getCC());
         ////////////////////////////////////////  
                
         if(!inputFile.hasNext())
         {
         System.out.println("\nNumber of rooms with little shade: " + litR +
               "\nNumber of rooms with moderate shade: " + modR +
               "\nNumber of rooms with abundant shade: " + abunR);
         } 
         
     }//// end of loop
     inputFile.close();
     
   
      
     
     
     ///////room display counter 
     
     
     
     }////////// try end
       
     catch(IOException ex)//If something goes wrong,       
        {
         //getMessage method will print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
        }
        
        /*  System.out.print("Number of rooms with little shade: " + cont.getCount1());
     System.out.print("Number of rooms with moderate shade: " + cont.getCount2());
     System.out.print("Number of rooms with abundant shade: " + cont.getCount3()); */
   
   } 
}