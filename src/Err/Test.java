package Err;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public int add(int a,int b){
        return a+b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        Class aClass= null;
        try {
            aClass = Class.forName("Err.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object o= null;
        try {
            o = aClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Method[] methods=aClass.getMethods();
        int err=0;
        for (int i = 0; i <methods.length; i++) {
            if (methods[i].getAnnotations().length>0){
                try{
                    methods[i].invoke(o,1,0);
                } catch (Exception e) {
                    String message = e.getCause().getMessage();
                    err++;
                    System.out.println(methods[i].getName()+"有"+methods[i].getAnnotations().length+"个注释有"+err+"异常"+message);
                }

            }
        }
    }
}
