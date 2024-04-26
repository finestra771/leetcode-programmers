class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int play_health=health;
        int time=0;
        int line=0;
        int num=0;
        int bandage_time=bandage[0];
        int bandage_heal=bandage[1];
        int bandage_line=bandage[2];
        
        while(time<attacks[attacks.length-1][0]&&play_health>0){
            if(play_health<=0) break;
            time++;
            if(attacks[num][0]==time){
                play_health-=attacks[num][1];
                line=0;
                // System.out.println("몬스터 공격"+attacks[num][1]);
                if(num<attacks.length-1) num++;
            }
            else{
                if(health>play_health){
                    play_health+=bandage_heal;
                    line++;
                    if(line==bandage_time){
                        if(play_health+bandage_line>health) play_health=health;
                        else play_health+=bandage_line;
                        line=0;
                    }
                }
                else play_health=health;
            }
            System.out.println(play_health);
        }
        if(play_health<=0) return -1;
        else return play_health;
    }
}