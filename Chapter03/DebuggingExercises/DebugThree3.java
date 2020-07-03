// This application gets a user's name and displays a greeting
import java.util.Scanner;
import java.util.jar.Attributes.Name;
public class DebugThree3
{
   public static void main(String args[])
   {
      String name = getName();
      displayGreeting(name);
   } 
   public static String getName()
   {
      String name;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter name" );
      name = input.next();
      input.close();
      return name;
   }
   public static void displayGreeting(String name)
   {
      System.out.println("Hello, " + name + "!");
   }
}
