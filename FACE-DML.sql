INSERT INTO FACE_USER (FACE_ID,FACE_FN,
FACE_LS,
FACE_USERNAME,
FACE_PASSWORD,
FACE_RT_ID,
FACE_EMAIL) VALUES(1,'john','last','j','j',1,'tenoriom54@yahoo.com');
/
INSERT INTO FACE_ROLE_TYPE(FACE_RT_ID,FACE_RT_NAME) VALUES(1,'ADMIN'); 
/
INSERT INTO NEWS VALUES(1, 'John', 'Happy');
INSERT INTO NEWS VALUES(2, 'Bob', 'Sad');
INSERT INTO NEWS VALUES(3, 'Sam', 'Mad');
INSERT INTO NEWS VALUES(4, 'Kelly', 'Happy');
/
COMMIT;