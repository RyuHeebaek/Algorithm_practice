class Solution {
    public int solution(int[][] signals) {

        int lcm = 1;
        for (int i = 0; i < signals.length; i++) {
            int cycle = signals[i][0] + signals[i][1] + signals[i][2];
            lcm = lcm(lcm, cycle);
        }

        for (int t = 1; t <= lcm; t++) {
            boolean allYellow = true;

            for (int i = 0; i < signals.length; i++) {
                int G = signals[i][0];
                int Y = signals[i][1];
                int cycle = G + Y + signals[i][2];

                int pos = (t - 1) % cycle;

                if (pos < G || pos >= G + Y) {
                    allYellow = false;
                    break;
                }
            }

            if (allYellow) return t;
        }

        return -1;
    }

    int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}