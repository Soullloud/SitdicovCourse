package HomeworkTask1;

import java.util.ArrayList;

public class Channel {
    private String name;
    private ArrayList<Program> program;

    public Channel(String name){
        this.name = name;
        program = new ArrayList<>();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public void addProgram(ArrayList<Program>program){
        this.program.addAll(program);
    }

}
