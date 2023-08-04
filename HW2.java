public class HW2 {
    /* Дописать код
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

 */
    public static void main(String[] args) {
        int [] array = new int[]{1,3,5,3,5,6,7};
        testException(array);
    }
    public static void testException(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e ) {
            System.out.println("Calculation failed! Catching exception: " + e);
        }
    }
}
