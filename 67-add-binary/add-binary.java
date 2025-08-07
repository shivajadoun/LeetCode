
class Solution {
    public String addBinary(String a, String b) {
          StringBuilder sb=new StringBuilder();

          int i=a.length()-1;
           int j=b.length()-1;
          int rem=0;
         while(i>=0 || j>=0  || rem!=0){
            int biteA=(i>=0)? a.charAt(i--)-'0':0;
            int biteB=(j>=0)? b.charAt(j--)-'0':0;
            int sum=biteA+biteB +rem;
            sb.append(sum%2);
            rem=sum/2;
         }
         return sb.reverse().toString();

    }
}
