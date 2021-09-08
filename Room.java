public class Room
{
   private String rname; ///room name String variable
   private double rooml; ///room length variable
   private double roomw; ///room width variable
   private int shadeinput; /// shade variablePlease enter the name of the room:
   
   /// non arg constructor
   public Room()
   {
      rname = "";
      rooml = 0;
      roomw = 0;
      shadeinput = 0;
   }
   
   public Room(String N, double L, double W, int SI)
   {
      rname = N;
      rooml = L;
      roomw = W;
      shadeinput = SI; /// SI is an abbreviation for Shade input 
   }
   
   ////////////////////// setters ////////////
   
   public void setName(String N)//room name setter
   {
      rname = N;
   }
   
   public void setLength(double L)///room length setter
   {
      rooml = L;
   }
   
   public void setWidth(double W) ///room width setter
   {
      roomw = W;
   }
   
   public void setInput(int SI) /////////// shade input setter
   {
      shadeinput = SI;
   }
   
   /////////////getters///////////////////
   
   public String getName()
   {
      return rname;
   }
   
   public double getLength()
   {
      return rooml;
   }
   
   public double getWidth()
   {
      return roomw;
   }
   
   public int getInput()
   {
      return shadeinput;
   }
   
   public double getArea()
   {
      return roomw * rooml;
   }
   
   //////////////////// other getters//////////////
   
   public double getCC() ///CC is an abbreviation for cooling capacity method
   {
      double btu = 0;///////// BTU units variable
      double total = 0;//// our end variable that will hold the value to be returned for cooling capacity
      
      final double P1A = 250; ///parameter 1 A(A is the 1st if statement chain for BTU calculator)
      final double P2A = 500; ///param 2
      final double P3A = 1000;/// param 3
      
      final double BTUV1 = 5500; /// potential values for BTU based off of area calc
      final double BTUV2 = 10000;
      final double BTUV3 = 17500;
      final double BTUV4 = 24000;
      if(getArea() < P1A)////////if statement for determning BTU value based off of the Area of user's room
      {
       btu = BTUV1;
      }
      else if(P1A <= getArea() || getArea() <= P2A)
      {
       btu = BTUV2;
      }
       else if(P2A < getArea() || getArea() < P3A)
      {
       btu = BTUV3;
      }
      else //// anything greater than P3A value
      {
       btu = BTUV4;
      }
      
      final int UI1 = 1; ////////// user input values from getinput()
      final int UI2 = 2;
      final int UI3 = 3;
      
      final double UIAMP1 = 1.15; /////// user input amplifiers for input option 1 and 3
      final double UIAMP3 = 0.9;
      
      if(getInput() == UI1)///// if statement chain for shade abundance
      {
      total = btu * UIAMP1;
      }
      else if(getInput() == UI2)
      {
      total = btu;
      }
      else if(getInput() == UI3)
      {
      total = btu * UIAMP3;
      }
      
      return total;//// returns cooling capacity

   }
   
   
  ////////////////////////////user shade input to string method//////
  
  
   public String getShade()
   {
      String endshade = ""; ///////// String that will be returned       
      final int UI1 = 1; ////////// user input values from shade question
      final int UI2 = 2;
      final int UI3 = 3;
      
      final String OP1 = "Little Shade"; //// option 1,2, and 3 values
      final String OP2 = "Moderate Shade";
      final String OP3 = "Abundant Shade";
      
      if(getInput() == UI1)///// if statement chain for shade abundance in string format
      {
         endshade = OP1;
      }
      else if(getInput() == UI2)
      {
         endshade = OP2;
      }
      else if(getInput() == UI3)
      {
         endshade = OP3;
      }
 
      return endshade;
   
   }
}