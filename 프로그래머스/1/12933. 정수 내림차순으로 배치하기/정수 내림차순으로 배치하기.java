import java.util.*; 
class Solution {
    public long solution(long n) {
        long answer = 0;
        String number=Long.toString(n);
        int[] arr=new int[number.length()];
        
        for(int i=0;i<number.length();i++){
            String num=number.substring(i, i+1);
            arr[i]=Integer.parseInt(num);
        }
        for(int i=0;i<number.length()-1;i++){
            for(int j=0;j<number.length()-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        long ten=1;
        for(int i=0;i<number.length();i++){
            answer=answer+arr[i]*ten;
            System.out.println(answer);
            ten*=10;
        }
        return answer;
    }
}