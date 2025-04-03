package com.vikasietum.interviews.expense;

public class Expense {
    private final ExpenseType type;
    private final int amount;

    public Expense(ExpenseType type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public ExpenseType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isMeal() {
        return type == ExpenseType.DINNER || type == ExpenseType.BREAKFAST;
    }

    public boolean isOverLimit() {
        return amount > type.getLimit();
    }
}