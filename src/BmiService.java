public class BmiService {
    public int calculate(int massKG, float heightM) {
        return (int) (massKG/Math.pow(heightM,2));
    }
}
