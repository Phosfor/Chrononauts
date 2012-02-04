/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chrononauts;

import javax.swing.JFrame;

/**
 *
 * @author michael
 */
public class Chrononauts extends JFrame{

    Game mGame;
    
    public Chrononauts()
    {
        mGame = new Game();
        add(mGame);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setTitle("Chrononauts");
        setResizable(false);
        setVisible(true);
    }
    
    public void run()
    {
        mGame.addEntity(new Player());
        mGame.run();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chrononauts chrononauts = new Chrononauts();
        chrononauts.run();
    }
}
