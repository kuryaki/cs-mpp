-- create ADDRESS and PERSON

CREATE TABLE CUSTOMER(
    id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1001, INCREMENT BY 1),
    name CHAR(30),
    street CHAR(30),
    city CHAR(30),
    zip CHAR(10)
);

INSERT INTO CUSTOMER (name, street, city, zip) 
VALUES ('Bob','11 Adams','Fairfield', '52556');
INSERT INTO CUSTOMER (name, street, city, zip) 
VALUES ('Laurence Lebihans','12, rue des Bouchers','Marseille','13008');
INSERT INTO CUSTOMER (name, street, city, zip)  
VALUES ('Andy', '1000 Channing Ave', 'Palo Alto', '94301');
INSERT INTO CUSTOMER (name, street, city, zip)  
VALUES ('Zeke', '212 Wilkshire Blvd', 'Chicago', '57532');
INSERT INTO CUSTOMER (name, street, city, zip) 
VALUES ('Blauer Delikatessen', 'Forsterstr. 57','Mannheim','68306');


SELECT * FROM CUSTOMER;
