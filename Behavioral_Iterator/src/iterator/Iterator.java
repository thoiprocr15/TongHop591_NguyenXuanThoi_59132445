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
public class Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        
        MyIterator b = a.CreIterator();
        System.out.println(b.first());
        while(!b.isDone()){
            System.err.println(b.next());
        }
    }
    
}
