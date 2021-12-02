public class ReverseablePoint extends Point implements Reverseable {
    private int prev_x, prev_y;

    public ReverseablePoint(int x, int y) {
        super(x,y);
        prev_x = x;
        prev_y = y;
    }

    @Override
    public void setX(int x) {
        prev_x = this.x;
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        prev_y = this.y;
        super.setY(y);
    }

    public void reverse() {
        x = prev_x;
        y = prev_y;
    }
}