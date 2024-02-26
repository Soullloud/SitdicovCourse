package HomeworkTask1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tv tv = new Tv("Samsung");

        Channel channel1 = new Channel("Первый");
        Program p1 = new Program("Фильм");
        Program p2 = new Program("Новости");

        channel1.addProgram(p1);
        channel1.addProgram(p2);

        Channel channel2 = new Channel("Второй");
        Program p3 = new Program("Спорт");
        Program p4 = new Program("Докментальное кино");

        channel2.addProgram(p3);
        channel2.addProgram(p4);

        ArrayList<Channel> channels = new ArrayList<>();
        channels.add(channel1);
        channels.add(channel2);

        tv.addChannel(channels);

        Controller controller = new Controller();
        controller.turnTvOn(tv);
        controller.turnRandomProgram(tv);

    }
}
