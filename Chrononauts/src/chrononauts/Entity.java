/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chrononauts;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

/**
 *
 * @author michael
 */
public abstract class Entity{
    
    protected double mX, mY, mRotation;
    
    public Entity()
    {
        this(0, 0);
    }
    
    public Entity(double rotation)
    {
        this(0, 0, rotation);
    }
    
    public Entity(double x, double y)
    {
        this(x, y, 0);
    }
    
    public Entity(double x, double y, double rotation)
    {
        super();
        mX = x;
        mY = y;
        mRotation = rotation;
    }
    
    /**
     * Returns an AffineTransform representing the translation and rotation.
     * (The transformation is applied first, then the rotation)
     * @return translation/rotation-representing AffineTransform which can be used by Graphics2D.drawImage()
     */
    protected AffineTransform getTransform()
    {
        AffineTransform result = new AffineTransform();
        result.translate(mX, mX);
        result.rotate(mRotation);
        return result;
    }
    
    public double getX() { return mX; }
    public double getY() { return mY; }
    public double getRotation() { return mRotation; }
    
    public void setX(double x) { mX = x; }
    public void setY(double y) { mY = y; }
    public void setRotation(double rotation) { mRotation = rotation; }
    
    public abstract void paint(Graphics2D g);
    public abstract void update(long deltaTime);
}
