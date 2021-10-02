class Half {
    public static void main(String[] args) {
        int x = Integer.parseInt(System.console().readLine());
        int y = Integer.parseInt(System.console().readLine());

        for (int i = x; i <= y; i++) {
            System.out.println(i/2.0);
        }
    }
}