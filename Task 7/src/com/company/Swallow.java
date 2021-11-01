package com.company;

public class Swallow extends FlyingBird{

    public Swallow() {
        super("Brown", "can lay eggs");
    }

    public Swallow(String feathers){
        super(feathers, "can lay eggs");
    }

    @Override
    public void fly(){
        System.out.print("Swallow has " + toString() + " and ");
        super.fly();
    }
}
