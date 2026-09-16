class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if((!list.isEmpty()) && (list.get(list.size()-1)[1] >= end)){
                continue;
            }
            for(int j=i+1; j<intervals.length; j++){
                if(end >= intervals[j][0]){
                    end = Integer.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            int[] temp = new int[]{start,end};
            list.add(temp);
        }
        return list.toArray(new int[list.size()][]);
        
    }
}