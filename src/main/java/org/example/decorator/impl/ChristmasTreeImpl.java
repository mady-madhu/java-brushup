package org.example.decorator.impl;

import org.example.decorator.inteface.ChristmasTree;

public class ChristmasTreeImpl implements ChristmasTree {
    @Override
    public String decorate() {
        return "Christmas Tree";
    }
}
