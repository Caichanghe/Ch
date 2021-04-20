package Zuoye;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入被除数：");
        int a;
        try{
             a=input.nextInt();
        }catch (Exception ex){
            a=100;
            System.out.println("输入错误系统被默认为1");
        }

        System.out.println("请输入除数");
        int b;
        try{
            b=input.nextInt();
        }catch (Exception ex){
            b=1;
            System.out.println("输入错误系统被默认为1");
        }
        double c=(double) a/b;
        System.out.println("结果为："+c);




    }
}
