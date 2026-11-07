import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var input = "out";
        var greetingMessage = """
                Привет, это калькулятор!
                Доступные операции:
                   Введите + для сложения
                   Введите - для вычетания
                   Введите * для умножения
                   Введите / для деления
                   Введите out, чтобы выйти
                """;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(greetingMessage);
            input = scanner.next();

            if (input.equals("out")){
                return;
            }

            char operation = input.charAt(0);

            System.out.println("Введите первое число");
            int firstOperand = scanner.nextInt();

            System.out.println("Введите второе число");
            int secondOperand = scanner.nextInt();

            var result = Calculate(operation, firstOperand, secondOperand);

            System.out.println("Результат: " + result + "\n" +
                    "Нажмите Enter, чтобы продолжить");
            scanner.nextLine();
            scanner.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } while (!input.equals("out"));
    }

    public static int Calculate(char operation, int firstOperand, int secondOperand){

        return switch (operation) {
            case '+' -> firstOperand + secondOperand;
            case '*' -> firstOperand * secondOperand;
            case '-' -> firstOperand - secondOperand;
            case '/' -> firstOperand / secondOperand;
            default -> 0;
        };
    }
}
