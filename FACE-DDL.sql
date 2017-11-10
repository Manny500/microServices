CREATE TABLE FACE_ROLE_TYPE
  (
    FACE_RT_ID   INT,
    FACE_RT_NAME VARCHAR2(4000) UNIQUE,
    PRIMARY KEY(FACE_RT_ID)
  );
/
CREATE TABLE FACE_USER
  (
    FACE_ID       INT,
    FACE_FN       VARCHAR2(4000),
    FACE_LS       VARCHAR2(4000),
    FACE_USERNAME VARCHAR2(4000) UNIQUE NOT NULL,
    FACE_PASSWORD VARCHAR2(4000) NOT NULL,
    FACE_RT_ID    INT DEFAULT 1 NOT NULL,
    FACE_EMAIL    VARCHAR2(4000),
    PRIMARY KEY(FACE_ID),
    FOREIGN KEY(FACE_RT_ID) REFERENCES FACE_ROLE_TYPE(FACE_RT_ID)
  );
/
COMMIT;