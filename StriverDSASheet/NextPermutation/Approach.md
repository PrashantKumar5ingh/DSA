To find the next lexicographically greater permutation of a sequence of digits, follow these steps:

**Example:**  
Given the number `12413542`, the next permutation is `12414235`.

### Step-by-step Explanation

1. **Identify the Pivot:**
   - Start from the right and look for the first digit that is smaller than the digit immediately after it.  
   - In `12413542`, scan from right to left: `5 < 4`, `3 < 5`, `1 < 3`, etc.  
   - The first such digit is `3` (at index 5), since `3 < 5`.

2. **Find the Successor:**
   - Find the smallest digit to the right of the pivot (`3`) that is larger than `3`.  
   - In `3542`, the digits after `3` are `5, 4, 2`. The smallest digit greater than `3` is `4`.

3. **Swap Pivot and Successor:**
   - Swap `3` and `4`.  
   - The sequence becomes `12414532`.

4. **Reverse the Suffix:**
   - Reverse the sequence after the original pivot’s position to get the smallest possible order.  
   - Reverse `532` to get `235`.  
   - The final sequence is `12414235`.

### Key Observations

- If the sequence is entirely non-increasing from right to left (e.g., `54321`), it is the largest permutation. The next permutation is the smallest one (sorted in ascending order).
- The suffix after the pivot is always in descending order, so reversing it gives the minimal arrangement.

**Summary:**  
Find the first decreasing element from the right, swap it with the next larger element, and reverse the suffix to get the next permutation.





