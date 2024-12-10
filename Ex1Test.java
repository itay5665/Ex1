
public class Ex1Test {
    public static void main(String[] args) {
        testNumber2Int();
        testIsNumber();
        testInt2Number();
    }
    //run test Number2Int return true for good format string or false for bad input
    public static void testNumber2Int() {
        assertEx1Result("1001b2", 9);
    }
    //continue check from 1st fun.
    public static void testIsNumber() {
        System.out.println("Is 101b2 a valid number? " + Ex1.isNumber("101b2"));
    }

    public static void testInt2Number() {
        System.out.println("Converted 10 to base 2: " + Ex1.int2Number(10, 2));
    }
    //check that the result from Ex1 equal to the check result.
    public static void assertEx1Result(String input, int expected) {
        int result = Ex1.number2Int(input);
        if (result == expected) {
            System.out.println("Test passed for " + input);
        } else {
            System.out.println("Test failed for " + input);
        }
    }
}
