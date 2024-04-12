package AbramskiyHW;

public class RationalFraction {
    private int numerator;
    private int denominator;

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public RationalFraction() {
        this(0, 1);
    }

    public RationalFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        if (gcd != 0) {
            numerator /= gcd;
            denominator /= gcd;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public RationalFraction add(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    public RationalFraction sub(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    public RationalFraction mult(RationalFraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    public RationalFraction div(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    @Override
    public String toString(){
        return numerator + " / " + denominator;
    }

    public double value(){
        return (double) numerator / denominator;
    }

}




