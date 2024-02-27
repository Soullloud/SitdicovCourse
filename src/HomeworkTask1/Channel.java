package HomeworkTask1;

import java.util.ArrayList;
import java.util.Random;

public class Channel {
    private String name;
    private ArrayList<Program> programList;

    public Channel(String name) {
        this.name = name;
        this.programList = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProgramList(ArrayList<Program> programList) {
        this.programList = programList;
    }

    public ArrayList<Program> getProgramList() {
        return programList;
    }

    public void addProgram(Program program) {
        programList.add(program);
    }

    public Program getRandomProgram(){
        Random random = new Random();
        int index = random.nextInt(programList.size());
        return  programList.get(index);
    }

}
