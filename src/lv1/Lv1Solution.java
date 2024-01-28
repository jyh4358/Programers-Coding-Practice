package lv1;

class Lv1Solution {
    // ✨ 짝수와 홀수
    // 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
    // 제한 조건
    // num은 int 범위의 정수입니다.
    // 0은 짝수입니다.
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    // ✨ 나머지가 1이 되는 수 찾기
    // 자연수 n이 매개변수로 주어집니다.
    // n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
    // 답이 항상 존재함은 증명될 수 있습니다.
    public int solution2(int n) {
        int answer = 2;
        if (n < 3 || n > 1_000_000) {
            throw new RuntimeException("n은 3이상 1,000,000미만 이어야 합니다.");
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    // ✨ 문자열을 정수로 바꾸기
    // 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
    // 제한 조건
    //  - s의 길이는 1 이상 5이하입니다.
    //  - s의 맨앞에는 부호(+, -)가 올 수 있습니다.
    //  - s는 부호와 숫자로만 이루어져있습니다.
    //  - s는 "0"으로 시작하지 않습니다.
    public int solution3(String s) {
        int answer = 0;
        int sign = 1;

        char[] charArray = s.toCharArray();
        int i = 0;
        if (charArray[0] == '-') {
            sign *= -1;
            i++;
        } else if (charArray[0] == '+') {
            i++;
        }
        for (; i < charArray.length; i++) {
            int pow = 1;
            for (int j = 0; j < charArray.length - (i + 1); j++) {
                pow *= 10;
            }
            answer += (charArray[i] - '0') * pow;
        }

        return answer * sign;
    }

    // ✨ x만큼 간격이 있는 n개의 숫자
    // 함수 solution은 정수 x와 자연수 n을 입력 받아,
    // x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
    // 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
    // todo - LongStream.iterate(x, i->i+x).limit(n).toArray();
    public long[] solution4(int x, int n) {
        long[] answer = new long[n];

        long number = 0;
        for (int i = 0; i < n; i++) {
            number += x;
            answer[i] = number;
        }

        return answer;
    }

    // ✨ 약수의 합
    // 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
    public int solution5(int n) {
        int answer = 0;

        for (int i = 1; i <= (n / 2) + 1; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer + n;
    }

    public static void main(String[] args) {
        Lv1Solution lv1Solution = new Lv1Solution();
        int i = lv1Solution.solution3("+0");
        System.out.println("i = " + i);

        int i1 = 10 ^ 2;
        System.out.println("i1 = " + i1);
    }
}
