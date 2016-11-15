# SecondLargestNumberDemo
Findout and print the second largest number in an array of number

ALGORITHM
Step 1:

    Iterate the given array

Step 2 (first if condition arr[i] > largest):

    If current array value is greater than largest value then
    
      + Move the largest value to secondLargest 
      
      + Make current value as largest

Step 3 (second if condition arr[i] > secondLargest )  

  If the current value is smaller than largest and greater than secondLargest then
  
      + The current value becomes secondLargest
