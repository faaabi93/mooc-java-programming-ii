
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        MagicSquare ms = new MagicSquare(3);
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(5));
        System.out.println(ms);
        System.out.println(ms.sumsOfRows());
        System.out.println(ms.sumsOfColumns());

    }
}
