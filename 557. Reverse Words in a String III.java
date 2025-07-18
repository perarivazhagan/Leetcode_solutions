class Solution {
    public String reverseWords(String s) {
       String[] st=s.split("\\s+");
       for(int i=0;i<st.length;i++){
        char[] arr=st[i].toCharArray();
        int t=0;
        int en=arr.length-1;
        while(t<en){
            char ch=arr[t];
            arr[t]=arr[en];
            arr[en]=ch;
          t++;
          en--;
        }
          st[i]=new String(arr);
       }
        return String.join(" ",st);
    }
}