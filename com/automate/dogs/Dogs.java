package com.automate.dogs;

import com.automate.dogs.bulldogs.BullDogs;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public class Dogs {

    BullDogs bullDogs = new BullDogs();
    public String dogsList(){
        return "\tVarious Breeds";
    }

    public String typesOfDogs(){
       return "\nK9-BD-01\tBullDogs"+"\nK9-GR-01\tGoldenRetriever";
    }
}
