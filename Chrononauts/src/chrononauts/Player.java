/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chrononauts;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;

/**
 *
 * @author michael
 */
public class Player extends Entity{

    protected Image mImage;
    
    public Player()
    {
        this(0, 0);
    }
    
    public Player(float x, float y)
    {
        super(x, y);
        ImageIcon ii =
            new ImageIcon(this.getClass().getResource("../resource/star.png"));
        mImage = ii.getImage();
    }
    
    @Override
    public void paint(Graphics2D g) {
        g.drawImage(mImage, getTransform(), null);
    }

    @Override
    public void update(long deltaTime) {
        mX += 0.1*deltaTime;
        mY += Math.sin(mY)*deltaTime;
        if(mX > 300)
            mX = 0;
        if(mY > 300)
            mY = 0;
        mRotation += 0.001*deltaTime;
    }
    
}
