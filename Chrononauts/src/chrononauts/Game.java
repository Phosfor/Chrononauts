/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chrononauts;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author michael
 */
public class Game extends JPanel{
    
    ArrayList<Entity> mEntities;
    
    boolean mRunning = true;

    public Game() {
        setBackground(Color.BLACK);

        mEntities = new ArrayList<Entity>();

        setDoubleBuffered(true);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(Entity ent:mEntities)
        {
            ent.paint((Graphics2D)g);
        }
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void update(long deltaTime)
    {
        for(Entity ent:mEntities)
        {
            ent.update(deltaTime);
        }
    }
    
    public void addEntity(Entity entity)
    {
        mEntities.add(entity);
    }
    
    public void run()
    {
        long lastRender, lastUpdate;
        lastRender = lastUpdate = System.currentTimeMillis();
        while(mRunning)
        {
            long currentTime = System.currentTimeMillis();
            long deltaTime = currentTime - lastUpdate;
            update(deltaTime);
            lastUpdate = currentTime;
            
            if((currentTime - lastRender)>1000/60)
            {
                lastRender = currentTime;
                repaint();
            }
        }
    }
}
