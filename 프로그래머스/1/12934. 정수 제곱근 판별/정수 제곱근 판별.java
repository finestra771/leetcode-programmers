class Solution {
    public long solution(long n) {
        long answer = 0;
        if(Math.sqrt(n)%1==0) {
            long x=(long)Math.sqrt(n)+1;
            answer=x*x;
            }
        else answer=-1;
        return answer;
    }
}