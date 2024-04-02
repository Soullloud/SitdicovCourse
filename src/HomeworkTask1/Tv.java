package HomeworkTask1;

import java.util.ArrayList;

public class Tv {
    private String model;
    private ArrayList<Channel> channelList;

    public Tv(String model) {
        this.model = model;
        this.channelList = new ArrayList<>();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setChannelList(ArrayList<Channel> channelList) {
        this.channelList = channelList;
    }

    public ArrayList<Channel> getChannelList() {
        return channelList;
    }

    public void addChannel(ArrayList<Channel> channels) {
        channelList.addAll(channels);

    }

    //    public void addChannels(Channel channel){
//        channelList.add(channel);
//    }
    public void turnOn() {
        System.out.println("Телевизор включился");
    }
}

