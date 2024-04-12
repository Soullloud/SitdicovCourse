package AbramskiyHW;

public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(2, 1);

        Vector2D sum = v1.add(v2);
        System.out.println("Сумма векторов = " + sum);

        Vector2D diff = v1.sub(v2);
        System.out.println("Разность векторов = " + diff);

        Vector2D multi = v1.multi(v2);
        System.out.println("Умножение векторов = " + multi);

        System.out.println("Длина вектора v1 = " + v1.length());
        System.out.println("Длина вектора v2 = " + v2.length());

        double scalarProduct = v1.scalarProduct(v2);
        System.out.println("Скалярное производное = " + scalarProduct);

        System.out.println();

        RationalFraction rationalFraction = new RationalFraction(2, 4);

        System.out.println("Сумма = " + rationalFraction.add(rationalFraction));
        System.out.println("Разность = " + rationalFraction.sub(rationalFraction));
        System.out.println("Умножение = " + rationalFraction.mult(rationalFraction));
        System.out.println("Деление " + rationalFraction.div(rationalFraction));
        System.out.println("Десятичное значение " + rationalFraction.value());
    }
}
