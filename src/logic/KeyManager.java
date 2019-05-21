package logic;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
    private boolean[] keys;
    public boolean up;
    public boolean down;
    public boolean left;
    public boolean right;
    public boolean startGame;

    public KeyManager() {
        keys = new boolean[1024];
    }

    public void update()
    {
        up=keys[KeyEvent.VK_W];
        down=keys[KeyEvent.VK_S];
        left=keys[KeyEvent.VK_A];
        right=keys[KeyEvent.VK_D];
        startGame=keys[KeyEvent.VK_SPACE];
    }
    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()]=true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()]=false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
