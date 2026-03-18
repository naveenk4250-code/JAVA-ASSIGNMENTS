// LeetCode 191 - Number of 1 Bits (Easy)

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1Bits nb = new NumberOf1Bits();
        System.out.println(nb.hammingWeight(11));
        System.out.println(nb.hammingWeight(128));
    }
}
