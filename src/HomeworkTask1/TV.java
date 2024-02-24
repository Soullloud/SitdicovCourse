package HomeworkTask1;

import java.util.ArrayList;

public class TV {
    private String model;
    private ArrayList<Channel> channel;

    public TV(String model) {
        this.model = model;
        channel = new ArrayList<>();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    //Метод котрый добавляет один канал, Метод который добавляет много каналов, Через конструктор

    public void addChannels(ArrayList<Channel> channels) {
        this.channel.addAll(channels);

    }

    public TV(String model, ArrayList <Channel> channel){
        this.model = model;
        this.channel = channel;

    }
}

