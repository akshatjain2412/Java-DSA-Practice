package String;

public class PossiblesubstringPalin {
    public static boolean palindrom(String s){
        int st=0;
        int end=s.length()-1;
        while(st<=end)
        {
            if(s.charAt(st)!=s.charAt(end))
            {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String st="naman";
        int count=0;
        for (int i = 0; i <st.length(); i++) {
            for (int j = i+1; j <=st.length() ; j++) {
               if(palindrom(st.substring(i,j))){
                   System.out.println(st.substring(i,j));
                   count++;
               }
            }
        }
        System.out.println(count);
    }
}
