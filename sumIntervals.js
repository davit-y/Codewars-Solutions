// https://www.codewars.com/kata/52b7ed099cdc285c300001cd
/*
Description:

Write a function called sumIntervals that accepts an array of intervals, and returns the sum of all the interval lengths. Overlapping intervals should only be counted once.
Intervals:
Intervals are represented by a pair of integers in the form of an array. The first value of the interval will always be less than the second value. Interval example: [1, 5] is an interval from 1 to 5. The length of this interval is 4.
Overlapping Intervals:
List containing overlapping intervals:[[1,4],   [7, 10],   [3, 5]]
The sum of the lengths of these intervals is 7. Since [1, 4] and [3, 5] overlap, we can treat the interval as [1, 5], which has a length of 4.
*/

function sumIntervals(intervals){
  intervals.sort(function(a, b) { 
    return a[0] > b[0] ? 1 : -1;
  });
  var curMin = intervals[0][0];
  var curMax = intervals[0][1];
  var result = 0;
  for (let value of intervals) {
    if (value[0] > curMax) {
      result +=  curMax - curMin;
      curMin = value[0];
      curMax = value[1];
    } else if (value[1] > curMax) {
      curMax = value[1];
    }
  }
  result +=  curMax - curMin;
  return result;
}
