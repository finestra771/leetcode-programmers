class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int index=0;
        for(int num:absolutes){
            if(signs[index]==true) answer+=num;
            else answer-=num;
            index++;
        }
        return answer;
    }
}