record Cigar(String model) {}

public class ClassAndObject {
    public static void main(String[] args) {
        Cigar cigar1 = new Cigar("Marlboro");
        Cigar cigar2 = new Cigar("Dunhill");

        System.out.println("Cigar brand 1: " + cigar1.model());
        System.out.println("Cigar brand 2: " + cigar2.model());
    }
}
