package StringBuilder;

public class Insert {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder();
        st.append("aksh");
        st.insert(2,'y');
        System.out.println(st);

        st.delete(0,1);   //for range deletion
        st.deleteCharAt(3);// for a char deletion
        System.out.println(st);

        st.reverse(); //reverse string
        System.out.println(st);


    }
}
