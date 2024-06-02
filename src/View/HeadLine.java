package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;

/**
 * 
 */
public class HeadLine extends JPanel implements MouseListener, MouseMotionListener {
    private Btns btn_close;
    private Btns btn_small;
    private static String[] closeIcons = {
            "src/images/close_icon.png", "src/images/close_pressed.png", "src/images/close_pressed.png"
    };
    private static String[] smallIcons = {
            "src/images/small_icon.png", "src/images/small_pressed.png", "src/images/small_pressed.png"
    };

    public HeadLine() {
        init();
        setLayout(new FlowLayout());
        setVisible(true);
    }

    private void init() {
        btn_close = new Btns(closeIcons, null);
        btn_small = new Btns(smallIcons, null);
        btn_close.setSize(60, 60);
        btn_small.setSize(60, 60);
        // btn_close=new Btns("haha");
        // btn_small=new Btns("hehe");
        add(btn_close);
        add(btn_small);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
