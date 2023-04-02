package fairyShop.core;

public interface Controller {
    String AddHelper(String type, String helperName);
    String AddInstrumentToHelper(String helperName, int power);
    String AddPresent(String presentName, int energyRequired);
    String CraftPresents(String presentName);
    String Report();
}