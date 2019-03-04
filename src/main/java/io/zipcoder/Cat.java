package io.zipcoder;

public class Cat extends Pet{

    public Cat(){
        this("SparklesIDontKnow");
    }

    public Cat(String name){
        super(name,0);
    }

    public String speak(){
        return "EeEeeh";
    }
}
