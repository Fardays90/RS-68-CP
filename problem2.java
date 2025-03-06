class Solution {
    public int maxArea(int[] height) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < height.length; i++){
            list.add(height[i]);
        }
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int length = list.get(left) < list.get(right) ? left : right;
            int distance = right - left;
            int area = distance * list.get(length);
            maxArea = area > maxArea ? area : maxArea;
            if(list.get(left) < list.get(right)){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
