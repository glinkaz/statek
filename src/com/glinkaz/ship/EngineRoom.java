package com.glinkaz.ship;

public class EngineRoom<T> implements EngineRoomInterface<T>{

    @Override
    public void go() {
        System.out.println("Plyne");
    }

    @Override
    public void stop() {
        System.out.println("Stoje");
    }
}
