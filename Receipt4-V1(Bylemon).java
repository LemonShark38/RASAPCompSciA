/*
 * this code is still in development
 * V1.0.0
 * 
 * DO NOT USE THIS CODE FOR THE ACTIVITY 4 ASSIGNMENT!!
 * (This code is still missing the abv name maker, you will not get full marks.)
 */

import java.math;
import java.util.Scanner;

public class Receipt4
{
    public static String orderNumberLen(int type,double num)
    {
        String text = "";
        if(type == 1) //case of ordernumber
        {
            if(Math.abs((int) num) >= 0 && Math.abs((int) num) <= 9)
            {
                text = "*   Order Number    "+ (int) num +"                *";
            } 
            else if(Math.abs((int) num) >= 10 && Math.abs((int) num) <= 99)
            {
                text = "*   Order Number    "+ (int) num +"               *";
            }
            else if(Math.abs((int) num) >= 100 && Math.abs((int) num) <= 999)
            {
                text = "*   Order Number    "+ (int) num +"              *";
            }
            else
            {
                text = "*          Overflow Error            *";
            }
            return text;
        }
        else if(type == 2) //case of subtotal
        {
            if(Math.abs((int) num) >= 0 && Math.abs((int) num) <= 9)
            {
                text = "*    Subtotal        "+ String.format("%.2f" , num) +"            *";
            } 
            else if(Math.abs((int) num) >= 10 && Math.abs((int) num) <= 99)
            {
                text = "*    Subtotal        "+ String.format("%.2f" , num) +"           *";
            }
            else if(Math.abs((int) num) >= 100 && Math.abs((int) num) <= 999)
            {
                text = "*    Subtotal        "+ String.format("%.2f" , num) +"          *";
            }
            else
            {
                text = "*          Overflow Error            *";
            }
            return text;
        }
        else if(type == 3) //case of tax
        {
            if(Math.abs((int) num) >= 0 && Math.abs((int) num) <= 9)
            {
                text = "*    Tax             "+ String.format("%.2f" , num) +"            *";
            } 
            else if(Math.abs((int) num) >= 10 && Math.abs((int) num) <= 99)
            {
                text = "*    Tax             "+ String.format("%.2f" , num) +"           *";
            }
            else if(Math.abs((int) num) >= 100 && Math.abs((int) num) <= 999)
            {
                text = "*    Tax             "+ String.format("%.2f" , num) +"          *";
            }
            else
            {
                text = "*          Overflow Error            *";
            }
            return text;
        }
        else if(type == 4) //case of total
        {
            if(Math.abs((int) num) >= 0 && Math.abs((int) num) <= 9)
            {
                text = "*    Total           "+ String.format("%.2f" , num) +"            *";
            } 
            else if(Math.abs((int) num) >= 10 && Math.abs((int) num) <= 99)
            {
                text = "*    Total           "+ String.format("%.2f" , num) +"           *";
            }
            else if(Math.abs((int) num) >= 100 && Math.abs((int) num) <= 999)
            {
                text = "*    Total           "+ String.format("%.2f" , num) +"          *";
            }
            else
            {
                text = "*          Overflow Error            *";
            }
            return text;
        }
        return "*                                    *";
    }

    public static String OrderObjectlen(int type, int QTY, double tot)
    {
        String text = "";
        if(type == 1) //case of drinks
        {
            if(Math.abs(QTY) >= 0 && Math.abs(QTY) <= 9)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*    "+ QTY +"       Drink      "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*    "+ QTY +"       Drink      "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*    "+ QTY +"       Drink      "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            } 
            else if(Math.abs(QTY) >= 10 && Math.abs(QTY) <= 99)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*   "+ QTY +"       Drink      "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*   "+ QTY +"       Drink      "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*   "+ QTY +"       Drink      "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            }
            else if(Math.abs(QTY) >= 100 && Math.abs(QTY) <= 999)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*  "+ QTY +"       Drink      "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*  "+ QTY +"       Drink      "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*  "+ QTY +"       Drink      "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            }
            else
            {
                text = "*          Overflow Error            *";
            }
            return text;
        }
        else if(type == 2) //case of candy
        {
            if(Math.abs(QTY) >= 0 && Math.abs(QTY) <= 9)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*    "+ QTY +"       Candy      "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*    "+ QTY +"       Candy      "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*    "+ QTY +"       Candy      "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            } 
            else if(Math.abs(QTY) >= 10 && Math.abs(QTY) <= 99)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*   "+ QTY +"       Candy      "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*   "+ QTY +"       Candy      "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*   "+ QTY +"       Candy      "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            }
            else if(Math.abs(QTY) >= 100 && Math.abs(QTY) <= 999)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*  "+ QTY +"       Candy      "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*  "+ QTY +"       Candy      "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*  "+ QTY +"       Candy      "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            }
            else
            {
                text = "*          Overflow Error            *";
            }
            return text;
        }
        else if(type == 3) //case of Hot dog
        {
            if(Math.abs(QTY) >= 0 && Math.abs(QTY) <= 9)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*    "+ QTY +"       Hot Dog    "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*    "+ QTY +"       Hot Dog    "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*    "+ QTY +"       Hot Dog    "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            } 
            else if(Math.abs(QTY) >= 10 && Math.abs(QTY) <= 99)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*   "+ QTY +"       Hot Dog    "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*   "+ QTY +"       Hot Dog    "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*   "+ QTY +"       Hot Dog    "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            }
            else if(Math.abs(QTY) >= 100 && Math.abs(QTY) <= 999)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*  "+ QTY +"       Hot Dog    "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*  "+ QTY +"       Hot Dog    "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*  "+ QTY +"       Hot Dog    "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            }
            else
            {
                text = "*          Overflow Error            *";
            }
            return text;
        }
        else if(type == 4) //case of Hamburger
        {
            if(Math.abs(QTY) >= 0 && Math.abs(QTY) <= 9)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*    "+ QTY +"       Hamburger  "+ String.format("%.2f" , tot) +"         *";
                } 
                
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*    "+ QTY +"       Hamburger  "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*    "+ QTY +"       Hamburger  "+ String.format("%.2f" , tot) +"      *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            } 
            else if(Math.abs(QTY) >= 10 && Math.abs(QTY) <= 99)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*   "+ QTY +"       Hamburger  "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*   "+ QTY +"       Hamburger  "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*   "+ QTY +"       Hamburger  "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            }
            else if(Math.abs(QTY) >= 100 && Math.abs(QTY) <= 999)
            {
                if(Math.abs((int) tot) >= 0 && Math.abs((int) tot) <= 9)
                {
                    text = "*  "+ QTY +"       Hamburger  "+ String.format("%.2f" , tot) +"         *";
                } 
                else if(Math.abs((int) tot) >= 10 && Math.abs((int) tot) <= 99)
                {
                    text = "*  "+ QTY +"       Hamburger  "+ String.format("%.2f" , tot) +"        *";
                }
                else if(Math.abs((int) tot) >= 100 && Math.abs((int) tot) <= 999)
                {
                    text = "*  "+ QTY +"       Hamburger  "+ String.format("%.2f" , tot) +"       *";
                }
                else
                {
                    text = "*          Overflow Error            *";
                }
            }
            else
            {
                text = "*          Overflow Error            *";
            }
            return text;
        }
        return "*                                    *";
    }
    public static void main(String [] args)
    {
        //initiallize scanner
        Scanner input = new Scanner(System.in);

        //in this part, we will check the padding for the receipt to look uniformed.
        System.out.println("Enter high school name:");
        String HsNm = input.nextLine();
        String snackBarTxt = " Snack Bar";

        if(HsNm.length() + snackBarTxt.length() > 36)
        {
            System.out.println("Your School name is too long! Please abbreviate it.");
            HsNm = input.nextLine();
        }

        String nameLine = HsNm + snackBarTxt;
        int remainingSpace = 36 - nameLine.length();
        int leftPadding = remainingSpace / 2;
        int rightPadding = remainingSpace - leftPadding;

        String HsNameLine = "*" + " ".repeat(leftPadding) + nameLine + " ".repeat(rightPadding) + "*";

        int orderNumber = (int)(Math.random()*100 + 1);

        //In these variables, P will be the prefix for Price
        double PDrink = 1.50;
        double PCandy = 1.25;
        double PHotDog = 2.75;
        double PHamburger = 3.50;

        //In these variables, N will be the prefix for Number
        System.out.println("How many Drinks?:");
        int NDrink = input.nextInt();

        System.out.println("How many Candies?:");
        int NCandy = input.nextInt();

        System.out.println("How many Hot Dogs?:");
        int NHotDog = input.nextInt();

        System.out.println("How many Hamburgers?:");
        int NHamburger = input.nextInt();

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

        String orderNumberLine = orderNumberLen(1, orderNumber);
        String SubtotalLine = orderNumberLen(2,Subtotal);
        String TaxLine = orderNumberLen(3, tax);
        String TotalLine = orderNumberLen(4, Total);

        String DrinkCalcLine = OrderObjectlen(1, NDrink, TDrink);
        String CandyCalcLine = OrderObjectlen(2, NCandy, TCandy);
        String HotdogCalcLine = OrderObjectlen(3, NHotDog, THotDog);
        String HamburgerCalcLine = OrderObjectlen(4, NHamburger, THamburger);

        //A line break, easier to see output.
        System.out.println("");

        //the recipt
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Welcome               *");
        System.out.println(HsNameLine);
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
        System.out.println(DrinkCalcLine);
        System.out.println(CandyCalcLine);
        System.out.println(HotdogCalcLine);
        System.out.println(HamburgerCalcLine);
        System.out.println("**************************************");
        System.out.println(SubtotalLine);
        System.out.println(TaxLine);
        System.out.println(TotalLine);
        System.out.println("**************************************");

        if(input != null)
        {
            input.close();
        }
   }
}
