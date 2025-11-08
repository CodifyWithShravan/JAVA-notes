# Arrays in JAVA

Array is an important linear data structure which allows us to store multiple values of the same type
- Arrays are like objects in Java, they implictly inherit from the 
java.lang.Objectclass

### Key features

- Store Primitives and Objects: Java arrays can hold both primitive types (like int, char, boolean, etc.) and objects (like String, Integer, etc.)
- Contiguous Memory Allocation When we use arrays of primitive types, the elements are stored in contiguous locations. For non primitive types, references of items are stored at contiguous locations.
- Zero-based Indexing: The first element of the array is at index 0.
- Fixed Length: After creating an array, its size is fixed; we can not change it.

**Primitive Array:** Stores the values directly in the memory.

**Non-Primitive Array:** Each element of the object array stores a reference to seperate string object.

### Declaring an array

~~~
// Method 1
int arr[];

// Method 2
int[] arr;
~~~

### Advantages of Java Arrays

- Efficient Access: Accessing an element by its index is fast and has constant time complexity, O(1).
- Memory Management: Arrays have fixed size, which makes memory management straightforward and predictable.
- Data Organization: Arrays help organize data in a structured manner, making it easier to manage related elements.

### Disadvantages of Java Arrays

- Fixed Size: Once an array is created, its size cannot be changed, which can lead to memory waste if the size is overestimated or insufficient storage if underestimated.
- Type Homogeneity: Arrays can only store elements of the same data type, which may require additional handling for mixed types of data.
- Insertion and Deletion: Inserting or deleting elements, especially in the middle of an array, can be costly as it may require shifting elements.

