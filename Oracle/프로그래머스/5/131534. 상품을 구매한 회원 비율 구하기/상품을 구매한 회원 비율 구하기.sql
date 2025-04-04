-- 코드를 입력하세요
SELECT EXTRACT(YEAR FROM SALES_DATE) YEAR, EXTRACT(MONTH FROM SALES_DATE) MONTH, 
       COUNT(DISTINCT USER_ID) PURCHASED_USERS,
       ROUND(COUNT(DISTINCT USER_ID) / (SELECT COUNT(USER_ID)
                                        FROM USER_INFO
                                        WHERE EXTRACT(YEAR FROM JOINED) = 2021), 1) PURCHASED_RATIO
FROM ONLINE_SALE
WHERE USER_ID IN (SELECT USER_ID
                  FROM USER_INFO
                  WHERE EXTRACT(YEAR FROM JOINED) = 2021)
GROUP BY EXTRACT(YEAR FROM SALES_DATE), EXTRACT(MONTH FROM SALES_DATE)
ORDER BY 1, 2;