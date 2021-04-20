package People;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Person1 {
    public static void main(String[] args) {
        ClassLoader classLoader = Person1.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("People/Pro.properties");
        Properties properties = new Properties();

        try {
            properties.load(inputStream);

        String classNameValue = properties.getProperty("className");//reflect.exercise.Student 类的名字
            String methodNameValue = properties.getProperty("methodName");//getStudentName 类的方法
            String methodNameValue1 = properties.getProperty("methodName1");
            //获取到全路径类的名字、方法的名字
            System.out.println("className="+classNameValue);
            System.out.println("methodName="+methodNameValue);
            Class cls = Class.forName(classNameValue);
            Object obj = cls.newInstance();
            Method myMethod1 =cls.getDeclaredMethod(methodNameValue1);
            String name = (String) myMethod1.invoke(obj);
            System.out.println("修改前的名字是"+name);
            Method myMethod= cls.getDeclaredMethod(methodNameValue ,String.class)  ;
            myMethod.invoke(obj, new String("大傻逼"));
            String name1 = (String) myMethod1.invoke(obj);
            System.out.println("修改后的名字是"+name1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
