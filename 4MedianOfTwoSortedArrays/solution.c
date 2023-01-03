void fill_array(int*result,int* nums1, int nums1Size, int* nums2, int nums2Size)
{
    int i = 0;
    int j = 0;
    while(i < nums1Size)
    {
        result[i] = nums1[i];
        i++;
    }
    while(j < nums2Size)
    {
        result[i + j] = nums2[j];
        j++;
    }
}
void print_array(int *result,int size)
{
    int i = 0;
    while(i < size)
    {
        printf("%d\n",result[i]);
        i++;
    }
}
void swap(int *a, int *b) {
  int t = *a;
  *a = *b;
  *b = t;
}
int partition(int array[], int low, int high) {
  
  int pivot = array[high];
  int i = (low - 1);

  for (int j = low; j < high; j++) {
    if (array[j] <= pivot) {
      i++;
      swap(&array[i], &array[j]);
    }
  }
  swap(&array[i + 1], &array[high]);
  return (i + 1);
}
void quickSort(int array[], int low, int high) {
  if (low < high) {
    int pi = partition(array, low, high);
    quickSort(array, low, pi - 1);
    quickSort(array, pi + 1, high);
  }
}
void order_array(int* numbers,int size)
{
    quickSort(numbers,0,size-1);

}
double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size){

    int *result = (int*)malloc(sizeof(int) * (nums1Size + nums2Size));
    fill_array(result,nums1,nums1Size,nums2,nums2Size);
    
    order_array(result,nums1Size + nums2Size);
    print_array(result,nums1Size + nums2Size);
    if((nums1Size + nums2Size) % 2 == 0)
        return (double)(result[(nums1Size + nums2Size) / 2] + result[(nums1Size + nums2Size) / 2 - 1]) / 2;

    return (double)result[(nums1Size + nums2Size) / 2] ;
}

