public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double weight = 70;
        double height = 1.75;
        double bmiIndex = service.calculate(weight, height);

        System.out.println("Ваш индекс массы тела:" + bmiIndex);
    }
}
