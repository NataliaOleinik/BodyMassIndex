public class  Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60;
        int height = 163;
        double index = service.calculate(weight, height);
        System.out.printf("Индекс массы тела %.2f", index);
    }
}
