package View;

import Model.timerThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainBoard extends JFrame implements MouseListener, ActionListener {
    public static final int CAN_CLICK_INFO = 1;
    public static final int CAN_NOT_CLICK_INFO = 0;
    public JLabel label_timeCount;
    public timerThread timer;

    public timerThread getTimer() {
        return timer;
    }

    public JLabel getLabel() {
        return label_timeCount;
    }

    public MainBoard() {
        setLayout(null);
        setBounds(300, 70, 800, 620);
        init1();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setTitle("五子棋游戏");
    }

    public void paint(Graphics g) {
        super.paint(g);
        repaint();
    }

    public void init1() {
        label_timeCount = new JLabel();
        label_timeCount.setFont(new Font("Microsoft Yahei", Font.BOLD, 30));
        label_timeCount.setBounds(602, 50, 230, 40);
        add(label_timeCount);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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

}
