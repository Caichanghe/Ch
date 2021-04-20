package Zhanghu;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Login {
    Scanner input = new Scanner(System.in);

    @NameAndPassword(name = "1662562402", password = "123456")
    public void login() {
        while(true)
            try {
            System.out.println("欢迎登陆！！！" + "\n" + "请输入账户：");
            String name = input.next();
            System.out.println("请输入密码：");
            String password = input.next();
            Class<Login> loginClass = Login.class;
            Method login = loginClass.getMethod("login");
            NameAndPassword annotation = login.getAnnotation(NameAndPassword.class);

            if (name.equals(annotation.name()) && password.equals(annotation.password())) {
                System.out.println("密码正确，芝麻开门！");
                break;
            } else {
                System.out.println("密码错误，👁👃🏻👁");
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.login();
    }

}
