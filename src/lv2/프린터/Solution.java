package lv2.프린터;

import java.util.ArrayList;
import java.util.List;

// Queue + class를 활용한 Solution
// ArrayList는 순서가 보장이 되는 Collection
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        // 1. Queue 만들기
        List<PrintJob> printJobs = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            printJobs.add(new PrintJob(i, priorities[i]));
        }

        while (!printJobs.isEmpty()) {
            // 2. 0번을 꺼내서 max priority가 아니면 다시 끝에 넣기기
           PrintJob printJob = printJobs.remove(0);
            if (printJobs.stream().anyMatch(otherJob -> otherJob.priority > printJob.priority)) {
                printJobs.add(printJob);
            } else {
                // 3. max priority이면 내가 찾는 printJob인지 확인
                answer++;
                if (location == printJob.location) {
                    break;
                }
            }
        }

        return answer;
    }

    class PrintJob {
        int location;
        int priority;

        public PrintJob(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }

}
