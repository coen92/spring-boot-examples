# Data Structures & Algorithms

## Definitions:
### What's a data structure?
Data Structure - a named location that can be used to store and organize data (f.e. tree, array).

### What's an algorithm?
Algorithm - a collection of steps to solve particular problem (f.e. linear search).


To write a code that is both time and memory efficient you need to know this one. 
Also, it is pretty good to know your drill as a programmer, don't you think?


## Data Structures:
### Stack
#### 1. characteristics:
- LIFO (Last-In First-Out) data structure 
- stores objects into a sort of "vertical tower"
- push() to add item to the top
- pop() to remove item from the top
- peak() to return item without removing it

#### 2. usages:
- undo/redo features (f.e. in text editors)
- moving back/forward (f.e. through browser history)
- backtracking algorithms
- calling functions (call stack)

### Queue
##### 1. characteristics
- FIFO (First-In First-Out) data structure
- linear data structure
- collection designed for holding elements prior processing
- add = enqueue, offer()
- remove = dequeue, poll()

#### 2. usages:
- keyboard buffer - letters appear on the screen in the order they were pressed on keyboard
- printer queue - print jobs should be completed in order
- in LinkedLists, PriorityQueues, Breadth-first search

### Priority queue
#### 1. characteristics
- FIFO data structure
- serves elements with the highest priority first

#### 2. usages
- traveling boarding queue with priority tickets solution

### Linked List
#### 1. characteristics
- made of chain of **Nodes**, each contains two parts:
  - data/element that needs to be stored
  - pointer - address to the next node in line
- nodes are non-contiguous and non-consecutive - they can be anywhere within your computer's memory
- inserting and deleting only requires of changing the pointer in node (0(1) constant time operation)
- querying element is worse - locate it within the list requires iteration from the head to the tail until found (0(n) linear time operation)
- can be _singly_ - only next-element pointer - or _doubly_ - previous- and next-element pointers

#### 2. usages
- implementation of Stack and Queues
- GPS navigation
- music playlist

#### 3. advantages
- dynamic data structure (allocates needed memory on the Runtime)
- insertion or deletion of Nodes is easy - constant 0(1)
- no/low-memory waste

#### 4. disadvantages
- greater memory usage (additional pointer)
- no random access to the element (no index[i])
- accessing/searching elements is more time-consuming - linear 0(n)

### Array List
#### 1. characteristics
- stores elements in contiguous data locations
- contains indexing of elements:
  - makes it better for querying for elements 
  - makes it worse in modifying, especially in inserting or deleting closer to the beginning of the array (shifting index of elements required!)

