public class Main {
    public static void main(String[] args) {
        var hamburger1 = new Hamburger("white", "chicken", 4);
        var add1 = new Onion("Onion", 1.20);
        var add2 = new Pickles("Pickles", 2.20);
        var add3 = new Tomatoes("Tomatoes", 1.30);
        var add4 = new FrenchFries("FrenchFries", 1.90);
        hamburger1.addAddition(add1);
        hamburger1.addAddition(add2);
        hamburger1.addAddition(add3);
        hamburger1.addAddition(add4);
        hamburger1.addAddition(add1);

        BurgerPrinter.printTotalBurgerPrice(hamburger1);
        System.out.println();

        var hamburger2 = new HealthyBurger("beef", 6);
        var add11 = new Onion("Onion", 1.20);
        var add22 = new Pickles("Pickles", 12.20);
        var add33 = new Tomatoes("Tomatoes", 1.30);
        var add44 = new FrenchFries("FrenchFries", 1.90);
        hamburger2.addAddition(add11);
        hamburger2.addAddition(add22);
        hamburger2.addAddition(add33);
        hamburger2.addAddition(add44);
        hamburger2.addAddition(add44);

        BurgerPrinter.printTotalBurgerPrice(hamburger2);
    }
}