# Solvers
A bunch of tasks that could be completed in free time on your own.

# Arrays
Problems that relates to arrays.

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

[Solution](https://github.com/ykushch/problemsolvers/blob/master/src/main/java/com/threecoffee/solution/arrays/Spiral.java)

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
[Solution](https://github.com/ykushch/problemsolvers/blob/master/src/main/java/com/threecoffee/solution/arrays/CircularShift.java)

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

[Solution](https://github.com/ykushch/problemsolvers/blob/master/src/main/java/com/threecoffee/solution/arrays/Reach.java)