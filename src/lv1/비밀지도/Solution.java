package lv1.비밀지도;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[][] map1 = new String[n][n];

        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < n; i++) {
            num1 = arr1[i];
            num2 = arr2[i];
            for (int j = n - 1; j >= 0; j--) {
                if (num1 % 2 == 1 || num2 % 2 == 1) {
                    map1[i][j] = "#";
                } else {
                    map1[i][j] = " ";
                }
                num1 /= 2;
                num2 /= 2;
            }
        }


        String secret = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                secret += map1[i][j];
            }
            answer[i] = secret;
            secret = "";
        }

        return answer;
    }
}