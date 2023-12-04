package com.singleton;

public class SingleLazyHolderInitialization {


    public static SingleLazyHolderInitialization getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        static final SingleLazyHolderInitialization INSTANCE = new SingleLazyHolderInitialization();
    }
}
