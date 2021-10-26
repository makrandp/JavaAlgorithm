# search

## binary search

* sudo code
  1. Compare x with the middle element.
  2. If x matches with the middle element, we return the mid index.
  3. Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
  4. Else (x is smaller) recur for the left half.
* O(n) : O(Log n)
* [video](https://www.youtube.com/watch?v=P3YID7liBug)
* [binarySearch.java](binarySearch.java)
