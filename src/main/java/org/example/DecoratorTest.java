package org.example;


import org.example.decorator.abstact.BubbleLights;
import org.example.decorator.impl.ChristmasTreeImpl;
import org.example.decorator.inteface.ChristmasTree;

public class DecoratorTest {
    public static void main(String[] args) throws Exception, IllegalMonitorStateException {


        ChristmasTree tree = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(tree.decorate());


    }


}