import java.util.*;
public class MyArrayList{
    public static void main (String [] args){
        String str = "A quick brown fox jumps over the lazy dog";
        String[] strSplit = str.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strSplit));
        for(String s: list){
            System.out.println(s);
        }

    } 
}