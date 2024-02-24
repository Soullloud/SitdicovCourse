package LessonTask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Statistic statistic = new Statistic();
        Printer printer = new Printer();
        Generator generator = new Generator();

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int maxAges = scanner.nextInt();

        User[] users = generator.generate(count, maxAges);

        printer.print(users);

        int ages[] = statistic.calcAge(maxAges, users);

        System.out.println("-----");

        printer.print(ages);

    }

}
