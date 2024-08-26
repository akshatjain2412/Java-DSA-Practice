package hashMap;

import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        String s="abrakadabra";
        HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(hm.containsKey(ch)){
               hm.put(ch,hm.get(ch)+1);
           }
           else{
               hm.put(ch,1);
           }
       }
       char mfc=s.charAt(0);
       for(char c: hm.keySet())
       {

           if(hm.get(mfc)<hm.get(c)){
               mfc=c;
           }
       }
        System.out.println(mfc);//mfc maximum frequency character
        System.out.println(hm.get(mfc));  //frequency

    }
}
