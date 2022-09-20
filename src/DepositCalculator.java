import java.util.Scanner;

public class DepositCalculator {

double сalculateComplexPercent(double a, double y, int d) {
       double pay = a * Math.pow((1 + y / 12), 12 * d);

          return foundRoundNumber(pay, 2);
  }

double сalculateSimplePercent(double doubleAmount, double double_year_rate, int deposit_period) {
    return foundRoundNumber(doubleAmount + doubleAmount * double_year_rate * deposit_period, 2);
    }

double foundRoundNumber(double value, int places) {
       double scale = Math.pow(10, places);

       return Math.round(value * scale) / scale;
}

void calculatePercent() {
      int period;
      int action;
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите сумму вклада в рублях:");
      int amount = scanner.nextInt();

      System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();

      System.out.println("Выберите тип вклада, " + "1 - вклад с обычным процентом, " + "2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double percent = 0;

        if (action == 1) {
            percent = сalculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            percent = сalculateComplexPercent(amount, 0.06, period);
        }
            System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + percent);
    }

public static void main(String[] args) {
        new DepositCalculator().calculatePercent();
}
}