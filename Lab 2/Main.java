package RanasiaC;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        StockItem milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98f, 30);
        Scanner sc=new Scanner(System.in);
        int userChoices;
        float prices;
        int quantity;
        do {
            System.out.print("1. Sold One Milk" +
                    "\n2. Sold One Bread" +
                    "\n3. Change price of Milk" +
                    "\n4. Change price of Bread" +
                    "\n5. Add Milk to Inventory" +
                    "\n6. Add Bread to Inventory" +
                    "\n7. See Inventory" +
                    "\n8. Quit");
            System.out.println();
            userChoices=sc.nextInt();
            switch(userChoices){
                case 1:
                    milk.lowerQuantity(1);
                    break;
                case 2:
                    bread.lowerQuantity(1);
                    break;
                case 3:
                    System.out.println("What is the new price for Milk");
                    prices=sc.nextFloat();
                    milk.setPrice(prices);
                    break;
                case 4:
                    System.out.println("What is the new price for Bread");
                    prices=sc.nextFloat();
                    bread.setPrice(prices);
                    break;
                case 5:
                    System.out.println("How many Milks did we get?");
                    quantity=sc.nextInt();
                    milk.raiseQuantity(quantity);
                    break;
                case 6:
                    System.out.println("How many Breads did we get?");
                    quantity=sc.nextInt();
                    bread.raiseQuantity(quantity);
                    break;
                case 7:
                    System.out.println("Milk:"+milk);
                    System.out.println("Bread:"+bread);
            }
            System.out.println();
        }while(userChoices!=8);
    }
}