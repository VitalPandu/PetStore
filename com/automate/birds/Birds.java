package com.automate.birds;

import com.automate.birds.abudant.AbudantBirds;
import com.automate.birds.exotic.ExoticBirds;

public class Birds {
    private AbudantBirds abundantBirds= new AbudantBirds();
    private ExoticBirds exoticBirds= new ExoticBirds();

    public String availableBirds() {
        return "\n\tAbundantBirds\tExoticBirds";
    }

    public String listOfProducts(){
        return abundantBirds.abundantBirdsList()+exoticBirds.exoticBirdsList();
    }
}
