package com.company;

public class Penguin extends NonFlyingBird{
    public Penguin() {
        super("Black and while", "can lay eggs");
    }

    public Penguin(String feathers){
        super(feathers, "can lay eggs");
    }

    @Override
    public void fly(){
        System.out.print("Penguin has " + toString() + " and ");
        super.fly();
    }
}
