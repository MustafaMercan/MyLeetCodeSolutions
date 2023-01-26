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
    public ListNode createNewNode(int val)
    {
        return new ListNode(val);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        ListNode iter;
        List<Integer> elements = new ArrayList<>();
        for(int i = 0 ; i < lists.length; i++)
        {
            iter = lists[i];
            if(iter != null )
            {
                if(iter.next != null)
                {
                    while(iter.next != null)
                    {
                        elements.add(iter.val);
                        iter = iter.next;
                    }
                }
                elements.add(iter.val);
            }
        }
        Collections.sort(elements);
        System.out.println(elements);
        if(elements.size() <= 0)
            return null;
        ListNode res = createNewNode(elements.get(0));
        ListNode tmp = res;
        
        for(int i = 1 ; i < elements.size(); i++)
        {
            tmp.next = createNewNode(elements.get(i));
            tmp = tmp.next;
        }
        return res;
    }
}