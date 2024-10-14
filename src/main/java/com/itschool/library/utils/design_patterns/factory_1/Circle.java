package com.itschool.library.utils.design_patterns.factory_1;

import java.awt.*;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}