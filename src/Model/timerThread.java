package Model;

import javax.swing.*;

public class timerThread extends Thread {
    private final JLabel label;

    public timerThread(JLabel label) {
        this.label = label;
    }

    public void run() {
        long startTime = System.currentTimeMillis();
        do {
            long currentTime = System.currentTimeMillis();
            long time = currentTime - startTime;
            label.setText(format(time));
        } while (!this.isInterrupted());
    }

    private String format(long elapsed) {
        int hour, minute, second;

        elapsed = elapsed / 1000;

        second = (int) (elapsed % 60);
        elapsed = elapsed / 60;

        minute = (int) (elapsed % 60);
        elapsed = elapsed / 60;

        hour = (int) (elapsed % 60);

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
