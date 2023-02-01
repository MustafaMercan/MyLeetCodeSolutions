/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    
    struct ListNode* iter;
    int size = 0;
    int count = 0;
    if(head == NULL)
        return NULL;

    iter = head;
    while(iter->next != NULL)
    {
        size++;
        iter = iter->next;
    }
    size++;
    if(size == 1)
        return NULL;
    iter = head;
    while(count < size && iter != NULL)
    {
        if(size - n - 1 == count)
        {
            if(iter->next != NULL)
            {
                iter->next = iter->next->next;
            }
            printf("%d\n",iter->val);
            break;
        }
        if(size - n - 1 < 0)
        {
            iter = iter->next;
            return iter;
        }
        count++;
        iter = iter->next;
    }
    return head;
}