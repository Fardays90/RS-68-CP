# RS-68-CP

# Problem 1(a) -
* The Time complexity for this one is O(nlog(n)). This is because the outer loop runs n times so we get O(n).
  The inner loop has j which increases by a factor of 2 every iteration and the loop runs untill the value is
  smaller or equals to n. As a result taking the worst case scenario we can say 2^k = n where k is a power of
  2 as j increases by a factor of 2 every iteration.Solving for k will tell us the number of iterations which
  is O(log(n)). So total time complexity becomes O(nlog(n)).

# Problem 1(b) -
* The time complexity for this one is O(sqrt(n)). Because we see that the value of i increments by 1 and is
  multiplied by itself untill it is smaller or equals to the parameter x. This is roughly equal to sqrt(x).
  So we can say that the number of iterations here is approximately sqrt(x). So the time complexity is
  O(sqrt(x));


# Problem 2 -
* We take a two pointer approach to solving this. As per instructions we first populate an empty ArrayList
  data structure with the data in the parameter array. After that we create two pointers left and right.
  Left points to the start of the list while the right pointer points to the end of the list. In the
  while loop we run until left < right is false. Inside the loop we first figure out which of the height
  is smaller between the two heights. We store the smaller height and calcualte the distance between the
  two pointers. Then we calcualate the area and compare it to the maxArea variable. If bigger we store it
  otherwise not. Then we either increment or decrement the left pointer or the right pointer respectively
  depending on which height is smaller. We discard the smaller hieght because we want to find the largest.
  
* Time complexity for this code is O(n) because at first we are iterating for the height array one by one
  which is O(n). After that the two pointers are iterating over the list linearly so again O(n). As a
  result the total time complexity becomes O(n);
