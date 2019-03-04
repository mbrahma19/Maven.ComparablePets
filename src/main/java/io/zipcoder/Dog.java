package io.zipcoder;

public class Dog extends Pet{

    public Dog(){
        this("Lola");
    }

    public Dog(String newName){
        super(newName,0);
    }

    public String speak(){
        return "woof";
    }


    public int compareTo(Object o) {
        return 0;
    }
}
