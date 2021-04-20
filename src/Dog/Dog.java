package Dog;

import java.util.ArrayList;

public class Dog {
    String name;

    String type;

    static ArrayList<Dog> dogList = new ArrayList();

    static {
        Dog dog1 = new Dog();
        dog1.name = "通通";
        dog1.type = "🐶";
        Dog dog2 = new Dog();
        dog2.name = "啵啵";
        dog2.type = "二哈";
        Dog dog3 = new Dog();
        dog3.name = "林林";
        dog3.type = "哈士猪";
        Dog dog4 = new Dog();
        dog4.name = "军军";
        dog4.type = "🐷";
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
    }
}
