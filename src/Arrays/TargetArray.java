package Arrays;

import java.util.*;

public class TargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Insert nums[i] at index[i]
            target.add(index[i], nums[i]);
        }

        // Convert List to array
        int[] result = new int[target.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = target.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] target = createTargetArray(nums, index);

        System.out.println(Arrays.toString(target));
    }
}

/*
target.add(index[i], nums[i]); what does it mean explain

target.add(index[i], nums[i]);

>What This Line Means

I am adding an element `nums[i]` into the `target` list **at a specific position** `index[i]`.

> Syntax Breakdown

target.add(index[i], nums[i]);

- `target`: Your `List<Integer>` (probably an `ArrayList`)
- `add(position, value)`: Inserts `value` at the given `position`
- `index[i]`: The position where you want to insert
- `nums[i]`: The value you want to insert

--Visual Example

Let’s say:
int[] index = {0, 1, 2, 1};
int[] nums =  {10, 20, 30, 40};
List<Integer> target = new ArrayList<>();

Now let’s simulate each step:

| Step | `index[i]` | `nums[i]` | Operation                  | Resulting `target` List     |
|------|------------|-----------|----------------------------|-----------------------------|
| 0    | 0          | 10        | `add(0, 10)`               | `[10]`                      |
| 1    | 1          | 20        | `add(1, 20)`               | `[10, 20]`                  |
| 2    | 2          | 30        | `add(2, 30)`               | `[10, 20, 30]`              |
| 3    | 1          | 40        | `add(1, 40)`               | `[10, 40, 20, 30]`          |

Notice how `add(index, value)` **shifts existing elements to the right** to make room.

>Important Notes

- If `index[i]` is **greater than the current size**, you'll get an `IndexOutOfBoundsException`.
- This is different from `target.set(index[i], nums[i])`, which **replaces** the value at that index.

--Analogy

Imagine a queue of people:
- `add(2, "Ankit")` means: "Ankit, please stand at position 2."
- Everyone from position 2 onward shifts one step back to make space.

---
*/

/*
int element = List.get(0);

This won't compile because `List` is **not an object**, it's an **interface**. You need to call `.get(0)` on an
actual list instance — like `target`, `list`, or any variable that holds a `List<Integer>`.
>Correct Version

Assuming you have:

List<Integer> target = new ArrayList<>();
target.add(100);
target.add(200);

Then this is valid:

int element = target.get(0);  // element = 100
```
>What `.get(index)` Does

- Retrieves the element at the specified `index` from the list.
- Indexing is **zero-based**: `0` is the first element, `1` is the second, and so on.

---
Common Mistakes

| Mistake                          | Why It's Wrong                          |
|----------------------------------|------------------------------------------|
| `List.get(0)`                    | `List` is an interface, not an object    |
| `list.get(list.size())`          | Index out of bounds (last index is `size - 1`) |
| `list.get(-1)`                   | Negative index — also invalid            |

-Example with Output

List<Integer> numbers = new ArrayList<>();
numbers.add(5);
numbers.add(10);
numbers.add(15);

int first = numbers.get(0);  // 5
int second = numbers.get(1); // 10

System.out.println("First: " + first);
System.out.println("Second: " + second);
```
Output:
First: 5
Second: 10
*/