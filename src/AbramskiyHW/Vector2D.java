package AbramskiyHW;

public class Vector2D {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public Vector2D() {
        this(0, 0);
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    public Vector2D sub(Vector2D other) {
        return new Vector2D(this.x - other.x, this.y - other.y);
    }

    public Vector2D multi(Vector2D other) {
        return new Vector2D(this.x * other.x, this.y * other.y);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double scalarProduct(Vector2D scalar) {
        return this.x * scalar.x + this.y * scalar.y;
    }

}
