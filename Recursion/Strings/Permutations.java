package Recursion.Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        //permutations("", "abc");

        //ArrayList<String> ans = permutationsList("", "abc");
        //System.out.println(ans);

        System.out.println(permutationsCount("", "abcd"));
    }

    static void permutations(String s1, String s2){
        if(s2.isEmpty()){
            System.out.println(s1);
            return;
        }
        char ch = s2.charAt(0);
        for(int i=0; i<=s1.length(); i++) {
            String f = s1.substring(0, i);
            String s = s1.substring(i, s1.length());
            permutations(f + ch + s, s2.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String s1, String s2){
        if(s2.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(s1);
            return list;
        }
        char ch = s2.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<=s1.length(); i++) {
            String f = s1.substring(0, i);
            String s = s1.substring(i, s1.length());
            ans.addAll(permutationsList(f + ch + s, s2.substring(1)));
        }
        return ans;
    }


    static int permutationsCount(String s1, String s2){
        if(s2.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = s2.charAt(0);
        for(int i=0; i<=s1.length(); i++) {
            String f = s1.substring(0, i);
            String s = s1.substring(i, s1.length());
            count = count + permutationsCount(f+ch+s,s2.substring(1));
        }
        return count;
    }
}
