class ContiguousArray{
    public static int findmaxlength(int [] nums){
        int n=nums.length;
        int maxlength=0;

        for(int i=0;i<n;i++){
            int zero=0;
            int one=0;

            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zero++;
                }
                else{
                    one++;
                }

                if(zero==one){
                    maxlength=Math.max(maxlength,j-i+1);
                }
            }
        }
        return maxlength;
    }

    public static void main(String args[]){
        int[] nums={0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0};
        int result=findmaxlength(nums);

        System.out.print(result);
    }
}