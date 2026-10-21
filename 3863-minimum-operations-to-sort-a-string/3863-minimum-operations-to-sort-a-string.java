class Solution {
    public int minOperations(String s) {
        
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        boolean flag =true;
        char min ='z';
        char max='a';
        for(int i=0;i<chars.length;i++){
            if(s.charAt(i)!=chars[i]){
                flag=false;
            }
            if(s.charAt(i)>max){
                max=s.charAt(i);
            }
            if(s.charAt(i)<min){
                min=s.charAt(i);
            }
            
        }
        if(flag){
            return 0;
        }
        if(s.length()==2){
            return -1;
        }
        if(s.charAt(0)==min || max==s.charAt(s.length()-1)){
            return 1;
        }

        char midmax='a';
        char midmin='z';
        for(int i=1;i<chars.length-1;i++){
            if(s.charAt(i)>midmax){
                midmax=s.charAt(i);
            }
            if(s.charAt(i)<midmin){
                midmin=s.charAt(i);
            }
            
        }

        if(s.charAt(0)>midmax && s.charAt(s.length()-1)<midmin){
            return 3;
        }
        
        return 2;
    }
}