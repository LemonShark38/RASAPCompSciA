import java.math;

public class Receipt3
{
   public static void main(String [] args)
   {
      String HsNm = "Trevor Packer HS";
      int orderNumber = (int)(Math.random()*100 + 1);

      //In these variables, P will be the prefix for Price
      double PDrink = 1.50;
      double PCandy = 1.25;
      double PHotDog = 2.75;
      double PHamburger = 3.50;

      //In these variables, N will be the prefix for Number
      int NDrink = 1;
      int NCandy = 0;
      int NHotDog = 1;
      int NHamburger = 1;

      /* 
      * These variables are what calculates the total price for each object.
      * They work by multiplying NObject with PObject. 
      * T will be the prefix for Total
      */
      double TDrink = PDrink * NDrink;
      double TCandy = PCandy * NCandy;
      double THotDog = PHotDog * NHotDog;
      double THamburger = PHamburger * NHamburger;

      /*
      * The tax rate can be calculated by ((Tax amount)/(Subtotal)) x 100
      * In this case, the tax rate is 4.90%
      *
      * We wont need a percentage, rather a number to multiply by to get the tax; So we do not need to do the "x100" part.
      * We end up with 0.049
      */
      double taxRate = 0.049;

      //Rest of the calculations
      double Subtotal = TDrink + TCandy + THotDog + THamburger;
      double tax = Subtotal * taxRate;
      double Total = Subtotal + tax;

      /*
       * this last step is optional.
       * I am only doing this, as if there is a one digit number for orderNumber, the receipt looks off.
       */
      String orderNumberLine = "";
      if(Math.abs(orderNumber) >= 0 && Math.abs(orderNumber) <= 9)
      {
        orderNumberLine = "*   Order Number    "+ orderNumber +"                *";
      } 
      else if(Math.abs(orderNumber) >= 10 && Math.abs(orderNumber) <= 99)
      {
        orderNumberLine = "*   Order Number    "+ orderNumber +"               *";
      }
      else if(Math.abs(orderNumber) >= 100 && Math.abs(orderNumber) <= 999)
      {
        orderNumberLine = "*   Order Number    "+ orderNumber +"              *";
      }


      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*              Welcome               *");
      System.out.println("*     " + HsNm + " Snack Bar     *");
      System.out.println("*                                    *");
      System.out.println("*     Drink ..........$"+ String.format("%.2f" , PDrink) +"          *");                      
      System.out.println("*     Candy ..........$" + String.format("%.2f" , PCandy) + "          *");     
      System.out.println("*     Hot Dog ........$"+ String.format("%.2f" , PHotDog) +"          *");     
      System.out.println("*     Hamburger ......$"+ String.format("%.2f" , PHamburger) +"          *");     
      System.out.println("*                                    *");    
      System.out.println("**************************************");
      System.out.println(orderNumberLine);
      System.out.println("*                                    *");
      System.out.println("*   QTY      ITEM       TOTAL        *");
      System.out.println("**************************************");
      System.out.println("*    "+ NDrink +"       Drink      "+ String.format("%.2f" , TDrink) +"         *");
      System.out.println("*    "+ NCandy +"       Candy      "+ String.format("%.2f" , TCandy) +"         *");
      System.out.println("*    "+ NHotDog +"       Hot Dog    "+ String.format("%.2f" , THotDog) +"         *");
      System.out.println("*    "+ NHamburger +"       Hamburger  "+ String.format("%.2f" , THamburger) +"         *");
      System.out.println("**************************************");
      System.out.println("*    Subtotal        "+ String.format("%.2f" , Subtotal) +"            *");
      System.out.println("*    Tax             "+ String.format("%.2f" , tax) +"            *");
      System.out.println("*    Total           "+ String.format("%.2f" , Total) +"            *");
      System.out.println("**************************************");
   }
}
