package gfx;

import javax.swing.JFrame;

public class Window extends JFrame
{
    private int width;
    private int height;


    public Window(int width, int height)
    {
        this.width=width;
        this.height=height;
        initializeWindow();
    }
    public void initializeWindow()
    {
        setTitle("River runner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setAutoRequestFocus(true);
    }
    public void start()
    {
        add(new GamePanel(width,height));
        pack();
        setLocationRelativeTo(null);
    }
}