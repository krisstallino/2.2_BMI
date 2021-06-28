public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculateBmi(86.5, 1.6);
        System.out.println("Ваш индекс массы тела " + bmi);

    }
}