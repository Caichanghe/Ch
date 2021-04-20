package Kec;

import java.util.Scanner;

public class Kecheng {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入课程代码（1～3之间的数字）：");
        String in;
        try {
            in=input.next();
            if ("1".equals(in)) {
                System.out.println("课程为：开发");
            } else if ("2".equals(in)) {
                System.out.println("课程为：测试");
            } else if ("3".equals(in)) {
                System.out.println("课程为：嵌入式");
            }else {
                System.out.println("输入错误！！！");
            }
        }catch (Exception ex){
            System.out.println("输入错误！！！");
        }finally {
            System.out.println("欢迎提出建议！");
        }
            input.next();
        System.out.println("好的，我们会虚心改进！！！");
    }

}
