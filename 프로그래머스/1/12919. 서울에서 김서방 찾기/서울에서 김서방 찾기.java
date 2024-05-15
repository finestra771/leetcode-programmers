class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int ans=0;
        int index=0;
        for(String str : seoul){
            if(str.equals("Kim")){
                ans=index;
            }
            index++;
        }
        answer+="김서방은 "+ans+"에 있다";
        return answer;
    }
}