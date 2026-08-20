class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1)){

            l1.add(nums[i]);
            System.out.print(nums[i]);
            }
            else{
                l2.add(nums[i]);
                //  System.out.print(nums[i]);
            } 
                
        }
        int arr[]=new int[nums.length];
        int j=0;
        while(j<l1.size()){
            arr[j]=l1.get(j);
            j++;
        }
        int k=0;
        while(j<nums.length){

            arr[j]=l2.get(k++);
            j++;
        }
        return arr;
                               

    }
}