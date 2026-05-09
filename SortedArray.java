import java.util.Arrays;

class SortedArray{
    public static double median(int [] nums1, int [] nums2){
        int n = nums1.length;
        int m = nums2.length;

        int [] nums3 = new int [n+m];

        for(int i=0;i<n;i++){
            nums3[i]=nums1[i];
        }

        for(int j=0;j<m;j++){
            nums3[n+j]=nums2[j];
        }

        Arrays.sort(nums3);

        int total=n+m;

        if(total%2 != 0){
            return nums3[total/2];
        }
        return (nums3[total/2-1]+nums3[total/2])/2.0;
    }
    public static void main (String args[]){
        int [] nums1={1,2,3,4};
        int [] nums2={4,5,6,7};

        double result = median(nums1,nums2);

        System.out.print("Median:"+result);
    }
}