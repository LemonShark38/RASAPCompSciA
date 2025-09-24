/*
Lemon's code is over holy 500 lines. This code is for someone who dont want to read 500 code and make it simpler.
*/

import java.util.Scanner;

class Receipt3
{
    public static String spaceadder(int num, int spacenumber) //function for aligning "*"
    {
        String space = "";
        int spacecount = 0;

        //Calculate how many space needed for alignment
        for (int i = 0; i < 6; i++)
        {
            if (num / 10 != 0)
            {
                spacecount = i + 1;
            }

            num /= 10;
        }
        //if length is longer than spacenumber, giveup aligning
        if(spacecount > spacenumber)
        {
            spacecount = spacenumber;
        }

        //making string of desired number of spaces
        for(int i = 0; i < spacenumber - spacecount; i++)
        {
            space += " ";
        }

        return space;
    }
    public static String initial(String SchoolName) //find initial of function
    {
        //divide words by " " between words and get first letter of each words
        String[] words = SchoolName.split(" ");
        String InitialName = "";

        for (String word : words)
        {
            InitialName += word.charAt(0);
        }

        return InitialName;
    }
    public static int wordcount(String SchoolName)
    {
        //count the length of school initial and return value as int number which 
        //have same length as initial so we can use it in function spaceadder().
        //ex: initial = RAS | value = 100
        String[] words = SchoolName.split(" ");
        int WordCount = 1;

        for (String word : words)
        {
            WordCount = WordCount * 10;
        }

        return WordCount / 10;
    }
    public static void main(String[] args)
    {
        //Scanner
        Scanner scanner = new Scanner(System.in);

        //constant variables
        double taxrate = 5; //taxrate x%
        double drinkprice = 1.50;
        double candyprice = 1.25;
        double hdprice = 2.75;
        double burgerprice = 3.5;

        //asking for user input
        System.out.print("School name: ");
        String schoolname = scanner.nextLine();
        
        int ordernumber = (int)(Math.random() * (100 - 1 + 1)) + 1;
        System.out.print("\nHow many drinks: ");
        int drinknum = scanner.nextInt();
        System.out.print("\nHow many candy: ");
        int candynum = scanner.nextInt();
        System.out.print("\nHow many hot dogs: ");
        int hdnum = scanner.nextInt();
        System.out.print("\nHow many hamburgers: ");
        int burgernum = scanner.nextInt();
        
        //calculations
        double totaldrink = drinkprice * drinknum;
        double totalcandy = candyprice * candynum;
        double totalhd = hdprice * hdnum;
        double totalburger = burgerprice * burgernum;

        double subtotal = totaldrink + totalcandy + totalhd + totalburger;
        double tax = subtotal * (taxrate / 100);
        double total = subtotal + tax;
        
        //receipt
        System.out.println("");
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*           " + initial(schoolname) + spaceadder(wordcount(schoolname), 5)+ " Snack Bar         *");
        System.out.println("*                                    *");
        System.out.println("*     Drink ..........$" + String.format("%.2f", drinkprice) +  "          *");
        System.out.println("*     Candy ..........$" + String.format("%.2f", candyprice) +  "          *");
        System.out.println("*     Hot Dog ........$" + String.format("%.2f", hdprice) +     "          *");
        System.out.println("*     Hamburger ......$" + String.format("%.2f", burgerprice) + "          *");
        System.out.println("*                                    *");
        System.out.println("**************************************");
        System.out.println("*    Order Number: " + ordernumber + spaceadder(ordernumber, 3) + "              *");
        System.out.println("*                                    *");
        System.out.println("*   QTY     ITEM        TOTAL        *");
        System.out.println("**************************************");
        System.out.println("*    " + drinknum +  spaceadder(drinknum, 3) +  "   Drink        " + String.format("%.2f", totaldrink) +  spaceadder((int)totaldrink, 3) +  "     *");
        System.out.println("*    " + candynum +  spaceadder(candynum, 3) +  "   Candy        " + String.format("%.2f", totalcandy) +  spaceadder((int)totalcandy, 3) +  "     *");
        System.out.println("*    " + hdnum +     spaceadder(hdnum, 3)    +  "   Hot Dog      " + String.format("%.2f", totalhd) +     spaceadder((int)totalhd, 3) +     "     *");
        System.out.println("*    " + burgernum + spaceadder(burgernum, 3) + "   Hamburger    " + String.format("%.2f", totalburger) + spaceadder((int)totalburger, 3) + "     *");
        System.out.println("**************************************");
        System.out.println("*   Subtotal:    " + String.format("%.2f", subtotal) + spaceadder((int)subtotal, 3) + "             *");
        System.out.println("*   Tax:         " + String.format("%.2f", tax) +      spaceadder((int)tax, 3) +      "             *");
        System.out.println("*   Total:       " + String.format("%.2f", total) +    spaceadder((int)total, 3) +    "             *");
        System.out.println("**************************************");
    }
}
