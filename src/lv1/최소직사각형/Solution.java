package lv1.최소직사각형;


class Solution {
    public int solution(int[][] sizes) {

        int temp = 0;
        for (int[] size : sizes) {
            if (size[0] > size[1]) {
                temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
        }

        int widthMax = 0;
        int heightMax = 0;

        for (int[] size : sizes) {
            if (size[0] > widthMax) {
                widthMax = size[0];
            }
            if (size[1] > heightMax) {
                heightMax = size[1];
            }
        }

        return widthMax * heightMax;
    }
}
