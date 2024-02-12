package lv1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

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

    // ✨ 폰켓몬
    public int solution6(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        return Math.min(numsSet.size(), nums.length / 2);
    }

    // ✨ 2016년
    public String solution7(int a, int b) {
        DayOfWeek dayOfWeek = LocalDate.of(2016, a, b).getDayOfWeek();
        return dayOfWeek.name().substring(0, 3);
    }

    // ✨ 가운데 글자 가져오기
    // 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    // 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
    public String solution8(String s) {
        return s.length() % 2 == 0
                ? s.substring(s.length() / 2 - 1, s.length() / 2 + 1)
                : s.substring(s.length() / 2, s.length() / 2 + 1);
    }

    // ✨ 같은 숫자는 싫어
    public int[] solution9(int[] arr) {
        List<Integer> tempList = new ArrayList<>();
        int preNum = 10;
        for (int num : arr) {
            if (num != preNum) {
                tempList.add(num);
            }
            preNum = num;
        }
        return tempList.stream().mapToInt(Integer::intValue).toArray();
    }

    // ✨ 나누어 떨어지는 숫자 배열
    // array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
    // solution을 작성해주세요.
    // divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
    public int[] solution10(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .sorted()
                .toArray();
        return result.length > 0 ? result : new int[]{-1};
    }

    // ✨ 두 정수 사이의 합
    // 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을
    // 리턴하는 함수, solution을 완성하세요.
    // 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
    public long solution11(int a, int b) {
        return a > b
                ? LongStream.range(b, a + 1).sum()
                : LongStream.range(a, b + 1).sum();
    }

    // ✨ 문자열 내 마음대로 정렬하기
    // 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
    // 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    // 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면
    // 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
    public String[] solution12(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted((o1, o2) -> {
                    if (o1.charAt(n) > o2.charAt(n)) {
                        return 1;
                    } else if (o1.charAt(n) < o2.charAt(n)) {
                        return -1;
                    } else {
                        return o1.compareTo(o2);
                    }
                })
                .toArray(String[]::new);
    }

    // ✨ 문자열 내 p와 y의 개수
    // 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
    // s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
    // 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
    // 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
    //
    // 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
    boolean solution13(String s) {
        String upperCaseString = s.toUpperCase();
        long pCount = Arrays.stream(upperCaseString.split(""))
                .filter(str -> str.equals("P"))
                .count();
        long yCount = Arrays.stream(upperCaseString.split("Y"))
                .filter(str -> str.equals("Y"))
                .count();
        return pCount == yCount;
    }

    // ✨ 문자열 내림차순으로 배치하기
    // 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해
    // 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    // s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
    public String solution14(String s) {
        return Arrays.stream(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    // ✨ 문자열 다루기 기본
    // 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    // 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

    public boolean solution15(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }



    public static void main(String[] args) {
        Lv1Solution lv1Solution = new Lv1Solution();
        int[] array = {1, 1, 3, 3, 0, 1, 1,};
        int[] i = lv1Solution.solution9(array);
        for (int i1 : i) {
            System.out.println("i1 = " + i1);
        }
    }
}
