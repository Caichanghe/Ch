package UsName;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "蹬老军";
        student1.sex = "男";
        Student student2 = new Student();
        student2.name = "李通";
        student2.sex = "男";
        Student student3 = new Student();
        student3.name = "腾林儿";
        student3.sex = "女";
        Student student4 = new Student();
        student4.name = "长鹤";
        student4.sex = "男";
        Map<String, Student> map = new HashMap<>();
        map.put("kevin", student1);
        map.put("Mackie", student2);
        map.put("David", student3);
        map.put("smoke", student4);
        System.out.println("请输入英文名：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println("英文名是："+name +
                "\n\t姓名：" + map.get(name).name +
                "\n\t性别：" + map.get(name).sex);
    }
}
