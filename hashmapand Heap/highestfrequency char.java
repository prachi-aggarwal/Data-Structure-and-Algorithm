import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        if(hm.containsKey(ch)){
            int oldfreq=hm.get(ch);
            hm.put(ch,oldfreq+1);
        }
        else{
            hm.put(ch,1);
        }
        }
        char ch=str.charAt(0);
        int freq=hm.get(ch);
        for(Character key:hm.keySet()){
            int currfreq=hm.get(key);
            if(currfreq>freq){
                freq=currfreq;
                ch=key;
            }
        }
        System.out.println(ch);
    }

}
