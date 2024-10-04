public class MaxIndex {
    //Maximum index a pointer can reach in N steps by avoiding a given index B
    public int badIndex(int steps, int badIndex) {
        int sum = 0;
        for (int i = 1; i <= steps; i++) {
            sum = sum + i;
            if (sum == badIndex) {
                sum = steps * (steps + 1) / 2;
                return sum - 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        MaxIndex maxIndex = new MaxIndex();
        System.out.println(maxIndex.badIndex(3,1));
    }
}
