public class BmiService {
    public double calculate(int weight, int height){
        double index = (double) weight * 100 / (double) height;
        return index;
    }
}
