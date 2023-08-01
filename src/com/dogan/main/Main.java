package com.dogan.main;

import com.dogan.model.*;

public class Main {
    public static void main(String[] args) {
        Bed yatak = new Bed("Rahat",3,4,5,6);
        Bedroom b1 = new Bedroom("dogan",
                new Wall("south")
                ,new Wall("south"),
                new Wall("south"),
                new Wall("south"),
                new Ceiling(12 , PaintColor.BLUE),
                yatak,
                new Lamp(true,21,LampType.NEON),
                new Wardrobe(3,4,5),
                new Carpet(4,5,PaintColor.WHİTE));
        System.out.println(b1);

        yatak.make();


    }

}