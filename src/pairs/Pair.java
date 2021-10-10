package pairs;

public class Pair {
    private double num1;
    private double num2;

    public Pair(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getSum() {
        return num1 + num2;
    }

    public double getDiff() {
        return num1 - num2;
    }

    public double getProduct() {
        return num1 * num2;
    }

    public double getAverage() {
        return getSum() / 2;
    }

    public double getDistance() {
        return getMaximum() - getMinimum();
    }

    public double getMaximum() {
        return Math.max(num1, num2);
    }

    public double getMinimum() {
        return Math.min(num1, num2);
    }
}
