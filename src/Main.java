// Представьте, что вы реализуете программу для банка, которая помогает
// определить, погасил ли клиент кредит или нет. Допустим, ежемесячная сумма
// платежа должна составлять 100 грн. Клиент должен выполнить 7 платежей, но
// может платить реже большими суммами. Т.е., может двумя платежами по 300
// и 400 грн. Закрыть весь долг. Создайте метод, который будет в качестве
// аргумента принимать сумму платежа, введенную экономистом банка. Метод
// выводит на экран информацию о состоянии кредита (сумма задолженности,
// сумма переплаты, сообщение об отсутствии долга).

import java.util.Scanner;

public class Main {

    // переменые 
    // 1 - платеж
    // 2 - Количество платижей
    // 3 - Минимальный взнос
    // сканер

    public static double platezh = 0d;
    public static int kol=1;
    public static int maxKol=7;
    public static double  minWznos= 100d;

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = kol; i <= maxKol; i++) {

            // TODO проверку ввода invalid
            System.out.print("Ввод платежа " + i + "  ");

            // TODO проверна на минималяный взнос
            double buffer = scanner.nextDouble();
            if (buffer >=minWznos ) {
                platezh = platezh + buffer;
            } else {
                i--;
            }

            System.out.println(platezh);

            if ((minWznos * maxKol) <= platezh) {
                break;
            }
        }

        System.out.println("Ура кредит закрит " + platezh);

    }

    // метод принимает аргументами: сумму платежа
    // мметод выаодит на экран (сумма задолженности,сумма переплаты, сообщение об отсутствии долга).
    public static void Kredits(){



    }
}