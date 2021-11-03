import java.util.*; 
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Project_2_Nail_Claros
{
   public static void main(String[] args)
   {
      try
      { ////start of try/////////////////
      File file = new File("Rooms2.txt");
      
      Scanner inputFile = new Scanner(file);
      
      ///Declared variables for ROOM 
      String name; /////////// String for room name
      double roomL;/// room length variable
      double roomW; //room width variable
      String shadeinput;/// shade input 
      ///Declared variables for AC
      String Manufacturer;
      String type;
      double CoolingC;
      /////Array list
      ArrayList<Room> list = new ArrayList<Room>();
      
      ///while loop to read and print out info
         while(inputFile.hasNext())
         { 
         
         /////////////ROOM VARIABLES////////////////////////////////////////////////
         name = inputFile.nextLine(); ///user enters room name here
         
         roomL = inputFile.nextDouble(); ///user enters room length here
      
         roomW = inputFile.nextDouble();///user enters room width here
         
         inputFile.nextLine();
         
         shadeinput = inputFile.nextLine();///user enters a 1-3 here for room shade      
         
         ///////////////////////////////////////////////AC VARIABLES
         Manufacturer = inputFile.nextLine();
         
         type = inputFile.nextLine();
                  
         CoolingC = inputFile.nextDouble();
         ////////////////////////////////////////end of input
          
         AirConditioner AC = new AirConditioner(Manufacturer, type, CoolingC);
         
         Room cont = new Room(name, roomL, roomW, shadeinput, AC); /// array to access room class
         
         list.add(cont);
             
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();//skips blank line 
            }
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();//skips blank line 
            }
         ////////////////////////////////////////  
                
             
     }//// end of loop
     inputFile.close();
      
           for(int i = 0; i < list.size(); i++)
            {
               System.out.println(list.get(i));       
            }
     
     }////////// try end
       
       
       
     catch(IOException ex)//If something goes wrong,       
        {
         //getMessage method will print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
        }
     
   
          
   } 
}