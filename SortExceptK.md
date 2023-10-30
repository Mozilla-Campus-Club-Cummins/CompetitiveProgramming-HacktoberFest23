<h2>Problem Statement: Given an array A of positive integers, sort the array in ascending order such that element at index K in unsorted array stays unmoved and all other elements are sorted.</h2>
<h2>Author:[Rutvika Wagh] </h2>
<h3>Keypoint: Import of Arrays Class from java.util package that is: <i><ul>import java.util.Arrays;</ul></i></h3>
<h3>Solution : ****Java Function Code:****</h3>
<h3>

  
    static int sortExceptK(int arr[], int k, int n)
    {
         
        // Move k-th element to end of array.
        int temp = arr[k];
        arr[k] = arr[n-1];
        arr[n-1] = temp;
     
        // Sort all elements except last one.
        Arrays.sort(arr, 0, n-1); // From import java.util.Arrays;
     
        // Store last element (originally k-th)
        int last = arr[n-1];
     
        // Move all elements from k-th to one
        // position ahead.
        for (int i = n-1; i > k; i--)
        arr[i] = arr[i-1];
     
        // Restore k-th element
        arr[k] = last;
        return 0;
    }
    
    
</h3>
