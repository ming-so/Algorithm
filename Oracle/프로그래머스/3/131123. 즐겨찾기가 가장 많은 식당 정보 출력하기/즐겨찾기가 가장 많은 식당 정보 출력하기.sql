-- 코드를 입력하세요
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM REST_INFO INFO
WHERE FAVORITES IN (SELECT MAX(FAVORITES)
                   FROM REST_INFO TEMP
                   WHERE INFO.FOOD_TYPE = TEMP.FOOD_TYPE
                   GROUP BY FOOD_TYPE)
ORDER BY 1 DESC;