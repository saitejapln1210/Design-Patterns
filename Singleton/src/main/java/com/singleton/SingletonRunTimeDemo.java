package com.singleton;

public class SingletonRunTimeDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.println(runtime);
        Runtime anotherRuntime = Runtime.getRuntime();
        System.out.println(anotherRuntime);
        if (runtime == anotherRuntime) {
            System.out.println("They have the same instance");
        }

    }
}