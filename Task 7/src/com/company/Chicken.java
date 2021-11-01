package com.company;

public class Chicken extends NonFlyingBird{

    public Chicken() {
        super("Orange", "can lay eggs");
    }

    public Chicken(String feathers){
        super(feathers, "can lay eggs");
    }

    @Override
    public void fly(){
        System.out.print("Chicken has " + toString() + " and ");
        super.fly();
    }
}
