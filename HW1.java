import java.util.Scanner;

public class HW1 {
    /* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
апросить у пользователя ввод данных.
 */
    public static void main(String[] args) {
        System.out.println(inpDoubleNum());
    }

    public static float inpDoubleNum() {
        Scanner scanner = new Scanner(System.in);
        float num=0;
        boolean flag = false;
        while (!flag) {
            System.out.print("Введите число с плавающей запятой в формате x,x где х - целое число: ");
            if (scanner.hasNextFloat()) {
                num = scanner.nextFloat();
                flag = true;
            } else {
                System.out.print("Ошибка ввода! ");
                scanner.next();
            }
        }
        return num;
    }
}
