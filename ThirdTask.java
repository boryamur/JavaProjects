public class ThirdTask {
    public void calculation(char operation, double number1, double number2) {
        if (operation == '+') {
            System.out.print(number1 + number2);
        } else if (operation == '-') {
            System.out.print(number1 - number2);
        } else if (operation == '*') {
            System.out.print(number1 * number2);
        } else if (operation == '/') {
            if (number2 != 0) {
                System.out.print(number1 / number2);
            } else {
                System.out.print("Ошибка деления на 0! ");
            }
        } else {
            System.out.print("Ошибка. ");
        }
    }
}
