import java.util.Scanner;
public class Main {
  public static void main(String [] args) {
String highSchool = "Birch Wathen Lenox School";
Scanner input = new Scanner(System.in);
 int orderNumber = (int) (Math.random() * 100) + 1;
   double drinkPrice = 1.50;
   double candyPrice = 1.25;
   double hotDogPrice = 2.75;
   double hamburgerPrice = 3.50;

    System.out.println("how many drinks would you like to order?");
      int drinksOrdered = input.nextInt();
      System.out.println("how many packs of candy would you like to order?");
      int candyOrdered = input.nextInt();
      System.out.println("how many hot dogs would you like to order?");
      int hotDogOrdered = input.nextInt();
      System.out.println("how many hamburgers would you like to order?");
      int hamBurgerOrdered = input.nextInt();


   double cost =  + hamBurgerOrdered * hamburgerPrice + candyOrdered * candyPrice + hotDogOrdered *hotDogPrice + drinksOrdered * drinkPrice;
    double totalCost = (cost * 1.08) + 1.0;
     // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("* " + highSchool + " Snack Bar*");
     System.out.println("*          Order Number    "+ orderNumber + "        *");
     System.out.println("*     Drink ..........$" + drinkPrice + "           *");  
     System.out.println("*     Drinks Ordered .........." + drinksOrdered + "     *");                   
     System.out.println("*     Candy ..........$" + candyPrice + "          *");     
     System.out.println("*     Candy Ordered .........." + candyOrdered + "      *");
     System.out.println("*     Hot Dog ........$" +hotDogPrice + "          *");    
     System.out.println("*     Hot Dogs Ordered .........." + hotDogOrdered + "   *"); 
     System.out.println("*     Hamburger ......$" + hamburgerPrice + "           *");  
          System.out.println("*     Hamburgers Ordered .........." + hamBurgerOrdered + " *");   
     System.out.println("*                                    *");    
     
     System.out.println("*     Total Cost .......... * " + totalCost);
     System.out.println("**************************************");

     
  }
  }
   

