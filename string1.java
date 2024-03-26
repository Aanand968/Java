
public class string1 {
    public static void main(String[] args) {
        String sb1 = "Cheeku";
        StringBuilder sb = new StringBuilder(sb1);

        System.out.println(sb);
        // inserting    
        sb.insert(0, "honey ");
        System.out.println(sb);
        // deletion
        sb.delete(0, 6);
        System.out.println(sb);
        // append character and stritng at the end
        sb.append(" honey ");
        System.out.println(sb);

    }
}
