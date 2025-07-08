/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] a) {
        if(a.length==0)return null;
        List<Integer>ll=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            while(a[i]!=null){
                ll.add(a[i].val);
                a[i]=a[i].next;
            }
           
        }
         Collections.sort(ll);
            ListNode head=null;
            ListNode temp=null;
            for(int i=0;i<ll.size();i++){
                ListNode newNode=new ListNode(ll.get(i));
                if(head==null){
                    head=newNode;
                    temp=head;
                }else{
                    temp.next=newNode;
                    temp=temp.next;
                }
            }
            return head;
    }
}