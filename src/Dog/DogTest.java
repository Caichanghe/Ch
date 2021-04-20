package Dog;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {
        int size=Dog.dogList.size();
        Dog dog=new Dog();

        System.out.println("共有"+size+"条🐶");
        System.out.println("分别是：");
        for (int i = 0; i <size ; i++) {
            dog=Dog.dogList.get(i);
            System.out.println(dog.name+"   "+dog.type);
        }
        Dog.dogList.remove(0);
         Dog.dogList.remove(0);

        System.out.println("删除后还剩"+Dog.dogList.size()+"条狗狗");
        System.out.println("分别是：");
        for (int i = 0; i <Dog.dogList.size() ; i++) {
            dog=Dog.dogList.get(i);
            System.out.println(dog.name+"   "+dog.type);
        }
        Dog dog1=new Dog();
        dog1.name="润润";
        dog1.type="哈士🐶";
        Dog.dogList.add(dog1);
        boolean b=Dog.dogList.contains(dog1);
        if (b){
            System.out.println("集合中包含润润的信息");
        }else{
            System.out.println("集合中不包含润润的信息");
        }

    }
}
