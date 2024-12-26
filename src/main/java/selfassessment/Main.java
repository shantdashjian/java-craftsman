package selfassessment;

public class Main {

    public static void main(String[] args) {
        int max = args.length == 1 ? Integer.parseInt(args[0]) : 100;
        FizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(1, max);
    }
}
