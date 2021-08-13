public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bMI = service.calculate(64F, 1.84F);
        System.out.println(bMI);

    }
}
