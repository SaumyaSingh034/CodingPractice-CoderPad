package July;

public class StringContainOnlyDigits {
    public static void main(String[] args){
        String n1 = "12345";
        String n2 = "Saumya8778";
        String n3 = "outputCheck";
        System.out.println(isOnlyDigits(n1));
        System.out.println(isOnlyDigits(n2));
        System.out.println(isOnlyDigits(n3));
    }

    private static boolean isOnlyDigits(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException("String is either empty or null");
        }
        for(char c : str.toCharArray()){
            if(!Character.isDigit(c))
                return false;

        }
        return true;
    }
}
