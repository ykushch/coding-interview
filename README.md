# Preparations for coding interviews

### Hash Tables
A hash table is a data structure that maps keys to values for efficient lookup.

#### Implementation details
There are many ways to implement hash tables. The most common is to use an array of a linked lists and a hash code 
function.

<br/>
<p align="center">
  <img src="https://raw.githubusercontent.com/ykushch/coding-interview/master/resources/hashmap_01%20.png">
</p>
<br/>

##### Inserting into map (key and value)
1. Compute the key's hash code, which will usually be an int or long. Note that two different keys could have the 
same hash code, as there may be an infinite number of keys and a finite number of ints.
2. Map the hash code to an index in the array. This could be done with something like `hash(key) % array_length`. 
Two different hash codes could, of course, map to the same index (finding a correct bucket).
3. At this index, there is a linked list of keys and values. Store the key and value in this index. We must use a
linked list because of collisions: you could have two different keys with the same hash code, or two different
hash codes that map to the same index.

##### Retrieving value by its key (key and value)
To retrieve the value by its key, we need to repeat the process. 

1. Compute the hash code from the key. 
2. Compute the index from the hash code (find a bucket on picture). 
3. Search through the linked list for the value with this key. If the number of collisions is very high, 
the worst case runtime is `O(N)`, where `N` is the number of keys. Generally we assume a good implementation that 
keeps collisions to a minimum, in which case the lookup time is `O(1)`.

Note: A bucket is used to store key value pairs. A bucket can have multiple key-value pairs. In hash map, 
bucket used simple linked list to store objects.

# Arrays
- [Spiral](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/ykushch/solution/arrays/Spiral.java)
- [CircularShift](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/ykushch/solution/arrays/CircularShift.java)
- [Reach](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/ykushch/solution/arrays/Reach.java)
- [Wave](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/ykushch/solution/arrays/Wave.java)
- [Merge Overlapping Interval](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/ykushch/solution/arrays/IntervalMerge.java)
