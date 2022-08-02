package lv2.프린터;

import java.util.ArrayList;
import java.util.List;

// Queue 만 활용한 solution
class Solution2 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> printer = new ArrayList<>();

        for (int priority : priorities) {
            printer.add(priority);
        }

        while (!printer.isEmpty()) {
            Integer priority = printer.remove(0);
            if (printer.stream().anyMatch(otherPriority -> otherPriority > priority)) {
                printer.add(priority);

            } else {
                answer++;
                if (location == 0) {
                    break;
                }
            }

            location--;
            if (location < 0) {
                location = printer.size() - 1;
            }

        }

        return answer;
    }


}
