-- 코드를 입력하세요
WITH RECURSIVE TIME AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1
    FROM TIME
    WHERE HOUR < 23
)

SELECT TIME.HOUR AS HOUR, COUNT(ANI.DATETIME) AS `COUNT`
FROM TIME LEFT JOIN ANIMAL_OUTS AS ANI
          ON TIME.HOUR = HOUR(ANI.DATETIME) 
WHERE TIME.HOUR BETWEEN 0 AND 23
GROUP BY TIME.HOUR
ORDER BY TIME.HOUR;