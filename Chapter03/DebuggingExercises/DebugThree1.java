// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1
{
   public static void main(String args[])
   {
      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are");
      calcTip(myCheck);
      calcTip(yourCheck);
    }
    public static void calcTip(double myCheck) {
      final double RATE = 0.15;
      double tip = myCheck * RATE + myCheck;
      System.out.printf("The tip  be at least $%.2f\n", tip);
    }
}
