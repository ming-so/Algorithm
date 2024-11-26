-- 코드를 작성해주세요
WITH GRA AS (SELECT EMP_NO, CASE WHEN AVG(SCORE) >= 96 THEN 'S'
                                 WHEN AVG(SCORE) >= 90 THEN 'A'
                                 WHEN AVG(SCORE) >= 80 THEN 'B'
                                 ELSE 'C'
                            END AS GRADE
             FROM HR_GRADE
             GROUP BY EMP_NO) 

SELECT EMP.EMP_NO, EMP_NAME, GRADE,
       CASE GRADE WHEN 'S' THEN SAL * 0.2
                  WHEN 'A' THEN SAL * 0.15
                  WHEN 'B' THEN SAL * 0.1
                  ELSE 0
       END AS BONUS
FROM HR_EMPLOYEES EMP JOIN GRA ON EMP.EMP_NO = GRA.EMP_NO
GROUP BY EMP_NO
ORDER BY EMP_NO;