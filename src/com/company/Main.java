package com.company;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    LQueue lQueue;
    Method aaa;
    Method bbb;
    Method ccc;
    Method ddd;
    public  void init() throws NoSuchMethodException {
       lQueue=new LQueue();
       lQueue.createQueue();
       aaa=Task.class.getDeclaredMethod("aaa");
       bbb=Task.class.getDeclaredMethod("bbb");
       ccc=Task.class.getDeclaredMethod("ccc");
       ddd=Task.class.getDeclaredMethod("ddd");
    }

    public  void xxx() throws InvocationTargetException, IllegalAccessException {
         lQueue.push(aaa);
         lQueue.push(bbb);
         yyy();
         lQueue.push(ddd);
         done();
    }
    public  void yyy(){
        lQueue.push(ccc);
    }
    public void done() throws InvocationTargetException, IllegalAccessException {
        lQueue.start();
    }
}
