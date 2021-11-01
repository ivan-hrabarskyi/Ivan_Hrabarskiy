package com.company;

import java.util.Objects;

public class Cup {
    private boolean isCupFilled;

    public Cup(){}

    public Cup(boolean isCupFilled){
        this.isCupFilled = isCupFilled;
    }

    public void setCupFilled(boolean cupFilled) {
        isCupFilled = cupFilled;
    }

    public boolean getCupFilled() {
        return isCupFilled;
    }

    public void fillCup(){
        if(isCupFilled == true){
            System.out.println("Stop! You'll spill. The cup if full!");
        }
        else{
            System.out.println("The cup has been filled!");
            isCupFilled = true;
        }
    }

    public void drink(){
        if(isCupFilled == true){
            System.out.println("Tea has been drunk!");
            isCupFilled = false;
        }
        else{
            System.out.println("There is nothing in the cup. Firstly fill the cup!");
        }
    }

    @Override
    public String toString() {
        if(isCupFilled == true) {
            return "Cup is full";
        }
        else{
            return "Cup is empty!";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cup cup = (Cup) o;
        return isCupFilled == cup.isCupFilled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCupFilled);
    }
}
