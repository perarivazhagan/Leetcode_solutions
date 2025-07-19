class Solution {
    public boolean detectCapitalUse(String word) {
        int up=0,lw=0;
        int n=word.length();
        System.out.println(n);
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                up++;
            }
            else if(Character.isLowerCase(ch)){
                lw++;
            }
        }
        System.out.println(lw+" "+up);
        if(up==n){
            return true;
        }
        else if(lw==n){
            return true;
        }
        else if(Character.isUpperCase(word.charAt(0)) &&  lw==n-1) {
            return true;
        }
        else{
            return false;
        }
    }
}