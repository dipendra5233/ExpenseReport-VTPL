package com.vikasietum.interviews.expense;

public enum ExpenseType {
    DINNER("Dinner", 5000),
    BREAKFAST("Breakfast", 1000),
    CAR_RENTAL("Car Rental", Integer.MAX_VALUE);

    private final String name;
    private final int limit;

    ExpenseType(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }
}