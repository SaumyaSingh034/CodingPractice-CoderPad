package CoderpadQuestions;

public class SubArrayExceedingSum {
    public static int subArrayExceedsSum(int arr[], int target )

    {
        int i=0, j=0, length = Integer.MAX_VALUE,
                size = arr.length;
        if( target <= 0)
            return 0;
        if(size<1)
            return -1;
        int currentSum = arr[0];
        while(true){
            if(currentSum >= target)
                if(i==j)
                    return 1;
            else {
                if(j-i + 1 < length)
                    length = j-i+1;
                 //   currentSum -= arr[i];
                  //  i++;
                }
        }

    }

    /**
     * Execution entry point.
     */
    public static void main(String[] args)
    {
        boolean result = true;
        int[] arr = { 1, 2, 3, 4 };
        result = result && subArrayExceedsSum( arr, 6 ) == 2;
        result = result && subArrayExceedsSum( arr, 12 ) == -1;

        if( result )
        {
            System.out.println("All tests pass\n");
        }
        else
        {
            System.out.println("There are test failures\n");
        }
    }
}
