/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* result;
    struct ListNode* answer;
    answer = l1;
    int res = 0;
    int tmp = 0;
    int round = 0;
    while(l1->next != NULL || l2->next != NULL)
    {
        if(l1 == NULL)
            tmp = l2->val;
        if(l2 == NULL)
            tmp = l1->val;
        if(l1 != NULL && l2 != NULL)
            tmp = l1->val + l2->val + round;
            
        round = 0;
        if(tmp > 9)
        {
            round = 1;
            tmp -= 10;
        }
        result = l1;
        result->val = tmp;
        res = (10*res ) + tmp;


        if(l1->next != NULL)
            l1 = l1->next;
        if(l2->next != NULL)
            l2 = l2->next;
    }

        

    return answer;
}

