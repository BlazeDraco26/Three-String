// Lab #6
// Jordan Cheng

public class Foothill
{
   public static void main(String[] args) {
      
      //create 4 ThreeString objects
      ThreeString emptyThreeString = new ThreeString();
      ThreeString threeString1 = new ThreeString("", "", "");
      ThreeString threeString2 = new ThreeString(" Cats ", " Dogs ", " Mice ");
      ThreeString threeString3 = new ThreeString(" 3 ", " 6 ", " 9 ");
      
      //display all objects
      System.out.println("ThreeString objects after initial instantiation:");
      System.out.println(emptyThreeString.toString());
      System.out.println(threeString1.toString());
      System.out.println(threeString2.toString());
      System.out.println(threeString3.toString());
      
      //mutate objects
      boolean firstStringValid;
      boolean secondStringValid;
      boolean thirdStringValid;
      
      firstStringValid = threeString1.setString1(" Dragons ");
      firstStringValid = threeString1.setString2(" Donuts ");
      firstStringValid = threeString1.setString3(" Dumbbells ");
      secondStringValid = threeString2.setString1(" 15 ");
      secondStringValid = threeString2.setString2(" 25" );
      thirdStringValid = threeString3.setString2(" Penguins ");
      thirdStringValid = threeString3.setString3("");
    
      
      //display after change
      System.out.println("ThreeString objects after first mutation:");
      System.out.println(emptyThreeString.toString());
      System.out.println(threeString1.toString());
      System.out.println(threeString2.toString());
      System.out.println(threeString3.toString());
      
      //mutator test
      if (firstStringValid) {
         System.out.println("The call was successful.");
      } else {
         System.out.println("The call was unsuccessful.");
      }
      if (thirdStringValid) {
         System.out.println("The call was successful.");
      } else {
         System.out.println("The call was unsuccessful.");
      }
      
      //accessor test
      String accessor1Valid;
      String accessor2Valid;
      
      accessor1Valid = threeString1.getString1();
      accessor2Valid = threeString3.getString2();
      
      if (accessor1Valid == " Dragons ") {
         System.out.println("The accessor is fully operational.");
      }
      if (accessor2Valid == " Penguins ") {
         System.out.println("The accessor is fully operational.");
      }
      
   }

}

class ThreeString
{
   private String string1;
   private String string2;
   private String string3;
   
   public static final String DEFAULT_STRING = " (undefined) ";
   public static final int MAX_LEN = 50;
   public static final int MIN_LEN = 1;
   
   //constructors  
   public ThreeString() {
      string1 = DEFAULT_STRING;
      string2 = DEFAULT_STRING;
      string3 = DEFAULT_STRING;
   }
   
   public ThreeString(String string1, String string2, String string3) {
      boolean result1 = setString1(string1);
      boolean result2 = setString2(string2);
      boolean result3 = setString3(string3);
      
      if (result1 == false) {
         this.string1 = DEFAULT_STRING;
      }
      if (result2 == false) {
         this.string2 = DEFAULT_STRING;
      }
      if (result3 == false) {
         this.string3 = DEFAULT_STRING;
      }
   }

   
   //mutators and accessors
   public String getString1()
   {
      return string1;
   }
   
   public boolean setString1(String string1)
   {
      if(validString(string1))
      {
         this.string1 = string1;
         return true;
      }
      else
      {
         //do nothing at all
         return false;
      }
   }
      
   public String getString2()
   {
      return string2;
   }
      
   public boolean setString2(String string2)
   {
      if(validString(string2))
      {
         this.string2 = string2;
         return true;
      }
      else
      {
         return false;
      }
  
   }
   
   public String getString3()
   {
      return string3;
   }
      
   public boolean setString3(String string3)
   {
      if(validString(string3))
      {
         this.string3 = string3;
         return true;
      }
      else
      {
         return false;
      }
      
   }
   
   public String toString() {
      return "The object contains three strings," + string1 + string2 + string3;
   }

   public static boolean validString( String str ) {
      if (str != null && str.length() <= MAX_LEN && str.length() >= MIN_LEN) {
         return true;
      } else {
         return false;
      }
   }

}


