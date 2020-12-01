public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean square = new Pythagorean();
        Double ourSquare = square.calculateHypotenuse(4, 5);
        System.out.println(ourSquare);
    }
}