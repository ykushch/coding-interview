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

Image [source](http://javahungry.blogspot.com/2013/08/hashing-how-hash-map-works-in-java-or.html)

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

# Mock Interview / preparations

| Mark | Description |
|---|---|
| 🆓 | Fully free. |
| 🆓 / 💰 | Many free content, but has some premium content for extra money. |
| 💰 / 🆓 | Mainly paid content, but has some free. |
| 💰 | Fully paid content. |

### Coding Interview University (GitHub) 🆓
[Coding-interview-university](https://github.com/jwasham/coding-interview-university)
Good resource, have very long list of advices on what to read and how to prepare for your coding AND
System Design interview.
 
### InterviewBit 🆓
[InterviewBit](https://www.interviewbit.com/)
Self paced tutorial like resource on preparation for coding, system design AND have a mock interview feature.
Contains many problems for different companies.

### LeetCode 🆓 / 💰
[LeetCode](https://leetcode.com)
Many challenges, problems for solving. Have a bonus system. You could spend money and buy a premium subscription
for mock interviews and premium problems.

### InterviewCake 💰 / 🆓
[InterviewCake](https://www.interviewcake.com)
This resource is about coding practice, but it differs from others. The main focus here is to give you a 
basic intuition on how to address to the particular problem.

### System Design Primer (GitHub) 🆓 
[System Design Primer](https://github.com/donnemartin/system-design-primer)
Great resource on how to deal with system design interviews. Contains different use cases and real world 
experience. Highly recommend to review it.

### HiredInTech 🆓 
[HiredInTech](https://www.hiredintech.com/system-design)
Guys are doing great job on advices and use cases for system design interviews. Definitely recommend to 
spend some time here.

### Technical Mock Interview 💰
[Technical Mock Interview](http://www.techmockinterview.com/)
Pricing: $80 per session OR $340 for 5 session package
The main focus is mock interviews and with detailed feedback.

### Gainlo 💰
[Gainlo](http://www.gainlo.co)
The main focus is mock interviews. Also, they have good blog on general advices on how to deal with interviews.

### System Design Interview 💰 
[System Design Interview](https://systemdesigninterview.com)
Pricing: whole course for ~ $79
Found this course on Quora. They say, that this is a great resource for system design interview. 
Haven't tried it yet.

# Arrays
- [Spiral](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/ykushch/solution/arrays/Spiral.java)
- [CircularShift](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/ykushch/solution/arrays/CircularShift.java)
- [Reach](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/ykushch/solution/arrays/Reach.java)
- [Wave](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/ykushch/solution/arrays/Wave.java)
- [Merge Overlapping Interval](https://github.com/ykushch/codinginterview/blob/master/src/main/java/com/ykushch/solution/arrays/IntervalMerge.java)
