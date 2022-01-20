package string;

public class Anagram_Of_String {
    public static int remAnagrams(String s,String s1)
    {
        //add code here.
        int co=0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            String r = Character.toString(c);
            if(s1.contains(r)){
                int p = s1.indexOf(r);
                s1 = s1.substring(0,p) + "" + s1.substring(p + 1);
            }
            else{
                co++;
            }
        }
        int sum = s1.length()+co;
        return sum;

    }
    public static void main(String[] args) {
        String s = "bcadeh";
        String s1 = "hea";

        System.out.println(remAnagrams(s, s1));
    }
}
