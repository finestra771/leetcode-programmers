class Solution {
    public int solution(int n) {
        int answer = 0;
        String three="";
        while(n!=0){
            three+=(n%3);
            n/=3;
        }
        System.out.println(three);
        int ten=1;
        for(int i=three.length()-1;i>=0;i--){
            answer+=ten*Character.getNumericValue(three.charAt(i));
            System.out.println(answer);
            ten*=3;
        }
        return answer;
    }
}