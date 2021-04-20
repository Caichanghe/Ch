package Yichang;

import java.util.Scanner;

public class YcTest {
    public static void main(String[] args) {
        System.out.println("请输入年龄");
        Scanner scanner=new Scanner(System.in);

        Yochang a=new Yochang();
        try {
            int age=scanner.nextInt();
            a.setAge(age);
        }catch (Exception ex){
            System.err.println("输入错误");
            return;
        }

        System.out.println(a.age);
    }
}
