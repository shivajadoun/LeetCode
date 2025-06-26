class MyCalendar {
   ArrayList<int[]>event;

    public MyCalendar() {
         event=new ArrayList<>();
    }
    
    public boolean book(int ns, int ne) {
            for(int[] i:event){
                 int st=i[0];
                 int end=i[1];
                 if(st<ne && ns<end)return false;
                
            } 
            event.add(new int[]{ns,ne});
            return true;   
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */