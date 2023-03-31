package restaurant.core;

import restaurant.common.ExceptionMessages;
import restaurant.common.OutputMessages;
import restaurant.core.interfaces.Controller;
import restaurant.entities.drinks.models.Fresh;
import restaurant.entities.drinks.models.Smoothie;
import restaurant.entities.healthyFoods.interfaces.HealthyFood;
import restaurant.entities.drinks.interfaces.Beverages;
import restaurant.entities.healthyFoods.models.Salad;
import restaurant.entities.healthyFoods.models.VeganBiscuits;
import restaurant.entities.tables.interfaces.Table;
import restaurant.common.enums.*;
import restaurant.entities.tables.models.InGarden;
import restaurant.entities.tables.models.Indoors;
import restaurant.repositories.interfaces.*;

public class ControllerImpl implements Controller {
    private HealthFoodRepository<HealthyFood> healthyFoodRepo;
    private TableRepository<Table> tableRepo;
    private BeverageRepository<Beverages> beveragesRepo;

    public ControllerImpl(HealthFoodRepository<HealthyFood> healthFoodRepository, BeverageRepository<Beverages> beverageRepository, TableRepository<Table> tableRepository) {
        this.healthyFoodRepo = healthFoodRepository;
        this.beveragesRepo = beverageRepository;
        this.tableRepo = tableRepository;
    }

    @Override
    public String addHealthyFood(String type, double price, String name) {
        HealthyFood food;

        if (type.equals(HealthyFoodType.Salad.name())) {
            food = new Salad(name, price);
        } else if (type.equals(HealthyFoodType.VeganBiscuits.name())) {
            food = new VeganBiscuits(name, price);
        } else {
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_HEALTHY_FOOD_TYPE, type));
        }

        if (this.healthyFoodRepo.foodByName(name) != null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.FOOD_EXIST, name));
        }

        this.healthyFoodRepo.add(food);

        return String.format(OutputMessages.FOOD_ADDED, name);
    }

    @Override
    public String addBeverage(String type, int counter, String brand, String name) {
        Beverages beverage;

        if (type.equals(BeveragesType.Fresh.name())) {
            beverage = new Fresh(name, counter, brand);
        } else if (type.equals(BeveragesType.Smoothie.name())) {
            beverage = new Smoothie(name, counter, brand);
        } else {
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_BEVERAGE_TYPE, type));
        }

        if (this.beveragesRepo.beverageByName(name, brand) != null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.BEVERAGE_EXIST, name));
        }

        this.beveragesRepo.add(beverage);

        return String.format(OutputMessages.BEVERAGE_ADDED, name);
    }

    @Override
    public String addTable(String type, int tableNumber, int capacity) {
        Table tb;

        if (type.equals(TableType.Indoors.name())) {
            tb = new Indoors(tableNumber, capacity);
        } else if (type.equals(TableType.InGarden.name())) {
            tb = new InGarden(tableNumber, capacity);
        } else {
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_TABLE_TYPE, type));
        }

        if (this.tableRepo.byNumber(tableNumber) != null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.TABLE_IS_ALREADY_ADDED, tableNumber));
        }

        this.tableRepo.add(tb);

        return String.format(OutputMessages.TABLE_ADDED, tableNumber);
    }

    @Override
    public String reserve(int numberOfPeople) {
        Table tb = this.tableRepo.getAllEntities().stream()
                .filter(x -> x.isReservedTable() == false && x.getSize() >= numberOfPeople)
                .findFirst()
                .orElse(null);
        if (tb == null){
            return String.format(OutputMessages.RESERVATION_NOT_POSSIBLE, numberOfPeople);
        }
        else{
            tb.reserve(numberOfPeople);

            return String.format(OutputMessages.TABLE_RESERVED, tb.getTableNumber(), numberOfPeople);
        }
    }

    @Override
    public String orderHealthyFood(int tableNumber, String healthyFoodName) {
        //TODO:
        return null;
    }

    @Override
    public String orderBeverage(int tableNumber, String name, String brand) {
        //TODO:
        return null;
    }

    @Override
    public String closedBill(int tableNumber) {
        //TODO:
        return null;
    }


    @Override
    public String totalMoney() {
        //TODO:
        return null;
    }
}
