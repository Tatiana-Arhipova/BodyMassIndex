public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bodyMass = 64f;
        float growth = 1.84f;
        float bMI = service.calculate(bodyMass, growth);
        System.out.println(bMI);

    }
}
