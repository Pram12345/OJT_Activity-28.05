public class buffer {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("ram1");
       // a.deleteCharAt(3);

        //a.append(" is great");

        a.append(" Long live india");
        a.insert(5, " prajapati ");
       System.out.println(a);

        //System.out.println(a.capacity());
    }
}
