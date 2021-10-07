public class Main {
    public static void main(String[] args) {
        System.out.print("Add meg a tomb meretet: ");
        int n = Integer.parseInt(System.console().readLine());

        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Add meg az" + (i+1) + " szamot: ");
            array[i] = Double.parseDouble(System.console().readLine());
        }

        double sum = 0;
        for (double elem : array) {
            sum += elem;
        }
        double avg = sum / array.length;

        double[] diffFromAvg = new double[n];
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