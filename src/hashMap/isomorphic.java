package hashMap;

import java.util.HashMap;

public class isomorphic {
    public static boolean isomorphic(String a,String b){
        HashMap<Character,Character> iso=new HashMap<>();
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            Character key=a.charAt(i);
            Character val=b.charAt(i);
            if(iso.containsKey(key)&&iso.get(key)!=val){
                return false;
            }
            if(!iso.containsKey(key))
            {
                iso.put(key,val);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isomorphic("abcdec","viouog"));
    }
}
