package Gou;

import NewDog.Dog;

import java.util.HashSet;
import java.util.Set;

public class Gou {
    String name;
    String type;
    static Set <Gou>set1=new HashSet();
    static {
        Gou gou1=new Gou();
        gou1.name="bobo    ";
        gou1.type="藏獒👍";
        Gou gou2=new Gou();
        gou2.name="junjun  ";
        gou2.type="约克夏👍🏻";
        Gou gou3=new Gou();
        gou3.name="runrun  ";
        gou3.type="雪纳瑞👍🏻";
        Gou gou4=new Gou();
        gou4.name="tongtong";
        gou4.type="哈士奇👍🏻";
        set1.add(gou1);
        set1.add(gou2);
        set1.add(gou3);
        set1.add(gou4);
    }
}
