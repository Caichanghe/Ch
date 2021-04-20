package Gou;

import java.util.Iterator;
import java.util.Set;

public class GouTest {
    public static void main(String[] args) {
        Set<Gou> set1 = Gou.set1;
        Iterator<Gou> gouIterator = set1.iterator();
        System.out.println("共计有" + set1.size() + "条狗狗！");
        System.out.println("分别是：");
        Gou dog;
        while (gouIterator.hasNext()) {
         dog=  gouIterator.next();
        System.out.println(dog.name + "       " + dog.type);
    }
    }
}
