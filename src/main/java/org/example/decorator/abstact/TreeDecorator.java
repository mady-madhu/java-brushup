package org.example.decorator.abstact;

import org.example.decorator.inteface.ChristmasTree;

public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    public  TreeDecorator(){
        System.out.println("default constructor");
    }

    public  TreeDecorator(ChristmasTree christmasTree){
        System.out.println("parameter constructor");
        this.tree = christmasTree;
    }
    @Override
    public String decorate() {
        return tree.decorate();
    }
}
