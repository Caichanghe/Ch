package StudentDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("鹤鹤");
        //Object obj = new Object();
        Class classForReflect = student.getClass();
        try {
            //Method m1 = classForReflect.getDeclaredField();
            Method m1 = classForReflect.getDeclaredMethod("setName", String.class);
            Method m2 = classForReflect.getDeclaredMethod("getName");
            m1.invoke(student,"长鹤");
            String name = (String)m2.invoke(student);
            System.out.println("重置后名字为："+name);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}