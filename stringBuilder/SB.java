
public class SB {
    public static void main(String[] args) {
        //sb is a string whose type is string builder.
        StringBuilder sb=new StringBuilder("Subha");
        System.out.println(sb);

        // //charAt()
        // System.out.println(sb.charAt(0));

        // //setCharAt()
        // sb.setCharAt(0, 'T');
        // System.out.println(sb);

        // //insert()
        // sb.insert(0, 's');
        // System.out.println(sb);

        // //delete()
        // //it will delete from start index to (end-1) index.
        // sb.delete(0, 1);
        // System.out.println(sb);

        //append()
        sb.append('d');
        sb.append('i');
        sb.append('p');
        System.out.println(sb);

        //length()
        System.out.println(sb.length());
    }
}
