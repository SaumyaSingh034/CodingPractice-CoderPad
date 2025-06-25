package CoderpadQuestions;

import java.util.HashSet;

public class UniqueTuples {
    public static HashSet<String> uniqueTuples(String input, int len ) {
        // your code
        HashSet<String> resultSet = new HashSet<>();
        int inputLength = 0;
        if(input == null){
            throw new IllegalArgumentException("Input String cannot be null");
        } else{
            inputLength = input.length();
        }
        if(inputLength == 0)
            throw new IllegalArgumentException("Input String cannot be of zero length ");
        if(len <=0)
            throw new IllegalArgumentException("Length of tuple has to be greater than zero");
        if(len > inputLength)
            throw new IllegalArgumentException("Length of tuple" +
                    "cannot be more than length of input string");
       for(int i=0;i<(inputLength - len + 1); i++){
           resultSet.add(input.substring(i, (i+len)));
       }
       System.out.println(resultSet);
       return resultSet;

    }

    public static void main( String[] args ) {
        String input = "aab";
        HashSet<String> result = uniqueTuples( input, 2 );
        if( result.contains( "aa" ) && result.contains( "ab" ) ) {
            System.out.println( "Test passed." );

        } else {
            System.out.println( "Test failed." );

        }
    }
}