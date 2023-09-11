# Double Linked List in Java

This is a Java implementation of a doubly linked list data structure. A doubly linked list is a linear data structure in which elements are connected with two pointers, one pointing to the next node and another pointing to the previous node. This allows for efficient insertion and deletion of elements at both ends of the list.

## Table of Contents

- [Getting Started](#getting-started)
- [Usage](#usage)
- [Methods](#methods)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To use this double linked list implementation in your Java project, you can follow these simple steps:

1. Clone this repository:

   ```bash
   git clone https://github.com/yourusername/double-linked-list-java.git
   ```

2. Add the `DoubleLinkedList.java` file to your Java project.

3. Import the `DoubleLinkedList` class in your Java file where you want to use it:

   ```java
   import com.example.DoubleLinkedList;
   ```

4. Create an instance of the `DoubleLinkedList` class and start using it in your code.

## Usage

Here is an example of how to use the `DoubleLinkedList` class:

```java
public class Main {
    public static void main(String[] args) {
        // Create a new double linked list
        DoubleLinkedList<Integer> myList = new DoubleLinkedList<>();

        // Append elements to the list
        myList.append(1);
        myList.append(2);
        myList.append(3);

        // Prepend an element to the list
        myList.prepend(0);

        // Remove the last element from the list
        myList.removeLast();

        // Remove the first element from the list
        myList.removeFirst();

        // Get the element at a specific index
        int element = myList.get(1);

        // Set the element at a specific index
        myList.set(1, 10);

        // Insert an element at a specific index
        myList.insert(1, 5);

        // Remove an element at a specific index
        myList.remove(2);

        // Print the elements in the list
        myList.printList();
    }
}
```

## Methods

The `DoubleLinkedList` class provides the following methods:

- `void append(T data)`: Appends an element to the end of the list.
- `void prepend(T data)`: Prepends an element to the beginning of the list.
- `void removeLast()`: Removes the last element from the list.
- `void removeFirst()`: Removes the first element from the list.
- `T get(int index)`: Returns the element at the specified index.
- `void set(int index, T data)`: Sets the element at the specified index to the given value.
- `void insert(int index, T data)`: Inserts an element at the specified index.
- `void remove(int index)`: Removes the element at the specified index.
- `void printList()`: Prints the elements of the list from start to end.

## Contributing

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
