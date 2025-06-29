# Approach 1: Naive Solution

This approach solves the problem in a straightforward way.

Given the matrix, let's create two arrays as follows:

- **Row Array** (`row[]`): Length = `matrix.length` (number of rows)  
  This array is used to determine which rows need to be set to 0.

- **Column Array** (`col[]`): Length = `matrix[0].length` (number of columns)  
  This array is used to determine which columns need to be set to 0.

The approach is:

1. Traverse through each element of the matrix, denoted as $E_{ij}$:
    - If $E_{ij} = 0$:
        - Set $row_i = 0$ (to mark the $i^{th}$ row for zeroing)
        - Set $col_j = 0$ (to mark the $j^{th}$ column for zeroing)

2. Traverse through the `row` array:
    - If $row_i = 0$:
        - Set the entire $i^{th}$ row of the matrix to 0

3. Traverse through the `col` array:
    - If $col_j = 0$:
        - Set the entire $j^{th}$ column of the matrix to 0


