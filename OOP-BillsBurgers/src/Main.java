public class Main {
    public static void main(String[] args) {
        var hamburger1 = new Hamburger("white", "chicken");
        var add1 = new Onion("Onion", 1.20);
        var add2 = new Pickles("Pickles", 2.20);
        var add3 = new Tomatoes("Tomatoes", 1.30);
        var add4 = new FrenchFries("FrenchFries", 1.90);
        hamburger1.addAddition(add1);
        hamburger1.addAddition(add2);
        hamburger1.addAddition(add3);
        hamburger1.addAddition(add4);

        BurgerPrinter.printTotalBurgerPrice(hamburger1.getAdditions(), hamburger1.calculateBurgerPrice(), hamburger1.getBasePrice());

        var hamburger2 = new HealthyBurger("chicken");
        var add11 = new Onion("Onion", 1.20);
        var add22 = new Pickles("Pickles", 2.20);
        var add33 = new Tomatoes("Tomatoes", 1.30);
        var add44 = new FrenchFries("FrenchFries", 1.90);
        hamburger1.addAddition(add11);
        hamburger1.addAddition(add22);
        hamburger1.addAddition(add33);
        hamburger1.addAddition(add44);

        BurgerPrinter.printTotalBurgerPrice(hamburger1.getAdditions(), hamburger1.calculateBurgerPrice(), hamburger2.getBasePrice());
    }
}