//Пользователь вводит с клавиатуры дату в виде числа и номера месяца (оба значения типа int).
// Необходимо определить время года (весна, лето, осень, зима), которому принадлежит данная дата, и вывести на консоль.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день: ");
        int day = in.nextInt();
        while ((day > 31) | (day < 1)){
            System.out.println("Недопустимое значение, введите число от 1 до 31: ");
            day = in.nextInt();
        }
        System.out.println("Введите месяц: ");
        int month = in.nextInt();
        while ((month > 12) | (month < 1)){
            System.out.println("Недопустимое значение, введите число от 1 до 12: ");
            month = in.nextInt();
        }

        if ((month >= 3) & (month <= 5)){
            System.out.println("Весна");
        }else if ((month >= 6) & (month <= 8 )) {
            System.out.println("Лето");
        }else if ((month >= 9) & (month <= 11)) {
            System.out.println("Осень");
        }else{
            System.out.println("Зима");
        }

    }
}