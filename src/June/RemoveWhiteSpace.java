package June;

public class RemoveWhiteSpace {
    public static void main(String[] args){
        String str = "Saumya       coderpad        moc     k     te  ss t";
        System.out.println(str.trim().replaceAll("\\s+",""));
    }
}
