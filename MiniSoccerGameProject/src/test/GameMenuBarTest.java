package test;

import static org.junit.Assert.*;

import org.junit.Test;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import controller.MenubarListener;
import view.GamePanel;
import view.GameMenuBar;

public class GameMenuBarTest {

	@Test
	public void test() {
		GamePanel gp = new GamePanel();
		MenubarListener mbs = new MenubarListener(gp);
		GameMenuBar gmb = new GameMenuBar(mbs);
		
	}

}
