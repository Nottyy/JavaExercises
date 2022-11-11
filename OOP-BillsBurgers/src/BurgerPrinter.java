import java.util.ArrayList;

public final class BurgerPrinter {
    private BurgerPrinter(){

    }

    public static void printTotalBurgerPrice(ArrayList<Addition> additions, double totalBurgerPrice, double burgerPrice){
        System.out.println("There are " + additions.size() + " additions. Total burger price is -> " + totalBurgerPrice);

        for(Addition ad : additions){
            System.out.println("Addition " + ad.getName() + " -> Price " + ad.getPrice());
        }

        System.out.println("Burger price -> " + burgerPrice);
    }
}
