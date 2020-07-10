// This program assigns values to two variables
// and performs mathematical operations with those values
public class DebugFour1
{
   public static void main(String args[])
   {
      int x = 5;
      int y = 8;
      System.out.println("adding " + x + " and "+ y + " is " + (x + y));

      int z = 19;
      System.out.println("subtract " + y + " from " + z + " is " + (z - y));

      System.out.println("dividing " + z + " and " + x + " is " +  ((double)z / (double)x));
      System.out.println("multiplying " + x + " and " + z + " is " + (x * z));
   }
}