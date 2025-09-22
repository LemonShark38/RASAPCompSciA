import java.math;

public class Receipt2
{
   public static void main(String [] args)
   {
      String HsNm = "Trevor Packer HS";
      double Dprice = 1.50;
      double Cprice = 1.25;
      double Hprice = 2.75;
      double HaPrice = 3.50;

      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*              Welcome               *");
      System.out.println("*     " + HsNm + " Snack Bar     *");
      System.out.println("*                                    *");
      System.out.println("*     Drink ..........$"+ String.format("%.2f" , Dprice) +"          *");                      
      System.out.println("*     Candy ..........$" + String.format("%.2f" , Cprice) + "          *");     
      System.out.println("*     Hot Dog ........$"+ String.format("%.2f" , Hprice) +"          *");     
      System.out.println("*     Hamburger ......$"+ String.format("%.2f" , HaPrice) +"          *");     
      System.out.println("*                                    *");    
      System.out.println("**************************************");
   }
}