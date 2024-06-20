public class SalaryCalculator {

    private static final int MAX_SKIPPED_DAYS = 5;
    private static final double NO_REDUCTION = 1.0;
    private static final double REDUCED_SALARY = 0.85;

    private static final int SELLING_BONUS_POINT = 20;
    private static final int STANDARD_MULTIPLIER = 10;
    private static final int BONUS_MULTIPLIER = 13;

    private static final double BASE_SALARY = 1000.0;
    private static final double CAPPED_SALARY = 2000.0;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < MAX_SKIPPED_DAYS ? NO_REDUCTION : REDUCED_SALARY;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= SELLING_BONUS_POINT ? BONUS_MULTIPLIER : STANDARD_MULTIPLIER;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double countedSalary = (BASE_SALARY * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return Math.min(countedSalary, CAPPED_SALARY);
    }
}
