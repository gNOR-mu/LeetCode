-- Write your PostgreSQL query statement below
SELECT
    EMAIL
FROM 
    PERSON P
GROUP BY 
    EMAIL
HAVING 
    COUNT(EMAIL) > 1
