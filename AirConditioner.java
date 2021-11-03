public class AirConditioner
{
   private String Manufacturer;
   private String type;
   private double BTU;
      
   public AirConditioner(String M, String T, double B)
   {
      Manufacturer = M;
      type = T;
      BTU = B;
   }
   
   public AirConditioner(AirConditioner object2)
   {
      Manufacturer = object2.Manufacturer;
      type = object2.type;
      BTU = object2.BTU;
   }
   
   ///////////////////////////////////// Setters
   
   public void setManu(String M)
   {
      Manufacturer = M;
   }
   
   public void setType(String T)
   {
      type = T;
   }
   
   public void setBTU(double B)
   {
      BTU = B;
   }
   
   ////////////////////////gettters /////////////
   
   public String getManu()
   {
      return Manufacturer;
   }
   
   public String getType()
   {
      return type;
   }
   
   public double getBTU()
   {
      return BTU;
   }
   
   /////////////////to string
   
   public String toString()
   {
      return String.format("\nAir Conditioner Manufacturer: " + getManu() +
                           "\nAir Conditioner Type: " + getType() +
                           "\nAir Conditioner Cooling Capacity (BTUs Per Hour): %,.0f", getBTU());
   }
}