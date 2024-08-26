package hashMap;

import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String a,String b){
        HashMap<Character,Integer> ana=new HashMap<>();
        if(a.length()!=b.length()){
            return false;
        }
        else{
            for(int i=0;i<a.length();i++){
                char ch=a.charAt(i);
                if(!ana.containsKey(ch)) {
                    ana.put(ch,1);
                }
                else{
                    ana.put(ch,ana.get(ch)+1);
                }
            }
        }
        for(int i=0;i<b.length();i++) {
            char ch = b.charAt(i);
            if(!ana.containsKey(ch)){
                return false;
            }
            if (ana.containsKey(ch)&&ana.get(ch)==1) {
                ana.remove(ch);
            }
            if (ana.containsKey(ch)) {
                ana.put(ch, ana.get(ch) - 1);
            }

        }
        if(ana.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println( anagram("silent","listen"));
    }
}
