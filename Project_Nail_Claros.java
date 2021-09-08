import java.util.Scanner;

public class Project_Nail_Claros
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String name; /////////// String for room name
      double roomL;/// room length variable
      double roomW; //room width variable
      int shadeinput;/// int for shade input selection
      String shade; //// shade input String from int variable ^^
      System.out.print("Please enter the name of the room: ");
      name = keyboard.nextLine(); ///user enters room name here
      
      System.out.print("Please enter the length of the room (in feet): ");
      roomL = keyboard.nextDouble(); ///user enters room length here
      
      System.out.print("Please enter the width of the room (in feet): ");
      roomW = keyboard.nextDouble();///user enters room width here
      
      System.out.print("What is the amount of shade that this room receives?");
      System.out.print("\n\n\t\t1. Little Shade"
                + "\n\t\t2. Moderate Shade"
                + "\n\t\t3. Abundant Shade"); ///shade input options
                
      System.out.print("\n\nPlease select from the options above: ");
      shadeinput = keyboard.nextInt();///user enters a 1-3 here for room shade
      
      Room cont = new Room(name, roomL, roomW, shadeinput); /// array to access room class
      
      System.out.println("\nRoom Name: " + cont.getName() +
                       "\nRoom Area: " + cont.getArea() +
                       "\nAmount of Shade: " + cont.getShade());
                      
     System.out.printf("BTUs Per Hour needed: %,.0f", cont.getCC());
                             
   }
}