package Arrays;

class LargestSubarryaSum {
    int start, end ;
    public int maxSubArray(int[] arr) {
        int sum = 0 , max = 0;
        for (int i = 0; i <arr.length; i++) {
            sum= sum + arr [i];
            if ( sum > max ){
                max = sum;
               end=i;
            }
            if( sum < 0 ){
                sum = 0;
                start = i + 1;
            }
        }
        return max;
    }
    public static void main(String[] x){
        int maximum;
        LargestSubarryaSum obj = new LargestSubarryaSum();
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        maximum = obj.maxSubArray(nums);
        System.out.println("\nThe largest sum of the SubArray is : "+ maximum);
        System.out.print("The SubArray is : \n[ ");
        for (int i = obj.start; i <= obj.end; i++) {
            System.out.print(nums[i]);
            if (i<obj.end){
                System.out.print(" , ");
            }
        }
        System.out.print(" ]");
    }
}