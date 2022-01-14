public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("The result of SUM is " + calc.sum(3, 3));
        System.out.println("The result of MULT is " + calc.mult(3,3));
        System.out.println("The result of POW is " + calc.pow(3,3));
    }
}
