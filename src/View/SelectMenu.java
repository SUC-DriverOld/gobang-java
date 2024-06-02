package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectMenu extends JFrame implements MouseListener, ActionListener, MouseMotionListener {
    public Point pos;

    public SelectMenu() {
        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        // 使用系统自带的窗口装饰
        setUndecorated(false);
        setVisible(true);
        setLayout(null);
        setBounds(580, 185, 290, 420);
        setResizable(false);
        paintBg();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addMouseListener(this);
    }


    public void paintBg() {
        ImageIcon image = new ImageIcon("src/images/5.jpg");
        JLabel la3 = new JLabel(image);
        la3.setBounds(0, 0, this.getWidth(), this.getHeight());// 添加图片，设置图片大小为窗口的大小。
        this.getLayeredPane().add(la3, new Integer(Integer.MIN_VALUE)); // 将JLabel加入到面板容器的最高层
        JPanel jp = (JPanel) this.getContentPane();
        jp.setOpaque(false); // 设置面板容器为透明
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (x >= 65 && x <= 231 && y >= 120 && y <= 150) {
            // 人机
            dispose();
            new PCMainBoard();
        } else if (x >= 65 && x <= 231 && y >= 210 && y <= 250) {
            // 人人
            dispose();
            new PPMainBoard();
        } else if (x >= 65 && x <= 231 && y >= 325 && y <= 355) {
            // 退出
            System.exit(0);
        }
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

    public static void main(String[] args) {
        new SelectMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point newPos = new Point(getLocation().x + e.getX() - pos.x, getLocation().y + e.getY() - pos.y);
        setLocation(newPos.x, newPos.y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

