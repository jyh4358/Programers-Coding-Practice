package lv1.실패율;

import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double users =stages.length;
        List<double[]> fail_rate = new ArrayList<>();

        int cnt=0;

        for(int i=1;i<=N;i++){
            for(int j=0;j<stages.length;j++){
                if(i==stages[j]){
                    cnt++;
                }
            }
            if(cnt==0){
                fail_rate.add(new double[]{i,0});
                continue;
            }
            fail_rate.add(new double[]{i,cnt/users});
            users-=cnt;
            cnt=0;
        }

        //한 줄로도 쓸수가있다!
        fail_rate.sort((a,b)->Double.compare(b[1],a[1]));

        for(int i=0;i<fail_rate.size();i++){
            answer[i]=(int)fail_rate.get(i)[0];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});

        for (int i : solution1) {
            System.out.println("i = " + i);
        }
    }
}

