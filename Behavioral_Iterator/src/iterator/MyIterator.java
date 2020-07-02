/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public abstract class MyIterator {
    ConcreteAggregate a;

    public MyIterator(ConcreteAggregate a) {
        this.a = a;
    }
    
    abstract int first();
    abstract int next();
    abstract boolean isDone();
    abstract int currentItem(int i);
    
}
