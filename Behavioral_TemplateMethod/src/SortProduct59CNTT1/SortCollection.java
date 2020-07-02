/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortProduct59CNTT1;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public abstract class SortCollection<T> {
    
    public abstract int compare(T t1, T t2 );
    
    public void SX(List<T> list)
    {
        for(int i = 0; i <= list.size(); i++)
        {
            for(int j =i+1; j<= list.size(); j++)
            {
                if(compare(list.get(i),list.get(j))==1)
                        {
                            Collections.swap(list,i,j);
                        }
            }
        
        }
    }
    
    public void Display(List<T> list){
        for(int i=0;i<list.size(); i++)
        {
            System.out.println(list.get(i).toString());
        }
    }


}

    
