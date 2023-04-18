class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        for(int row = 0; row < mat.length; row++) {
            int count = 0;
            for(int x : mat[row]) {
                if(x == 1) count++;
            }
            if(count > result[1]) {
                result[0] = row;
                result[1] = count;
            }
        }
        return result;
    }
}