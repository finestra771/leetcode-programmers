class Solution {
    public int solution(String s) {
        String answer = "";
        String zero="zero";
        String one="one";
        String two="two";
        String three="three";
        String four="four";
        String five="five";
        String six="six";
        String seven="seven";
        String eight="eight";
        String nine="nine";

        for(int i=0;i<s.length();i++){
                if(s.substring(i, i+1).equals("z")){
                    answer+="0";
                    i+=3;
                }
                else if(s.substring(i, i+1).equals("o")){
                    answer+="1";
                    i+=2;
                }
                else if(s.substring(i, i+1).equals("t")){
                    if(s.substring(i+1, i+2).equals("w")){
                        answer+="2";
                        i+=2;
                    }
                    else{
                        answer+="3";
                        i+=4;
                    }
                }
                else if(s.substring(i, i+1).equals("f")){
                    if(s.substring(i+1, i+2).equals("o")){
                        answer+="4";
                        i+=3;
                    }
                    else{
                        answer+="5";
                        i+=3;
                    }
                }
                else if(s.substring(i, i+1).equals("s")){
                    if(s.substring(i+1, i+2).equals("i")){
                        answer+="6";
                        i+=2;
                    }
                    else{
                        answer+="7";
                        i+=4;
                    }
                }
                else if(s.substring(i, i+1).equals("e")){
                    answer+="8";
                    i+=4;
                }
                else if(s.substring(i, i+1).equals("n")){
                    answer+="9";
                    i+=3;
                }
                else{
                    answer+=s.substring(i, i+1);
                }
        }
        System.out.println(answer);
        int ans=Integer.parseInt(answer);
        return ans;
    }
}
