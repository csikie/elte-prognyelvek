public class Main {
    public static void main(String[] args) {
        double[] array = {1.3, 5.2, 7.7, -2.3, 23.45};
        double sum = 0;
        for (double elem : array) {
            sum += elem;
        }
        double avg = sum / array.length;

        double[] diffFromAvg = new double[5];
        for (int i = 0; i < array.length; i++) {
            diffFromAvg[i] = Math.abs(avg - array[i]);
        }

        int minIdx = 0;
        for (int i = 1; i < array.length; i++) {
            if (diffFromAvg[i] < diffFromAvg[minIdx]) {
                minIdx = i;
            }
        }

        System.out.println("Atlag: " + avg + " az atlaghoz legkozelebb: " + array[minIdx]);
    }
}