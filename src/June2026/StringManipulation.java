package June2026;

public class StringManipulation {
    public static void main(String[] args){
        String str = "icodeinpython";
        int[] space = {1,5,7,9};

        modifyString7(str, space);
    }

    private static void modifyString7(String str, int[] space) {
        StringBuilder result = new StringBuilder(str);
        for(int i : space){
            result.insert(i, " ");
        }
        System.out.println(result);
    }
}
