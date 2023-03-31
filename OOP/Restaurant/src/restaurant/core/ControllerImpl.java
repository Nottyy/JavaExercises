package restaurant.core;

import restaurant.common.ExceptionMessages;
import restaurant.common.OutputMessages;
import restaurant.core.interfaces.Controller;
import restaurant.entities.healthyFoods.interfaces.HealthyFood;
import restaurant.entities.drinks.interfaces.Beverages;
import restaurant.entities.healthyFoods.models.Salad;
import restaurant.entities.healthyFoods.models.VeganBiscuits;
import restaurant.entities.tables.interfaces.Table;
import restaurant.common.enums.*;
import restaurant.repositories.interfaces.*;

public class ControllerImpl implements Controller {
    private HealthFoodRepository<HealthyFood> healthyFoodRepo;
    private Repository<Table> tableRepo;
    private Repository<Beverages> beveragesRepo;

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
        //TODO:
        return null;
    }

    @Override
    public String addTable(String type, int tableNumber, int capacity) {
        //TODO:
        return null;
    }

    @Override
    public String reserve(int numberOfPeople) {
        //TODO:
        return null;
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
