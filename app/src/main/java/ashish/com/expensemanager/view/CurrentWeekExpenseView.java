package ashish.com.expensemanager.view;

import java.util.List;
import java.util.Map;

import ashish.com.expensemanager.model.Expense;

public interface CurrentWeekExpenseView {
  void displayCurrentWeeksExpenses(Map<String, List<Expense>> expensesByDate);

  void displayTotalExpenses(Long totalExpense);
}
