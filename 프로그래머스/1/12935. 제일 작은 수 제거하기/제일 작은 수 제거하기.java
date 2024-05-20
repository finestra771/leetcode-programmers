class Solution {
    public int[] solution(int[] arr) {
        int min=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        int[] answer=new int[arr.length-1];
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(index!=i){
                answer[ind]=arr[i];
                ind++;
            }
        }
        if(answer.length==0){
            answer=new int[1];
            answer[0]=-1;
        }
        return answer;
    }
}