public class Main {

    public static void main(String[] args) {

        double calc1 = calculoIVA(5000);
        System.out.println(calc1);

    }

    static double calculoIVA(int precio){

        return precio * 1.16;
    }
}