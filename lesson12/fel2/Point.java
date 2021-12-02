class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public int compareTo(Point that) {
        int xCompareResult = Integer.compare(this.x, that.x);

        if (xCompareResult == 0) {
            return Integer.compare(this.y, that.y);
        } else {
            return xCompareResult;
        }
    }
}