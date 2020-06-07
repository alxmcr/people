----------------------------------------
/*
SCRIPT DATABASE: People
*/
----------------------------------------

-- Sequence
CREATE SEQUENCE PE_PERSON START WITH 1;
-- Table
CREATE TABLE PE_PERSON (PERSON_ID INTEGER NOT NULL, CODE_ VARCHAR(10), LASTNAME VARCHAR(100), NAME_ VARCHAR(50), PRIMARY KEY (PERSON_ID));
