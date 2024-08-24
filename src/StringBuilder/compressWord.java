package StringBuilder;

public class compressWord {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder();
        st.append("aaabbbcdddeeee");
        String ans=""+st.charAt(0);
        int count=1;
        for(int i=1;i<st.length();i++){
            char ch=st.charAt(i);
            if(st.charAt(i)==st.charAt(i-1)){
                count++;
            }
            else{
                if(count>=1)
                {
                    ans+=count;
                    count=1;  //reset count;
                    ans+=ch;  //insert next character
                }
            }
        }
        if(count>=1){
            ans+=count;
        }
        System.out.println(ans);
    }
}
