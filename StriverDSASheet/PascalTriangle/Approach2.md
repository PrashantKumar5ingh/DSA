# Approach 2: Optimized Space Solution

This is an advanced approach that generates Pascal's Triangle without using any extra space for previous rows.

**Explanation:**

- For each row index `i` from `0` to `n-1`:
    1. Create an empty list to represent the current row.
    2. Initialize `val = 1` (the first value in each row is always 1).
    3. For each column index `j` from `0` to `i`:
        - Add `val` to the current row.
        - Update `val` using the formula:  
          `val = val * (i - j) / (j + 1);`
    4. Add the current row to the Pascal's Triangle.

This approach efficiently computes each value using the properties of binomial coefficients, avoiding the need to reference previous rows.