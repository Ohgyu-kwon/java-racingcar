package ui;

import study.Car;

import java.util.List;

public class ResultView {
    public static void printRoundResult(List<Car> cars) {

        for (Car car : cars) {
            System.out.print(car.getName() + ":");
            System.out.println(car.getPosition());
        }
        System.out.println();
    }

    public static void printCarString(StringBuilder position ) {
        position.append("-");
    }

    public static void printWinners(String winners) {
        System.out.println(String.join(", ", winners) + "가 최종 우승했습니다.");
    }
}

