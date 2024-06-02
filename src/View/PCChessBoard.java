package View;

import Control.JudgeWinner;
import Model.Chess;
import Model.Computer;
import Model.Coord;

import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PCChessBoard extends ChessBoard {
    private final int role;
    private int result = 1;
    private final PCMainBoard mb;
    private final WinDialog dialog;
    private final Computer com;
    private final int[][] step = new int[30 * 30][2];
    private int stepCount = 0;

    public void setResult(int result) {
        this.result = result;
    }

    public PCChessBoard(PCMainBoard mb) {
        this.mb = mb;
        role = Chess.WHITE;
        com = new Computer();
        dialog = new WinDialog(mb, "恭喜", true);
        setBorder(new LineBorder(new Color(0, 0, 0)));
    }

    /**
     * 保存黑白棋子的坐标于二维数组中
     *
     */
    private void saveStep(int posX, int posY) {
        stepCount++;
        step[stepCount][0] = posX;
        step[stepCount][1] = posY;
    }

    public void backStep() {
        if (stepCount >= 2) {
            chess[step[stepCount][0]][step[stepCount][1]] = 0;
            chess[step[stepCount - 1][0]][step[stepCount - 1][1]] = 0;
            stepCount = stepCount - 2;
        }
    }

    public void WinEvent(int winner) {
        // 白棋赢
        if (winner == Chess.WHITE) {
            result = GAME_OVER;
            try {
                mb.getTimer().interrupt();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            mb.getBtn_startGame().setText("开始游戏");
            mb.getBtn_startGame().setEnabled(true);
            dialog.setWinnerInfo("白棋获胜!");
            setClickable(MainBoard.CAN_NOT_CLICK_INFO);
            dialog.setVisible(true);
            if (dialog.getMsg() == WinDialog.BACK) {
                mb.dispose();
                new SelectMenu();
            } else {
                initArray();
            }
        }
        // 黑棋赢
        else if (winner == Chess.BLACK) {
            result = GAME_OVER;
            try {
                mb.getTimer().interrupt();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            mb.getBtn_startGame().setText("开始游戏");
            mb.getBtn_startGame().setEnabled(true);
            setClickable(MainBoard.CAN_NOT_CLICK_INFO);
            dialog.setWinnerInfo("黑棋获胜!");
            dialog.setVisible(true);
            if (dialog.getMsg() == WinDialog.BACK) {
                mb.dispose();
                new SelectMenu();
            } else {
                initArray();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int winner;
        if (clickable == MainBoard.CAN_CLICK_INFO) {
            chessX = e.getX();
            chessY = e.getY();
            if (chessX < 524 && chessX > 50 && chessY < 523 && chessY > 50) {
                float x = (float) (chessX - 49) / 25;
                float y = (float) (chessY - 50) / 25;
                int x1 = (int) x;
                int y1 = (int) y;
                // 如果这个地方没有棋子
                if (chess[x1][y1] == Chess.NO_CHESS) {
                    chess[x1][y1] = role;
                    saveStep(x1, y1);
                    setClickable(MainBoard.CAN_NOT_CLICK_INFO);
                    winner = JudgeWinner.PPJudge(x1, y1, chess, role);
                    WinEvent(winner);
                    if (result != GAME_OVER) {
                        Coord coord = com.computePos(chess);
                        chess[coord.getX()][coord.getY()] = Chess.BLACK;
                        saveStep(coord.getX(), coord.getY());
                        winner = JudgeWinner.PPJudge(coord.getX(), coord.getY(), chess, Chess.BLACK);
                        WinEvent(winner);
                        if (result != GAME_OVER) {
                            setClickable(MainBoard.CAN_CLICK_INFO);
                        }
                    }
                }
            }
        }
    }
}
