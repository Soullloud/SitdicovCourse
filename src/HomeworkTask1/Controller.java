package HomeworkTask1;

import java.util.Random;

public class Controller {
    public void turnTvOn(Tv tv) {
        tv.turnOn();
    }

    public void turnRandomProgram(Tv tv) {
        Random random = new Random();
        int channelIndex = random.nextInt(tv.getChannelList().size());
        Channel randomChanel = tv.getChannelList().get(channelIndex);
        Program randomProgram = randomChanel.getRandomProgram();
        System.out.println("Включился канал " + randomChanel.getName());
        System.out.println("Включилась программа " + randomProgram.getName());
    }
}
