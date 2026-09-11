package September2026;

public class PreserveWhiteSpace {
    public static void main(String[] args){
        String str = "I love Java";
        String[] str1 = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : str1){
            sb.append(s);
        }
sb.reverse();
        for(int i=0;i< str.length();i++){
            if(str.charAt(i) == ' ') {
                sb.insert(i, " ");
            }
        }
        System.out.println(sb);
    }
}
