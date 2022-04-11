package com.weifang.java.bean;

import java.lang.reflect.Field;

@MyAnnotation
public class IDTest {
    private String ID;

    public static void main(String[] args) throws ClassNotFoundException, ExistException {
        Class IDTestClass = Class.forName("com.weifang.java.bean.IDTest");
        if(IDTestClass.isAnnotationPresent(MyAnnotation.class)){
            Field[] fields = IDTestClass.getDeclaredFields();
            boolean flag = false;
            for (Field f :
                    fields) {
                if(f.getName().equals("ID")&&f.getType().getSimpleName().equals("int")){
                    flag = true;
                    break;
                }
            }
            System.out.println(flag);
            if (!flag) {
                throw new ExistException();
            }
        }
    }
}
