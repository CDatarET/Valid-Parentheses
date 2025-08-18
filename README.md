# Valid-Parentheses
Leetcode Problem #20. Find if String s is composed of valid parentheses.

# Valid Parentheses

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is **valid**.

## A string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every closing bracket has a corresponding open bracket of the same type.

---

## Examples

### Example 1
**Input:**  
`s = "()"`  
**Output:**  
`true`

---

### Example 2  
**Input:**  
`s = "()[]{}"`  
**Output:**  
`true`

---

### Example 3  
**Input:**  
`s = "(]"`  
**Output:**  
`false`

---

### Example 4  
**Input:**  
`s = "([])"`  
**Output:**  
`true`

---

### Example 5  
**Input:**  
`s = "([)]"`  
**Output:**  
`false`

---

## Constraints

- `1 <= s.length <= 10⁴`
- `s` consists only of `'()[]{}'` characters

---
