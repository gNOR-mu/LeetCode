-- Write your PostgreSQL query statement below
SELECT
    E.NAME,
    B.BONUS
FROM
    EMPLOYEE AS E
    LEFT JOIN BONUS AS B ON B.EMPID = E.EMPID
WHERE
    B.BONUS < 1000
    OR B IS NULL;
