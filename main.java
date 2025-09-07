import java.util.Arrays;
class Main 
{
  /**************************************************************/
  public static void main(String[] args) 
  {
    int [] a = {1, 2, 7, 3, 6, 4, 5, 9, 8, 10};
    System.out.println("ARRAY BEFORE QUICK SORT\n"+Arrays.toString(a));
    quickSort(a, 0, a.length-1);
    System.out.println("\nARRAY AFTER QUICK SORT\n"+Arrays.toString(a));
  }
  /**************************************************************/
  public static int partition(int a[], int low, int high)
  {
    int pivot = high; // last item is the pivot 
    int i=low; // swap will happen on i 
    for(int j=low; j<pivot; j++) // scans through the array 
    {
      if(a[j] >= a[pivot]) // last item smaller than the pivot is pushed to the left 
      {
        swap(a, i, j);
        i=i+1; // swap in this location in the array 
      }
    }
    swap(a, i, pivot); // location of pivot is i 
    return i;
  }
  /**************************************************************/
  public static void swap(int[] numbers, int firstIndex, int secondIndex)
  {
    int tmp = numbers[firstIndex];
    numbers[firstIndex] = numbers[secondIndex];
    numbers[secondIndex] = tmp;
  }
  /**************************************************************/
  public static void quickSort(int a[], int low, int high)
  {
    if(low < high)
    {
      int p = partition(a, low, high);
      quickSort(a, low, p-1);
      quickSort(a, p+1, high);
    }
  }
}
