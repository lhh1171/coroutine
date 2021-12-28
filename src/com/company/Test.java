package com.company;

import java.lang.reflect.InvocationTargetException;

class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Main main = new Main();
        main.init();
        main.xxx();
    }
}
