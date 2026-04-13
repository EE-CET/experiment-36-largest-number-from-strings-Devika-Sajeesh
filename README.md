[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/JZ9yneKM)
# Experiment 36: Largest Number from Strings

## Problem Statement

Form the largest number by appending a list of strings.

## Input Format

* First line: An integer $N$.
* Second line: $N$ space-separated strings.

## Output Format

* The largest number string.

### Example 1

**Input:**

```text
3
10 3 31
```

**Output:**

```text
33110
```

### Explanation
Possible combinations:
* "10" + "3" + "31" = "10331"
* "3" + "31" + "10" = "33110" (Largest)
* "31" + "10" + "3" = "31103"
