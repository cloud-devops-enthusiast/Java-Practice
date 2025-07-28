**Selection Sort Algorithm**

The selection sort algorithm finds the lowest value in an array and moves it to the front of the array.

The algorithm looks through the array again and again, moving the next lowest values to the front, until the array is sorted.

*Selection Sort Implementation*

An inner loop that goes through the array, finds the lowest value, and moves it to the front of the array. The loop must loop through ones less value each time it runs.

An Outer loop that controls how many times the inner loop must run. For an array with n values, this outer loop must run n-1 times.

*Selection Sort Shifting Problem*

As seen in last implementation we can see one thing we are moving the whole array while bringing the smallest element to the front of array or vice-versa. So in this process there is a bit of more time involved in moving the whole elements which is making it more time consuming process. So there is a new idea in which we can swap the elements rather than moving an array.

Like here we have an array:

int[] myArray = {25, 34, 80, 15, 47, 62, 53, 76)
Index:            0   1   2   3   4   5   6   7

Here in the given array we can swap the location of the smallest element of the array, like we have 15 at 3rd index of an array, we can swap it with 25 at element. 

int[] myArray = {15, 34, 80, 25, 47, 62, 53, 76)
Index:            0   1   2   3   4   5   6   7

Also it also does not matter where we put the other value, because it is not sorted yet.