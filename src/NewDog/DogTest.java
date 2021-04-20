package NewDog;

public class DogTest {
    public static void main(String[] args) {
        System.out.println("第一条狗的名字是："+Dog.dogList.getFirst().name);
        System.out.println("最后一条狗的名字是："+Dog.dogList.getLast().name);
        Dog.dogList.removeLast();
        Dog.dogList.removeFirst();
        System.out.println("删除之后还剩"+Dog.dogList.size()+"条狗");
        System.out.println("分别是:");
        for(Dog dog:Dog.dogList){
            System.out.println(dog.name+"  "+dog.type);

        }
    }
}
