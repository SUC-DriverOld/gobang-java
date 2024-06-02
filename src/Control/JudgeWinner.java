package Control;

public class JudgeWinner {
    public static int PPJudge(int x, int y, int[][] chess, int role) {
        int startX = x, startY = y, count = 1;
        // 竖直方向上判断输赢
        while (true) {
            // 向上判断
            y--;
            if (x >= 0 && x < 19 && y >= 0 && y < 19 && chess[x][y] == role) {
                count++;
            } else {
                break;
            }
        }
        y = startY;
        while (true) {
            // 向下判断
            y = y + 1;
            if (x >= 0 && x < 19 && y >= 0 && y < 19 && chess[x][y] == role) {
                count++;
            } else {
                break;
            }
        }
        if (count >= 5) {
            return role;
        }

        // 水平方向判断输赢
        x = startX;
        y = startY;
        count = 1;
        while (true) {
            // 向左判断
            x--;
            if (x >= 0 && x < 19 && y >= 0 && y < 19 && chess[x][y] == role) {
                count++;
            } else {
                break;
            }
        }
        x = startX;
        while (true) {
            // 向右判断
            x++;
            if (x >= 0 && x < 19 && y >= 0 && y < 19 && chess[x][y] == role) {
                count++;
            } else {
                break;
            }
        }
        if (count >= 5) {
            return role;
        }

        // 右倾斜方向判断输赢
        x = startX;
        y = startY;
        count = 1;
        while (true) {
            // 向左上判断
            y--;
            x--;
            if (x >= 0 && x < 19 && y >= 0 && y < 19 && chess[x][y] == role) {
                count++;
            } else {
                break;
            }
        }
        x = startX;
        y = startY;
        while (true) {
            // 向右下判断
            x++;
            y++;
            if (x >= 0 && x < 19 && y >= 0 && y < 19 && chess[x][y] == role) {
                count++;
            } else {
                break;
            }
        }
        if (count >= 5) {
            return role;
        }

        // 左倾斜方向判断
        x = startX;
        y = startY;
        count = 1;
        while (true) {
            // 向左下判断
            x--;
            y++;
            if (x >= 0 && x < 19 && y >= 0 && y < 19 && chess[x][y] == role) {
                count++;
            } else {
                break;
            }
        }
        x = startX;
        y = startY;
        while (true) {
            // 向右上判断
            x++;
            y--;
            if (x >= 0 && x < 19 && y >= 0 && y < 19 && chess[x][y] == role) {
                count++;
            } else {
                break;
            }
        }
        if (count >= 5) {
            return role;
        }
        return 0;
    }
}
