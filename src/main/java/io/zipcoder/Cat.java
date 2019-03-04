package io.zipcoder;

public class Cat extends Pet{

    public Cat(){
        this("SparklesIDontKnow");
    }

    public Cat(String name){
        super(name,0);
    }

    public String speak(){
        return "Meow";
    }

    public int compareTo(Object o) {
        if (o instanceof Dog) {
            return -1;
        } else if (o instanceof Turtle) {
            return 1;
        } else{
            return ((Cat) o).getName().compareTo(getName());
        }
    }
}
