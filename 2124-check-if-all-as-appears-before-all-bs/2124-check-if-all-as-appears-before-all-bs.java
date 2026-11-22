class Solution {
    public boolean checkString(String s) {
        int b=0;
        int a =0;
        for(int i=0;i<s.length();i++){
        if(b>0 && s.charAt(i)=='a'){
            return false;
        }
        if(s.charAt(i)=='a'){
            a++;
        }else{
            b++;
        }
        }
        return true;
    }
}