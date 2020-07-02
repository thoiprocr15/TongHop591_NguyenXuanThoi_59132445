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
public class ConcreteAggregate extends Aggregate{
    
    int[] a = {1,2,3,4,5,6,7,8,9,10};
    
    
    
    public int count(){
        return a.length;
    }
    
    public int getItem(int i){
        return a[i];
    }

    @Override
    ConcreteIterator CreIterator() {
        return new ConcreteIterator(this);
    }

    
}
