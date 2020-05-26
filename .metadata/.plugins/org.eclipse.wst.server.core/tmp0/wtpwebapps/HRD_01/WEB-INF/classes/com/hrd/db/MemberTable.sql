CREATE TABLE MEMBER_TBL_01(
custno	 number(6) PRIMARY KEY,
custname varchar2(20),
phone 	 varchar2(13),
address varchar2(60),
joindate date,
grade    char(1),
city     char(2)
);

SELECT LPAD(NVL(MAX(CUSTNO),0)+1,6,'10000') FROM MEMBER_TBL_01

commit

SELECT LPAD(NVL(MAX(M.CUSTNO),0)+1,6,'10000') as "test" FROM  MEMBER_TBL_01 M 


INSERT INTO MEMBER_TBL_01 VALUES(100001,'장두석','010-1120-1190','경기도 부천시 부천','19961220','1','02')


DELETE FROM MEMBER_TBL_01


SELECT * FROM MEMBER_TBL_01
