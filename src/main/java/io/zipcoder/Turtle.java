package io.zipcoder;

public class Turtle extends Pet{

    public Turtle(){
        this("SparklesIDontKnow");
    }

    public Turtle(String name){
        super(name,0);
    }

    public String speak(){
        return "EeEeeh";
    }

    public int compareTo(Object o) {
        if (o instanceof Dog) {
            return -1;
        } else if (o instanceof Cat) {
            return -1;
        } else{
            return ((Turtle) o).getName().compareTo(getName());
        }
    }
}
