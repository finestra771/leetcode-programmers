class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int num=0;
        int originalnum=x;
        while(x!=0){
            num+=x%10;
            x/=10;
        }
        if(originalnum%num==0){
            answer=true;
        }
        return answer;
    }
}