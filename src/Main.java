import com.vikasietum.interviews.expense.Expense;
import com.vikasietum.interviews.expense.ExpenseReportPrinter;
import com.vikasietum.interviews.expense.ExpenseType;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Expense> expenses = Arrays.asList(
                new Expense(ExpenseType.DINNER, 6000),
                new Expense(ExpenseType.BREAKFAST, 1200),
                new Expense(ExpenseType.CAR_RENTAL, 3000),
                new Expense(ExpenseType.DINNER, 2000),
                new Expense(ExpenseType.BREAKFAST, 800)
        );

        ExpenseReportPrinter printer = new ExpenseReportPrinter();
        printer.printReport(expenses);
    }
}