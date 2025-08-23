-- Write your PostgreSQL query statement below
SELECT 
    P.FIRSTNAME, 
    P.LASTNAME, 
    A.CITY, 
    A.STATE
FROM 
    PERSON AS P
    LEFT JOIN ADDRESS AS A ON A.PERSONID = P.PERSONID 