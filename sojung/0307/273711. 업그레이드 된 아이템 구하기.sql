-- [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/273711) 
SELECT II.ITEM_ID, II.ITEM_NAME, II.RARITY
FROM ITEM_INFO AS II
JOIN ITEM_TREE AS IT
ON IT.ITEM_ID = II.ITEM_ID
WHERE IT.PARENT_ITEM_ID IN (SELECT ITEM_ID
                           FROM ITEM_INFO
                           WHERE RARITY = 'RARE')
ORDER BY ITEM_ID DESC;
