import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Задача 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Введите ваше число: ");
        // int number = sc.nextInt();
        // sc.close();
        
        // FirstTask task1 = new FirstTask();
        //System.out.println(task1.sum(number));
        // FistTaskF task1f = new FistTaskF();
        // System.out.println(task1f.factorial(number));

        // Задача 2
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Введите число: ");
        // int num = sc.nextInt();
        // sc.close();
        
        // SecondTask task2 = new SecondTask();
        // task2.getSimple(num);

        // Задача 3
        // Реализовать простой калькулятор

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите действие (+, -, *, /): ");
        char operation = sc.nextLine().charAt(0);
        System.out.print("Введите первое число: ");
        double number1 = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double number2 = sc.nextDouble();

        ThirdTask task3 = new ThirdTask();
        task3.calculation(operation, number1, number2);

    }
}
