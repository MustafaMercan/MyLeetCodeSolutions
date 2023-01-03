#include <stdio.h>
#include <stdbool.h>
int ft_strlen(char *str)
{
    int count = 0;
    while(str[count++] != '\0'){ }

    return count-1;
}
int check_substr(char *str,int index_start,int index_end)
{

    /*

bool areDistinct(char str[], int i, int j)
{
 
    // Note : Default values in visited are false
    bool visited[26];
      for(int i=0;i<26;i++)
      visited[i]=0;
 
    for (int k = i; k <= j; k++) {
        if (visited[str[k] - 'a'] == true)
            return false;
        visited[str[k] - 'a'] = true;
    }
    return true;
}

   
    int i = 0;
    i = index_start;
    int j;
    while(i < index_end)
    {
        j = i + 1;
        while(j < index_end)
        {
            if(str[i] == str[j])
                return false;
            j++;
        }
        i++;
    } */

    bool printable[95];
    int i;
    i = 0;
    while(i < 95)
        printable[i++] = false;

    i = index_start;
    int j;
    while(i < index_end)
    {
        if(printable[str[i] - 32] == true)
            return false;
        else
            printable[str[i] - 32] = true;

        i++;
    }
    return true;
}

int lengthOfLongestSubstring(char * s){

    int count = 0;
    int index = ft_strlen(s) - 1;
    int index2 = 0;
    int max_val = 0;
    //char str[] = "mustafa";
    while(index > -1)
    {
        index2 = index - 1;
        max_val = 1;
        while(index2 > -1 && s[index2] != s[index])
        {
            if(!check_substr(s,index2,index))
            {
               break; 
            }
            max_val++;
            index2--;
        }
        count = max_val > count ? max_val : count;
        index--;
    }
    //printf("test-> %d\n",count);


    return count;
}


