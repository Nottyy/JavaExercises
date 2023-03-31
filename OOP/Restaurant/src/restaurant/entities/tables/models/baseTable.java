package restaurant.entities.tables.models;

import restaurant.common.ExceptionMessages;
import restaurant.entities.drinks.interfaces.Beverages;
import restaurant.entities.healthyFoods.interfaces.HealthyFood;
import restaurant.entities.tables.interfaces.Table;

import java.util.HashMap;

public abstract class baseTable implements Table {
    private int number;
    private int size;
    private double pricePerPerson;
    private int numberOfPeople;

    private boolean isReservedTable;
    private int bill;
    private HashMap<HealthyFood, Integer> healthyFoods;
    private HashMap<Beverages, Integer> beverages;

    public baseTable(int number, int size, double pricePerPerson) {
        this.number = number;
        this.setSize(size);
        this.pricePerPerson = pricePerPerson;
        this.isReservedTable = false;
        this.numberOfPeople = 0;
        this.bill = 0;
        this.healthyFoods = new HashMap<>();
        this.beverages = new HashMap<>();
    }

    @Override
    public int getTableNumber() {
        return this.number;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_TABLE_SIZE);
        }
        this.size = size;
    }

    @Override
    public int numberOfPeople() {
        return this.numberOfPeople;
    }

    @Override
    public void reserve(int numberOfPeople) {
        if (numberOfPeople <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NUMBER_OF_PEOPLE);
        }

        this.isReservedTable = true;
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public boolean isReservedTable() {
        return this.isReservedTable;
    }

    @Override
    public double pricePerPerson() {
        return this.pricePerPerson;
    }

    @Override
    public double allPeople() {
        return this.numberOfPeople * pricePerPerson;
    }

    @Override
    public void orderHealthy(HealthyFood food) {
        if (this.healthyFoods.containsKey(food) == false){
            this.healthyFoods.put(food, 1);
        }
        else{
            this.healthyFoods.put(food, this.healthyFoods.get(food) + 1);
        }

        this.bill += food.getPrice();
    }

    @Override
    public void orderBeverages(Beverages beverages) {
        if (this.beverages.containsKey(beverages) == false){
            this.beverages.put(beverages, 1);
        }
        else{
            this.beverages.put(beverages, this.beverages.get(beverages) + 1);
        }

        this.bill += beverages.getPrice();
    }

    @Override
    public double bill() {
        return this.bill + this.allPeople();
    }

    @Override
    public void clear() {
        this.beverages.clear();
        this.healthyFoods.clear();
        this.bill = 0;
        this.numberOfPeople = 0;
        this.isReservedTable = false;
    }

    @Override
    public String tableInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Table - " + this.numberOfPeople);
        sb.append(System.lineSeparator());
        sb.append("Size - " + this.size);
        sb.append(System.lineSeparator());
        sb.append("Type - " + this.getClass().getName());
        sb.append(System.lineSeparator());
        sb.append("All price - " + this.allPeople());
        sb.append(System.lineSeparator());

        return sb.toString();
    }
}
