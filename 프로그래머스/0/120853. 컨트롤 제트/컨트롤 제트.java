import java.util.*; 
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] num=new String[s.length()];
        int[] intnum=new int[num.length];
        num=s.split(" ");
        for(int i=0;i<num.length;i++){
            if(isNumeric(num[i])){
                intnum[i]=Integer.parseInt(num[i]);
                answer+=intnum[i];
            }
            else{
                answer-=intnum[i-1];
            }
        }
        return answer;
    }
    
public static boolean isNumeric(String s) {
  try {
      Double.parseDouble(s);
      return true;
  } catch(NumberFormatException e) {
      return false;
  }
}
}