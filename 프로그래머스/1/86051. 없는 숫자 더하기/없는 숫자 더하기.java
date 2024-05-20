import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int index=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int num : numbers){
            arr.add(num);
        }
        Collections.sort(arr);
        System.out.println(arr);
        for(int i=0;i<10;i++){
            if(!arr.contains(index)){
                answer+=index;
            }
            index++;
        }
        return answer;
    }
}