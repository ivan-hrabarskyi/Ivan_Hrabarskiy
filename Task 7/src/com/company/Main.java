package com.company;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = new Bird[6];
        birds[0] = new Chicken();
        birds[1] = new Eagle();
        birds[2] = new Penguin();
        birds[3] = new Swallow();
        birds[4] = new Chicken("Black");
        birds[5] = new Swallow("Blue");

        for(int i = 0; i < birds.length; i++){
            birds[i].fly();
        }
    }
}
