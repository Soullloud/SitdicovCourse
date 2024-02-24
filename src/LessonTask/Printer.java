package LessonTask;

public class Printer {
    public  void print(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            if(ages[i] != 0){
                System.out.printf("Возраст - %2d, встретиося - %10d раз\n", i, ages[i]);
            }
        }
    }
    public void print(User[] users) {
        for (int i = 0; i < users.length; i++) {
            System.out.printf("|%2d|%8s|\n", users[i].age, users[i].name);
        }
    }

}
