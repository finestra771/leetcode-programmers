class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] list=new String[s.length()];

        for(int i=0;i<s.length();i++){
            boolean flag=false;
            if(i==0){
                answer[0]=-1;
                list[0]=s.substring(0, 1);
            }
            else{
                list[i]=s.substring(i, i+1);
                for(int j=0;j<i;j++){
                    if(list[j].equals(s.substring(i, i+1))){
                        flag=true;
                    }
                }
                if(flag){
                    for(int j=0;j<i;j++){
                        if(list[j].equals(s.substring(i, i+1))){
                            answer[i]=i-j;
                        }
                    }
                }
                else{
                    answer[i]=-1;
                }
            }
        }
        for(int k=0;k<s.length();k++){
            System.out.println(answer[k]);
        }
        return answer;
    }
}
