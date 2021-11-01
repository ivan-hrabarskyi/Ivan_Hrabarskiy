package com.company;

public abstract class Bird {
    private String feathers;
    private String layEggs;

    public Bird(String feathers, String layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return feathers + " feathers, " + layEggs;
    }
}
