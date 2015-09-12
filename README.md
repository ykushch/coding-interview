# Solvers
A bunch of tasks that could be completed in free time on your own.

# Arrays

## Spiral
Given a matrix of `m * n` elements (m rows, n columns), return all elements of the matrix in spiral order.

Example:

Given the following matrix:
```
[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]
```

You should return
```
[1, 2, 3, 6, 9, 8, 7, 4, 5]
```

[Solution](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/threecoffee/solution/arrays/Spiral.java)

## CircularShift
Rotate the array A by B positions.

Example:
```
A : [1 2 3 4 5 6]
B : 1
```
The output :
```
[2 3 4 5 6 1]
```
[Solution](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/threecoffee/solution/arrays/CircularShift.java)

## Reach
You are in an infinite 2D grid where you can move in any of the 8 directions :
```
 (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1)
```
You are given a sequence of points and the order in which you need to cover the points. 
Give the minimum number of steps in which you can achieve it. You start from the first point.

Example

Input: 
```
[(0, 0), (1, 1), (1, 2)]
```
Output: `2`
It takes 1 step to move from `(0, 0)` to `(1, 1)`. It takes one more step to move from `(1, 1)` to `(1, 2)`.

[Solution](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/threecoffee/solution/arrays/Reach.java)

## Wave
Given an array of integers, sort the array into a wave like array and return it, 
In other words, arrange the elements into a sequence such that `a1 >= a2 <= a3 >= a4 <= a5...`

Example

Given `[1, 2, 3, 4]`
```
One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
```

[Solution](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/threecoffee/solution/arrays/Wave.java)

## Merge Overlapping Interval
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary). 
You may assume that the intervals were initially sorted according to their start times.

Example 1:
Given intervals `[1,3],[6,9]` insert and merge `[2,5]` would result in `[1,5],[6,9]`.

Example 2:
Given `[1,2],[3,5],[6,7],[8,10],[12,16]`, insert and merge `[4,9]` -> `[1,2],[3,10],[12,16]`.

In this example interval `[4,9]` overlaps with `[3,5],[6,7],[8,10]`.

[Solution](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/threecoffee/solution/arrays/IntervalMerge.java)
