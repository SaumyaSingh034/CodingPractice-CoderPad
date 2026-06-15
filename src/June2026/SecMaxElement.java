package June2026;

public class SecMaxElement {
    public static void main(String[] args){
        int[] arr = {1,4,3,5,6,7,6,4,6,4,7};
        findSecondMaxElement(arr);
    }

    private static void findSecondMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sMax =  Integer.MIN_VALUE;

        for(int i : arr){
            if(i > max){
                sMax = max;
                max = i;
            } else if (i> sMax && i!=max) {
                sMax = i;
            }
        }
        System.out.println(sMax);
    }
}
