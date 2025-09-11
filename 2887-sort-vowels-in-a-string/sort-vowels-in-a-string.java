class Solution {
    public String sortVowels(String s) {
         PriorityQueue<Character>pq=new PriorityQueue<>();
         for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u'|| c=='A' || c=='E' || c=='I'|| c=='O'|| c=='U') pq.add(c);
         }   
            String ans="";
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u'|| c=='A' || c=='E' || c=='I'|| c=='O'|| c=='U') ans+=pq.poll();
               else   ans+=c;
            }
   return ans;  
    }
}