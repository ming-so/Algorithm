-- 코드를 입력하세요
SELECT FIR.FLAVOR
FROM FIRST_HALF FIR JOIN ICECREAM_INFO INFO ON FIR.FLAVOR = INFO.FLAVOR
WHERE INGREDIENT_TYPE = 'fruit_based' AND TOTAL_ORDER > 3000
ORDER BY TOTAL_ORDER DESC;