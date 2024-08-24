package StringBuilder;

public class RverseEachWord {
    public static void main(String[] args) {
        String words="I am an student";
        String ans="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length();i++){
            char ch=words.charAt(i);
            if(ch!=' ')
            {
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb.delete(0,sb.length());
                // or sb=new StringBuilder();
            }

        }
        ans+=sb.reverse();  //this is for last word
        System.out.println(ans);
    }
}
