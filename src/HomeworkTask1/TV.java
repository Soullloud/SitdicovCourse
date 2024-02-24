package HomeworkTask1;

import java.util.ArrayList;

public class TV {
    private String model;
    private ArrayList<Channels> channels;

    public TV(String model) {
        this.model = model;
        channels = new ArrayList<>();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    //Метод котрый добавляет один канал, Метод который добавляет много каналов, Через конструктор

    public void addChannels(ArrayList<Channels> channels) {
        this.channels.addAll(channels);

    }

    public TV(String model, ArrayList <Channels> channels){
        this.model = model;
        this.channels = channels;

    }
}

