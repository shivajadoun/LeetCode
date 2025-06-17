class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]==10)return false;
        int five=0;
        int ten=0;
       
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)five++;

           else if(bills[i]==10){
            five--;
            ten++;
           }
           else{
            if(ten>0 && five>0){
                ten--;
                five--;
            }else if(five>=3){
                five--;
                five--;
                five--;
            }  else return false;
           }

           
        }
        return true;
      
    }
}