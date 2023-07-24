class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;

        long t = Math.abs((long) n);
        double result = 1.0;

        while (t > 0) {
            if (t % 2 == 1)
                result *= x;
            x *= x;
            t /= 2;
        }

        if (n < 0)
            result = 1 / result;

        return result;
    }
}
