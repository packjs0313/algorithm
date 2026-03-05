class Solution {
    public int solution(int n, int k) {
        int answer = 12000 * n + 2000 * k;
        int ddd = n / 10 * 2000;
        if (n >= 10) {
            answer -= ddd;
        }
        return answer;
    }
}