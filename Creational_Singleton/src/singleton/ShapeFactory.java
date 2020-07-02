/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class ShapeFactory {
    private static ShapeFactory instance;
    
    protected ShapeFactory()
    {}
    
    public static ShapeFactory Instance()
    {
        if(instance == null)
            instance = new ShapeFactory();
        return instance;
    }
    
    public Shape createShape(ShapeType shapeType)
    {
        switch(shapeType)
        {
            case circle: return new Circle();
            case rectangle: return new Rectangle();
            case triangle: return new Triangle();
        }
        
        return null;
    }
}
