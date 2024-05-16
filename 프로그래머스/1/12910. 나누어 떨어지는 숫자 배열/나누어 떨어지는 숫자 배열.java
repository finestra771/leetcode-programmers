import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arr1=new ArrayList();
        for(int num: arr){
            if(num%divisor==0) arr1.add(num);
        }
        Collections.sort(arr1);
        int[] answer=new int[arr1.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=arr1.get(i);
        }
        if(answer.length==0) {
            answer=new int[1];
            answer[0]=-1;
        };
        return answer;
    }
}