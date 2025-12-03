class Main {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length;i++){
            for(int j = nums.length-1; j >= 0 ;j--){
                 if (nums[i] + nums[j] == target && i != j) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
         int[] result = twoSum(new int[]{1, 2, 3, 4}, 6); 
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}