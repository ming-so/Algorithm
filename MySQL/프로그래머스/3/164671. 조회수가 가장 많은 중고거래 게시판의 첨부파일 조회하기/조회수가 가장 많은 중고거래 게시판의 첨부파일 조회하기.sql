-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/', BOARD.BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) FILE_PATH
FROM USED_GOODS_BOARD BOARD LEFT JOIN USED_GOODS_FILE FILE 
                            ON BOARD.BOARD_ID = FILE.BOARD_ID
WHERE VIEWS = (SELECT MAX(VIEWS)
               FROM USED_GOODS_BOARD)
ORDER BY FILE_ID DESC;