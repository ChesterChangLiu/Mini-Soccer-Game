package test;

import static org.junit.Assert.*;

import org.junit.Test;
import model.SoccerGame;
import view.GamePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.MenubarListener;

public class MenubarListenerTest {

	@Test
	public void test() {
		GamePanel gp = new GamePanel();
		MenubarListener mbs = new MenubarListener(gp);
		SoccerGame game = gp.getGame();
		ActionEvent e = new ActionEvent(gp, 1, "NEW");
		mbs.actionPerformed(e);
	    
        gp = new GamePanel();
        mbs = new MenubarListener(gp);
        game = gp.getGame();
        e = new ActionEvent(gp, 2, "PAUSE");
        mbs.actionPerformed(e);
        mbs.actionPerformed(e);
        
        game.setPaused(false);
        game.setOver(true);
        e= new ActionEvent(gp, 2, "PAUSE");
        mbs.actionPerformed(e);
        
        gp = new GamePanel();
        mbs = new MenubarListener(gp);
        game = gp.getGame();
        game.setPaused(true);
        e = new ActionEvent(gp, 3, "RESUME");
        mbs.actionPerformed(e);
        mbs.actionPerformed(e);
        
        game.setPaused(true);
        game.setOver(true);
        e = new ActionEvent(gp, 3, "RESUME");
        mbs.actionPerformed(e);
        
        gp = new GamePanel();
        mbs = new MenubarListener(gp);
        game = gp.getGame();
        e = new ActionEvent(gp, 4, "GG");
      
	}

}
