class ComplexMain {
    public static void main(String[] args) {
        Complex alpha = new Complex();
        Complex beta = new Complex();

        alpha.re = 3;
        alpha.im = 2;
        beta.re = 1;
        beta.im = 2;
        alpha.add(beta);

        System.out.println(alpha.re == 4 && alpha.im == 4 && beta.re == 1 && beta.im == 2);

        alpha.sub(beta);

        System.out.println(alpha.re == 3 && alpha.im == 2 && beta.re == 1 && beta.im == 2);

        alpha.mul(beta);

        System.out.println(alpha.re == -1 && alpha.im == 8 && beta.re == 1 && beta.im == 2);
    }
}