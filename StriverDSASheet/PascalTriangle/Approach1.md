# Approach 1: Naive Solution

This is a naive approach to generate Pascal's Triangle with `n` rows.

**Steps:**

1. Initialize the triangle with the first row: `[1]`.
2. For each of the next `n-1` rows:
    - Start a new row with `1` at the beginning.
    - For each position between the first and last element, calculate the value as the sum of the two numbers directly above it from the previous row.
    - End the row with `1`.
    - Add this new row to the triangle.

This process continues until the triangle has `n` rows.


