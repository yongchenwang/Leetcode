class Solution {
    public int[] findBuildings(int[] heights) {
        int n = heights.length;
        int[] nextGreaterEqual = new int[n];
        Arrays.fill(nextGreaterEqual,-1);

        Stack<Integer> monoStack = new Stack<>();

        for(int i=0;i<n;i++){
            while(!monoStack.isEmpty() && heights[i]>=heights[monoStack.peek()]) nextGreaterEqual[monoStack.pop()] = i;
            monoStack.add(i);
        }

        List<Integer> resultList = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(nextGreaterEqual[i]==-1) resultList.add(i);
        }

        int[] res = new int[resultList.size()];

        for(int i=0;i<resultList.size();i++) res[i] = resultList.get(i);

        return res;
    }
}