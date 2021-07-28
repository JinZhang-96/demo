package com.gjbs.util;

import java.io.*;

public class Utils {

    /**
     * 通过对象流转换对象
     * @param a
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object deepClone(Object a ) {
        Object targetObject = null;

        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(a);
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            targetObject = objectInputStream.readObject();
        }catch (Exception e){
            System.out.println("对象转换失败");
        }finally {
            return targetObject;
        }
    }
}
