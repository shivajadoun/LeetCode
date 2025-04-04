class Solution {
    public String[] findWords(String[] words) {
          List<String>ll=new ArrayList();
          for(int i=0;i<words.length;i++){
          String s=words[i].toLowerCase();
          char arr[]=s.toCharArray();
          int a=0;
          int b=0;
          int c=0;
          int n=arr.length;
          for(char ch:arr ){
            if(ch=='q'||ch=='w'||ch=='e'||ch=='r'||ch=='t'||ch=='y'||ch=='u'||ch=='i'||ch=='o'||ch=='p')a++;
            else if(ch=='a'||ch=='s'||ch=='d'||ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='l')b++;
            else if(ch=='z'||ch=='x'||ch=='c'||ch=='v'||ch=='b'||ch=='n'||ch=='m')c++;
          }
          if(n==a||n==b||n==c)ll.add(words[i]);
        }
        String arr2[]=new String[ll.size()];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=ll.get(i);
        }  
        return arr2;
    }
}