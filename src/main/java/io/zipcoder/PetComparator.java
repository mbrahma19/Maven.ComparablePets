package io.zipcoder;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        return o2.compareTo(o1);
    }
}
