package com.dogan.model;

public class Wardrobe {
    private int width;
    private int height;
    private int weight;
    public Wardrobe(int width,int height,int weight){
        this.weight=weight;
        this.height=height;
        this.width=width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
