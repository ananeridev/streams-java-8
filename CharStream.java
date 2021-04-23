public class CharStream {
    public static void main(String[] args) {
        
        // "Hello world!".chars().forEach(System.out::print);
        // System.out.println();

        // Fixes the problem
        "Hello world!".chars().forEach(x -> System.out.print((char) x));
        System.out.println();
    }
}
