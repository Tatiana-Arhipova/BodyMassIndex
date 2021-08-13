public class BmiService {
    public float calculate(float bodyMass, float growth) {
        float bMI = bodyMass / (growth * growth);
        return bMI;
    }
}
