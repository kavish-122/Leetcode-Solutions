class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxheight = 0;
        while(left < right){
            maxheight = Integer.max(maxheight,(Integer.min(height[left],height[right])*(Math.abs(right-left))));
            if(height[left] < height[right]){
                left++;
            }else if(height[left] > height[right]){
                right--;
            }else {
                left++;
            }
        }
        return maxheight;
    }
}