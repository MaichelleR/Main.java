import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        ArrayList<CupCake> cupCakeMenu = new ArrayList();
        CupCake cupcake = new CupCake();
        RedVelvet redvelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();
        System.out.println( "We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println( "How much would you like to charge for the cupcake?");
        String priceText = scanner.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        redvelvet.type();
        System.out.println( "How much would you like to charge for the cupcake?");
        String priceText1 = scanner.nextLine();
        double price1 = Double.parseDouble(priceText);
        redvelvet.setPrice(price1);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        chocolate.type();
        System.out.println( "How much would you like to charge for the cupcake?");
        String priceText2 = scanner.nextLine();
        double price2 = Double.parseDouble(priceText);
        chocolate.setPrice(price2);

        cupCakeMenu.add(cupcake);
        cupCakeMenu.add(redvelvet);
        cupCakeMenu.add(chocolate);






    ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
    Drink water = new Drink();
    Soda soda = new Soda();
    Milk milk = new Milk();




        System.out.println("We are deciding on the price for our drink. Here is the description:");
        water.type();
        System.out.println( "How much would you like to charge for the water?");
        String priceText3 = scanner.nextLine();
        double price3 = Double.parseDouble(priceText);
        water.setPrice(price3);

        System.out.println("We are deciding on the price for our soda. Here is the description:");
        soda.type();
        System.out.println( "How much would you like to charge for the soda?");
        String priceText4 = scanner.nextLine();
        double price4 = Double.parseDouble(priceText);
        soda.setPrice(price4);

        System.out.println("We are deciding on the price for our standard milk. Here is the description:");
        milk.type();
        System.out.println( "How much would you like to charge for the milk?");
        String priceText5 = scanner.nextLine();
        double price5 = Double.parseDouble(priceText);
        milk.setPrice(price5);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        new Order(cupCakeMenu, drinkMenu);
    }
}

class CupCake{

    public double price;

    public double getPrice(){
       return price;
    }
    public void setPrice(double price){
       this.price = price;
    }
    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }

}

class Drink{
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;


    }

    public void type(){
        System.out.println("A bottle of water");
    }
}


class Soda extends Drink {

    public void type() {
        System.out.println("A bottle of soda");
    }

}



class Milk extends Drink {

        public void type() {
        System.out.println("A bottle of milk");
    }
}


