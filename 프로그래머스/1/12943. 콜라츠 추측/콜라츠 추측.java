class Solution {
    public int solution(int num) {
        int answer = 0;
        int count=0;
        if(num==1) return 0;
        while(num!=1){
            if(num%2==0) num/=2;
            else num=num*3+1;
            count++;
            if(count>=500){
                break;
            }
        }
        if(count>=500){
            answer=-1;
        }
        else answer=count;
        return answer;
    }
}