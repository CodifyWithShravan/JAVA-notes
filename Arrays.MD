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

```
// Method 1
int arr[];

// Method 2
int[] arr;
```

### Initialisation of Array

1. Static initialisation

```
int[] numbers = {10,20,30,40};
String[] fruits = {"Apple","Banana"};
```
2. Dynamic initialisation

```
int[] numbers = new int[5];  // Array of size 5
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
```

3. Initialisation using loops

```
int[] arr = new int[5];
for (int i = 0; i < arr.length; i++) {
 arr[i] = i + 1;  // Fills array with 1, 2, 3, 4, 5
}
```

4. Initialisation using streams

- Using **IntStream.range(start,end)**: returns a sequential ordered IntStream from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1.

**Parameters :**
- **IntStream** : A sequence of primitive int-valued elements.
- **startInclusive** : The inclusive initial value.
- **endExclusive**: The exclusive upper bound.
- **Return Value** : A sequential IntStream for the range of int elements

```java
// Implementation of IntStream range
// (int startInclusive, int endExclusive)
import java.util.*;
import java.util.stream.IntStream;

class GFG {

    // Driver code
    public static void main(String[] args)
    {
        // Creating an IntStream
        IntStream stream = IntStream.range(6, 10);

        // Displaying the elements in range
        // including the lower bound but
        // excluding the upper bound
        stream.forEach(System.out::println);
    }
}
```

**Note :** IntStream range(int startInclusive, int endExclusive) basically works like a for loop. An equivalent sequence of increasing values can be produced sequentially

- Using **IntStream.rangeClosed(start,end)**: **IntStream rangeClosed(int startInclusive, int endInclusive)**returns an IntStream from startInclusive (inclusive) to endInclusive (inclusive) by an incremental step of 1

**Parameters :**
1. **IntStream :** A sequence of primitive int-valued elements.
2. **startInclusive :**The inclusive initial value.
3. **endInclusive :** The inclusive upper bound.

```java
// Implementation of IntStream rangeClosed
// (int startInclusive, int endInclusive)
import java.util.*;
import java.util.stream.IntStream;

class GFG {

    // Driver code
    public static void main(String[] args)
    {
        // Creating an IntStream
        IntStream stream = IntStream.rangeClosed(-4, 3);

        // Displaying the elements in range
        // including the lower and upper bound
        stream.forEach(System.out::println);
    }
}
```

### Advantages of Java Arrays

- Efficient Access: Accessing an element by its index is fast and has constant time complexity, O(1).
- Memory Management: Arrays have fixed size, which makes memory management straightforward and predictable.
- Data Organization: Arrays help organize data in a structured manner, making it easier to manage related elements.

### Disadvantages of Java Arrays

- Fixed Size: Once an array is created, its size cannot be changed, which can lead to memory waste if the size is overestimated or insufficient storage if underestimated.
- Type Homogeneity: Arrays can only store elements of the same data type, which may require additional handling for mixed types of data.
- Insertion and Deletion: Inserting or deleting elements, especially in the middle of an array, can be costly as it may require shifting elements.

