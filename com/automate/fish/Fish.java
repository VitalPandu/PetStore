package com.automate.fish;

public class Fish {

    private  FreshWater freshWater = new FreshWater();
    private SaltWater saltWater = new SaltWater();

    public String typeOfFish() {
        return "\n\t SaltWater\tFresh Water";
    }

    public String freshWaterFish(){
        return freshWater.koi()+freshWater.goldFish();
    }

    public String saltWaterFish() {
        return saltWater.angelFish()+saltWater.tigerShark();
    }
}

