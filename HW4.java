import java.util.Scanner;

public class HW4 {
    /* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        inpLine();
    }

    public static void inpLine() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        if (line.isEmpty()) {
            throw new IllegalArgumentException("Ошибка ввода. Пустые строки вводить нельзя!");
        }
        System.out.println("Вы ввели строку: " + line);
    }
}
