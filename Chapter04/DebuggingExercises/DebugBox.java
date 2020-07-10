public class DebugBox
{
   private int width;
   private int length;
   private int height;
   public DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }
   public void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   public int getVolume()
   { 
     int vol = length * width * height;
     return vol;
   }
   public void showVolume()
   {
      int vol = this.getVolume();
      System.out.println(vol);
   }
   public static void tellMeAboutBoxes(){
      System.out.println("A box is a rectangular prism that has three dimensions 'width', 'length', 'height'.");
   }
   // The way to use this statics method 'tellMeAboutBoxes()' in the client code is as follows:
   //  DebugBox.tellMeAboutBoxes()
   //  box1.tellMeAboutBoxes()
}

