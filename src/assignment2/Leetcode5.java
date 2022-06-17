package assignment2;

public class Leetcode5 {
    public boolean threeConsecutiveOdds() {
        int arr[] = {102,780,919,897,901};

        if (arr.length < 3) {
            return false;
        }

        if (arr[0] % 2 != 0 && arr[1] % 2 != 0 && arr[2] % 2 != 0) {
            return true;
        }
        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }

        }
        return false;
    }
}
