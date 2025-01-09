import java.util.Scanner;

public class Demo021{

    public static double calculateTax(double monthlyGrossSalary, double hra, double pf) {
        // Calculate annual salary and deductions
        double annualSalary = monthlyGrossSalary * 12;
        double deductions = hra * 12 + pf * 12;
        double taxableIncome = annualSalary - deductions;

        // Calculate tax using tax slabs
        if (taxableIncome <= 500000) {
            return taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            return 500000 * 0.10 + (taxableIncome - 500000) * 0.20;
        } else {
            return 500000 * 0.10 + 500000 * 0.20 + (taxableIncome - 1000000) * 0.30;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly gross salary: ");
        double monthlyGrossSalary = scanner.nextDouble();

        System.out.print("Enter monthly HRA: ");
        double hra = scanner.nextDouble();

        System.out.print("Enter monthly PF: ");
        double pf = scanner.nextDouble();

        double tax = calculateTax(monthlyGrossSalary, hra, pf);

        System.out.printf("Annual income tax: Rs %.2f%n", tax);
    }
}
