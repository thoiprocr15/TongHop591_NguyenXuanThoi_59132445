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
public class ConcreteIterator extends MyIterator{
    
    int i;
    public ConcreteIterator(ConcreteAggregate a) {
        super(a);
        i = 0;
    }

    @Override
    int first() {
        i = 0;
        return a.getItem(i);
    }

    @Override
    int next() {
        if (isDone()) return -1;
        else {
            return a.getItem(++i);
        }
    }

    @Override
    boolean isDone() {
        return i == a.count() - 1;
    }

    @Override
    int currentItem(int i) {
        return a.getItem(i);
    }
    
}
