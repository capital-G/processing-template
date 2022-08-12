package org.example;

import processing.core.PApplet;


public class Sketch extends PApplet {


    public void settings() {
        size(800, 800);
    }


    public void draw() {

        background(0);
        stroke(255.0f);
        rect(200.0f, 200.0f, frameCount%330, frameCount%400);
    }

    public static void main(String[] args) {
        PApplet.main("org.example.Sketch");
    }
}
