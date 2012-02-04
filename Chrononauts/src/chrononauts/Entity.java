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
public abstract class Entity extends AffineTransform{
    
    public Entity()
    {
        this(0, 0);
    }
    
    public Entity(double x, double y)
    {
        super();
        this.translate(x, y);
    }
    
    public abstract void paint(Graphics2D g);

    public abstract void update(long deltaTime);
}
