package hashMap;

import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        String s="abracadabra";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)) {
                int old = hm.get(ch);
                int naya = old + 1;
                hm.put(ch, naya);
            }
            else{
                hm.put(ch,1);
            }
        }
        System.out.println(hm);
        char mfc=s.charAt(0);  //max frequency character
        for(Character key: hm.keySet()){
            if(hm.get(key)>hm.get(mfc)) {
                mfc=key;
            }
        }
        System.out.println(mfc);

    }
}
