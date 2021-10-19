public class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] data;

    public IntegerMatrix(int rowNum, int colNum, int[] linearData) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        data = new int[rowNum][colNum];

        for (int i = 0; i < linearData.length; i++) {
            int row = i / colNum;
            int col = i % colNum;
            data[row][col] = linearData[i];
        }
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        String colDelim = "";
        String rowDelim = "";

        for (int[] row : data) {
            res.append(rowDelim);
            rowDelim = ";";
            for (int elem : row) {
                res.append(colDelim);
                colDelim = ",";
                res.append(elem);
            }
            colDelim = "";
        }

        return res.toString();
    }
}