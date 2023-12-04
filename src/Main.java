public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 98;
        float height = 1.87f;
        int bmi = service.calculate(mass, height);
        System.out.println(bmi);
    }
}