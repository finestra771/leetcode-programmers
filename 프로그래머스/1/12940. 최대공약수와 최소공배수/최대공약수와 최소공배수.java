class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0]=max(n, m);
        answer[1]=minimal(n, m);
        return answer;
    }
    
    public int minimal(int a, int b){
        int res=a*b;
        for(int i=1;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                res=i;
                break;
            }
        }
        return res;
    }
    public int max(int a, int b){
        int res=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0)res=i;
        }
        return res;
    }
}