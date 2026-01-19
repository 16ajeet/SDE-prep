**Approach**

Take the string as input.  
Fix one character at a time as the starting position.  
From that position, extend the substring one character at a time up to the end of the string.  
Print each substring formed during this extension.  
Repeat the process until every position in the string has been used as a starting point.

---

**Pseudocode**

```
PROCEDURE PrintSubstrings(str)
    n ← length of str

    FOR i ← 0 TO n - 1 DO
        FOR j ← i + 1 TO n DO
            PRINT substring of str from index i to j - 1
        END FOR
    END FOR
END PROCEDURE
```

This guarantees all possible substrings are printed exactly once, without missing or duplicating any.