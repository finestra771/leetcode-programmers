import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        //선물 지수: 이번 달까지 자신이 친구들에게 준 선물의 수에서 받은 선물의 수를 뺀 값
        //A와 B가 선물을 주고받은 적이 없거나 정확히 같은 수로 선물을 주고받았다면, B가 A에게 선물을 하나 받음.
        String[] arr = new String[friends.length];
        int[] present_jisu=new int[friends.length];
        String[][] gift_split_res=new String[gifts.length][2];
        
        for(int i=0;i<gift_split_res.length;i++){
                gift_split_res[i][0]= gifts[i].split(" ")[0];
                gift_split_res[i][1]= gifts[i].split(" ")[1];
        }
        // for(int i=0;i<gift_split_res.length;i++){
        //     for(int j=0;j<2;j++){
        //         System.out.print(gift_split_res[i][j]);
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<friends.length;i++){
            int recieved=0;
            int gave=0;
            int jisu=0;
            for(int j=0;j<gifts.length;j++){
                if(gift_split_res[j][0].equals(friends[i])) gave++;
                else if(gift_split_res[j][1].equals(friends[i])) recieved++;
            }
            jisu=gave-recieved;
            present_jisu[i]=jisu;
        }
        // for(int i=0;i<present_jisu.length;i++)  System.out.println(present_jisu[i]);
        int[] present_next=new int[friends.length];
        int[][] present_list=new int[friends.length][friends.length];
        for(int k=0;k<gifts.length;k++){
            for(int i=0;i<friends.length;i++){
                for(int j=0;j<friends.length;j++){
                    if(gift_split_res[k][0].equals(friends[i])&&gift_split_res[k][1].equals(friends[j])) present_list[i][j]++;
                }
            }
        }
        // for(int i=0;i<present_list.length;i++){
        //     for(int j:present_list[i]){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<present_list.length;i++){
            for(int j=0;j<i;j++){
                if(present_list[i][j]>present_list[j][i]){
                    present_next[i]++;
                }
                else if(present_list[i][j]<present_list[j][i]){
                    present_next[j]++;
                }
                else{
                    if(present_jisu[i]>present_jisu[j]) present_next[i]++;
                    else if(present_jisu[i]<present_jisu[j]) present_next[j]++;
                }
            }
        }
        for(int i=0;i<present_next.length;i++){
            if(present_next[i]>answer) answer=present_next[i];   
        }
        return answer;
    }
}