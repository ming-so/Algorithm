-- 코드를 작성해주세요
SELECT ID, CASE COLONY_RANK WHEN 1 THEN 'CRITICAL'
                            WHEN 2 THEN 'HIGH'
                            WHEN 3 THEN 'MEDIUM'
                            ELSE 'LOW'
           END AS COLONY_NAME
FROM (SELECT ID, NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) COLONY_RANK
      FROM ECOLI_DATA) RANK_DATA
ORDER BY ID;