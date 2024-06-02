package View;

public class Mediator {
    private PPMainBoard mb;
    private PPChessBoard cb;

    public Mediator(PPMainBoard mb, PPChessBoard cb) {
        this.cb = cb;
        this.mb = mb;
    }

    public void deliverMsg(int clickable) {
        // cb.setClickable(clickable);
    }
}
