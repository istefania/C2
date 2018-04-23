package com.example.stef.c2;

public class Car {
    String name;
    String type;
    String color;
    int weight;

    public Car(String name,String type,String color,int weight){
        this.name=name;
        this.type=type;
        this.color=color;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public String getType(){
        return type;
    }

    public String getColor(){
        return color;
    }

    public int getWeight(){
        return weight;
    }

    public void printCar(){
        System.out.println("Car name:"+this.getName());
        System.out.println("Type:"+this.getType());
        System.out.println("Color:"+this.getColor());
        System.out.println("Greutate:"+this.getWeight());

    }

    public static void main(String[] args){
        Car afsd=new Car("A","B","c",100);
        afsd.printCar();
    }

}

