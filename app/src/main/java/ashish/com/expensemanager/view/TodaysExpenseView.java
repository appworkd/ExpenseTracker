package ashish.com.expensemanager.view;

import java.util.List;

import ashish.com.expensemanager.model.Expense;

public interface TodaysExpenseView {
  void displayTotalExpense(Long totalExpense);
  void displayTodaysExpenses(List<Expense> expenses);
}
