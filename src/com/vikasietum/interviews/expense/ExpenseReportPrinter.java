package com.vikasietum.interviews.expense;

import java.util.Date;
import java.util.List;

public class ExpenseReportPrinter {
    public void printReport(List<Expense> expenses) {
        int total = 0;
        int mealExpenses = 0;

        System.out.println("Expenses " + new Date());

        for (Expense expense : expenses) {
            if (expense.isMeal()) {
                mealExpenses += expense.getAmount();
            }

            String expenseName = expense.getType().getName();
            String mealOverExpensesMarker = expense.isOverLimit() ? "X" : " ";

            System.out.println(expenseName + "\t" + expense.getAmount() + "\t" + mealOverExpensesMarker);

            total += expense.getAmount();
        }

        System.out.println("Meal expenses: " + mealExpenses);
        System.out.println("Total expenses: " + total);
    }
}