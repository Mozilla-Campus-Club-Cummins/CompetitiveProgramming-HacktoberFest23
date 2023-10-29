<h1>Problem Statement :Explain in detail the working of Merge sort algorithm precisely and point wise.: </h1>
<h3>Author:[Rutvika Wagh] </h3>
<h3>Keypoints:</h3>
<h4>Merge sort has a predictable O(n log n) time complexity.<br>
It's a stable sorting algorithm, preserving the order of equal elements.<br>
It's suitable for large data sets but requires additional space for temporary storage.</h4>
<h3>****Algorithm****</h3>
<h4>1)Divide: Split the unsorted list into smaller sublists recursively until each sublist contains only one element.<br>

2)Conquer: Sort each of these smaller sublists using the same merge sort algorithm.<br>

3)Merge: Combine two sorted sublists into a single sorted list by comparing and merging elements from each sublist.<br>

4)Repeat: Repeat steps 2 and 3 until the entire list is sorted.<br>

5)Combine Results: Combine the results of all recursive calls to get the final sorted list.</h4>
