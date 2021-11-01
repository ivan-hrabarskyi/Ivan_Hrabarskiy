package com.company;

public class Eagle extends FlyingBird{

    public Eagle() {
        super("Black", "can lay eggs");
    }

    public Eagle(String feathers){
        super(feathers, "can lay eggs");
    }

    @Override
    public void fly(){
        System.out.print("Eagle has " + toString() + " and ");
        super.fly();
    }
}
