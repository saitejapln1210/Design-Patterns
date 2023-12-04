package com.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonEagerInitialization singletonEagerInitialization = SingletonEagerInitialization.getInstance();
        System.out.println("Singleton Eager Initialization first object: " + singletonEagerInitialization);
        SingletonEagerInitialization anotherSingletonEagerInitialization = SingletonEagerInitialization.getInstance();
        System.out.println("Singleton Eager Initialization second object: " + anotherSingletonEagerInitialization);
        System.out.println("***********************************");
        SingleLazyHolderInitialization singleLazyHolderInitialization = SingleLazyHolderInitialization.getInstance();
        System.out.println("Singleton Lazy Holder Initialization first object: " + singleLazyHolderInitialization);
        SingleLazyHolderInitialization anotherSingleLazyHolderInitialization = SingleLazyHolderInitialization.getInstance();
        System.out.println("Singleton Lazy Holder Initialization second object: " + anotherSingleLazyHolderInitialization);
    }
}
