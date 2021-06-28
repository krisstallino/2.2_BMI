public class BmiService {
    public double calculateBmi (double weight, double height) {
        double bmi;
        bmi = (weight) / (height * 2);
        //weight must be in kg
        //height must be in meters
        return bmi;
    }
}
