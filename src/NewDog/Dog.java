package NewDog;

import java.util.ArrayList;
import java.util.LinkedList;

public class Dog {
    String name;
    String type;

    static LinkedList<Dog> dogList = new LinkedList();

    static {
        Dog dog1 = new Dog();
        dog1.name = "🫁🫁";
        Dog dog2 = new Dog();
        dog2.name = "啵啵";
        dog2.type = "二嘎子";
        Dog dog3 = new Dog();
        dog3.name = "林林";
        dog3.type = "哈士奇";
        Dog dog4 = new Dog();
        dog4.name = "🧍‍♀️";
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
    }
}

