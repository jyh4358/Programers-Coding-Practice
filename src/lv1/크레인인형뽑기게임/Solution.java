package lv1.크레인인형뽑기게임;


import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[i][move - 1]);
                        board[i][move - 1] = 0;
                        break;
                    }
                    if (stack.peek() == board[i][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][move - 1]);
                    }

                    board[i][move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("solution = " + solution.solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));
    }
}
