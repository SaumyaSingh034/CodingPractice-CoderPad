package July17_Coding;

public class ConvertUpperToLower {
    public static void main(String[] args){
        String str = "HexAwarE";
        convertUpperToLower(str);
    }

    private static void convertUpperToLower(String str) {
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }else{
                result.append(Character.toUpperCase(c));
            }
        }
        System.out.println(result);
    }
}
