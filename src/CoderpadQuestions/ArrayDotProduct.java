package CoderpadQuestions;

public class ArrayDotProduct {
    /**
     *
     * Given two arrays of integers, returns the dot product of the arrays
     */


    public static int dotProduct( int[] array1, int[] array2 ) {
        // code goes here
        int sum = 0;
        if(array1.length == 0 || array2.length == 0)
            throw new IllegalArgumentException("Array length is zero");
        for(int i=0;i< array1.length;i++){
          sum += array1[i] * array2[i];
        }

        return sum;

    }

    public static void main( String[] args ) {
        int[] array1 = { 1, 2 };
        int[] array2 = { 2, 3 };
        int result = dotProduct( array1, array2 );

        if( result == 8 ) {
            System.out.println( "Passed." );

        } else {
            System.out.println( "Failed." );
        }
    }
}
