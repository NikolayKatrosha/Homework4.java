package homework4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car car = new Car();

        //Будем считать, что расстояние между Одесса-Киев = 500км.
        System.out.println("В Кривом Озере до полного бака нужно будет залить: " +
                Car.GetFuelToGetFullTank(179, 70, 6, 70));
        System.out.println("В Жашкове до полного бака нужно будет залить: " +
                Car.GetFuelToGetFullTank(155, 70, 6, 70));
        int priceOfFuel = 28;
        System.out.println("Общая стоимость топлива в грн: " +
                priceOfFuel * Car.GetFuelToGetFullTank(334, 70, 6, 70));
        System.out.println("Остаток топлива в пункте назначения: " +
                Car.CountRestOfFuel(148, 6, 70) + " л");
    }

}

