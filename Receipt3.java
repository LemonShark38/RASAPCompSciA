/*
Receipt 1 and 2 was kinda obvious.
So I'm uploading from receipt 3.
Look at Lemon's code if you need 1 or 2.
*/

class Receipt3
{
    public static String spaceadder(int num) //function for aligning "*"
    {
        String space = "";
        int spacecount = 0;

        //counting length of integer part of number from parameter
        for (int i = 0; i < 2; i++)
        {
            if (num / 10 != 0)
            {
                spacecount = i + 1;
            }

            num /= 10;
        }

        //determining how many space we need
        if (spacecount == 0)
        {
            space = "   ";
        }
        if (spacecount == 1)
        {
            space = "  ";
        }
        if (spacecount == 2)
        {
            space = " ";
        }

        return space;
    }
    public static void main(String[] args)
    {
        //constant variables
        double taxrate = 20;
        double drinkprice = 1.50;
        double candyprice = 1.25;
        double hdprice = 2.75;
        double burgerprice = 3.5;
        String schoolname = "RAS HS";
        
        //random numbers
        int ordernumber = (int)(Math.random() * (100 - 1 + 1)) + 1;
        int drinknum = (int)(Math.random() * (2 - 0 + 1));
        int candynum = (int)(Math.random() * (2 - 0 + 1));
        int hdnum = (int)(Math.random() * (2 - 0 + 1));
        int burgernum = (int)(Math.random() * (2 - 0 + 1));
        
        //calculations
        double totaldrink = drinkprice * drinknum;
        double totalcandy = candyprice * candynum;
        double totalhd = hdprice * hdnum;
        double totalburger = burgerprice * burgernum;

        double subtotal = totaldrink + totalcandy + totalhd + totalburger;
        double tax = subtotal * (taxrate / 100);
        double total = subtotal + tax;
        
        //receipt
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*           " + schoolname + " Snack Bar         *");
        System.out.println("*                                    *");
        System.out.println("*     Drink ..........$" + String.format("%.2f", drinkprice) +  "          *");
        System.out.println("*     Candy ..........$" + String.format("%.2f", candyprice) +  "          *");
        System.out.println("*     Hot Dog ........$" + String.format("%.2f", hdprice) +     "          *");
        System.out.println("*     Hamburger ......$" + String.format("%.2f", burgerprice) + "          *");
        System.out.println("*                                    *");
        System.out.println("**************************************");
        System.out.println("*    Order Number: " + ordernumber + spaceadder(ordernumber) + "              *");
        System.out.println("*                                    *");
        System.out.println("*   QTY     ITEM        TOTAL        *");
        System.out.println("**************************************");
        System.out.println("*    " + drinknum +  "      Drink        " + String.format("%.2f", totaldrink) + spaceadder((int)totaldrink) +   "     *");
        System.out.println("*    " + candynum +  "      Candy        " + String.format("%.2f", totalcandy) + spaceadder((int)totalcandy) +   "     *");
        System.out.println("*    " + hdnum +     "      Hot Dog      " + String.format("%.2f", totalhd) + spaceadder((int)totalhd) +         "     *");
        System.out.println("*    " + burgernum + "      Hamburger    " + String.format("%.2f", totalburger) + spaceadder((int)totalburger) + "     *");
        System.out.println("**************************************");
        System.out.println("*   Subtotal:    " + String.format("%.2f", subtotal) + spaceadder((int)subtotal) + "             *");
        System.out.println("*   Tax:         " + String.format("%.2f", tax) + spaceadder((int)tax) +           "             *");
        System.out.println("*   Total:       " + String.format("%.2f", total) + spaceadder((int)total) +       "             *");
        System.out.println("**************************************");
    }
}
