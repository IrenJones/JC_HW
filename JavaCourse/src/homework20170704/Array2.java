package homework20170704;

public class Array2 {

	public int countEvens(int[] nums) {
		  int count = 0;
		  for (int num : nums){
		    if(num%2 == 0){
		      count++;
		    }
		  }
		  return count;
		}
	
	public int bigDiff(int[] nums) {
		  int mini = nums[0];
		  int maxi = nums[0];
		  for(int i=1;i<nums.length;i++){
		    if(nums[i]< mini){
		      mini = nums[i];
		    }
		    if(nums[i] > maxi){
		      maxi = nums[i];
		    }
		  }
		  return maxi-mini;
		}

	
	public int centeredAverage(int[] nums) {
		  int mini = 0;
		  int maxi = 0;
		  for(int i=1;i<nums.length;i++){
		    if(nums[i]< nums[mini]){
		      mini = i;
		    }
		    if(nums[i] >= nums[maxi]){
		      maxi = i;
		    }
		  }
		  int sum = 0;
		  for(int i=0;i<nums.length;i++){
		    if (i!=mini && i!=maxi){
		      sum+=nums[i];
		    }
		  }
		  return sum/(nums.length-2);
		}
	
	
	
	public static void main(String[] args) {
		System.out.println("");
	}
}
