package lv2.소수찾기;

import java.util.HashSet;
import java.util.Iterator;

class Solution {

    HashSet<Integer> numberSet = new HashSet<>();

    public boolean isPrime(int number) {
        if (number == 1 || number == 0) {
            return false;
        }

        int lim = (int) Math.sqrt(number);

        for (int i = 2; i <= lim; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void recursive(String comb, String others) {
        // 1. 현재 조합을 set에 추가한다.
        if (!comb.equals("")) {
            numberSet.add(Integer.valueOf(comb));
        }
        
        // 2. 남은 숫자 중 한개를 더 해 새로운 조합을 만든다.
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }

    public int solution(String numbers) {
        // 1. 모든 조합의 숫자를 만든다.

        recursive("", numbers);

        // 2. 소수의 개수만 센다.

        Iterator<Integer> iterator = numberSet.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (isPrime(number)) {
                count++;
            }
        }

        // 3. 소수의 개수를 반환한다.
        return count;
    }
}