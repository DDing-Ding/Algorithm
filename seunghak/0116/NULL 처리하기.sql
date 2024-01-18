SELECT
    ANIMAL_TYPE,
    /*
     /COALESCE함수는 NAME컬럼이 NULL인 경우의 값을 No name으로 대체해줌
     */
    COALESCE(NAME, 'No name') AS NAME,
    SEX_UPON_INTAKE
FROM
    ANIMAL_INS