package LessonTask;

import java.util.Random;

public class Generator {
    public  User[] generate (int count, int maxAge){
        Random random = new Random();

        User[] user = new User[count];

        for (int i = 0; i < user.length; i++) {
            int randomAge = random.nextInt(maxAge);
            user[i] = new User(randomAge, "User" + i);
        }
        return user;
    }
}
