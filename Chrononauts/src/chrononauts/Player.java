/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chrononauts;

import java.awt.Graphics2D;
import java.awt.Image;
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
        g.drawImage(mImage, this, null);
    }

    @Override
    public void update(long deltaTime) {
        this.translate(0.1*deltaTime, 0.2*deltaTime);
        if(this.getTranslateX() > 300)
            this.translate(-300, 0);
        if(this.getTranslateY() > 300)
            this.translate(0, -300);
        this.rotate(0.3*deltaTime);
    }
    
}
