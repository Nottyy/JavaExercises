public final class BurgerPrinter {
    private BurgerPrinter(){

    }

    public static void printTotalBurgerPrice(Hamburger burger){
        System.out.println("There are " + burger.getAdditions().size() + " additions. Total price of "
                + burger.getBreadRollType() + " " + burger.getClass().getSimpleName() + " with " + burger.getMeat() +
                " is -> " + burger.calculateBurgerPrice());

        for(Addition ad : burger.getAdditions()){
            System.out.println("Addition " + ad.getName() + " -> Price " + ad.getPrice());
        }

        System.out.println("Burger price -> " + burger.getBasePrice());
    }
}
