INSERT INTO ADDRESS (street, city, state, zip) VALUES ('101 S. Main', 'Fairfield', 'IA', '52556'),
				('51 S. George', 'Georgetown', 'MI', '65434'),
				('23 Headley Ave', 'Seville', 'Georgia', '41234'),
				('1 N. Baton', 'Baton Rouge', 'LA', '33556'),
				('5001 Venice Dr.', 'Los Angeles', 'CA', '93736'),
				('1435 Channing Ave', 'Palo Alto', 'CA', '94301'),
				('42 Dogwood Dr.', 'Fairfield', 'IA', '52556'),
				('501 Central', 'Mountain View', 'CA', '94707');

INSERT INTO AUTHOR (firstname, lastname, telephone, addressId, bio) VALUES
				('Joe', 'Thomas', '641-445-2123', 1001, 'A happy man is he'),
				('Sandra', 'Thomas', '641-445-2123', 1001, 'A happy wife is she'),
				('Nirmal', 'Pugh', '641-919-3223',1002, 'Thinker of thoughts'),
				('Andrew', 'Cleveland', '976-445-2232', 1003, 'Author of childrens books'),
				('Sarah', 'Connor', '123-422-2663',1004, 'Known for her clever style');

INSERT INTO PUBLICATION (isbn_issuenum, title,  maxcheckoutlength, pubtype) VALUES
('1', 'Journal of Skydiving', 3,'periodical'),
('4', 'Life Magazine', 7,'periodical'),
('100', 'Journal of Symbolic Logic', 3,'periodical'),
('23-11451', 'The Big Fish', 21,'book'),
('28-12331', 'Antartica', 7 , 'book'),
('99-22223', 'Thinking Java', 21,'book'),
('48-56882', 'Jimmys First Day of School', 7, 'book');


INSERT INTO PUBLICATIONAUTHOR (authorid, pubid) VALUES
			(1001,1004),(1002,1004),
			(1003,1005),
			(1004,1006),
			(1005,1007);

INSERT INTO PUBCOPY(pubId, copynumber, status) VALUES
		(1001,1,false),(1001,2,true),(1001,3,false),
		(1002,1,false),(1002,2,true),(1002,3,true),
		(1003,1,false),(1003,2,true),(1003,2,true),(1003,4,true),
		(1004,1,false),(1004,2,false),
		(1005,1,true),(1005,2,false),(1005,3,true),(1005,4,true),(1005,5,true),(1005,6,true),(1005,7,true),
		(1006,1,false),
		(1007,1,true),(1007,2,true);



INSERT INTO LIBRARYMEMBER(memberid, firstname, lastname, telephone, addressid ) VALUES
			('1001', 'Andy', 'Rogers', '641-223-2211',1005),
			('1002', 'Drew', 'Stevens', '702-998-2414',1006),
			('1003', 'Sarah', 'Eagleton', '451-234-8811', 1007),
			('1004', 'Ricardo', 'Montalbahn', '641-472-2871', 1008);



INSERT INTO CHECKOUTRECORD (idmem,copyid,checkoutdate,duedate) VALUES
				(1001,1011,'2011-12-1','2011-12-22'),
				(1001,1012,'2015-6-22','2015-7-13'),
				(1002,1014,'2015-6-27','2015-7-18'),
				(1003,1020,'2015-6-27','2015-7-18'),
				(1001,1001,'2015-6-20','2015-6-27'),				
				(1002,1003,'2015-6-20','2015-6-27'),
				(1003,1004,'2015-6-22','2015-6-29'),
				(1004,1007,'2015-6-22','2015-6-25');


--Select

SELECT *  FROM ADDRESS;
SELECT *  FROM AUTHOR;
SELECT *  FROM PUBLICATION;
SELECT *  FROM PUBCOPY;
SELECT *  FROM LIBRARYMEMBER;
SELECT *  FROM CHECkOUTRECORD;


--Testing Joins


SELECT P.title, P.pubtype, A.firstname
FROM PUBLICATION P INNER JOIN PUBLICATIONAUTHOR PA ON P.id = PA.pubid
INNER JOIN AUTHOR A ON A.id = PA.authorid;

SELECT M.firstname, M.lastname, P.title, C.checkoutdate, C.duedate
FROM CHECKOUTRECORD
C INNER JOIN LIBRARYMEMBER M ON M.id = C.idmem
INNER JOIN PUBCOPY PC ON PC.id = C.copyid
INNER JOIN PUBLICATION P ON PC.pubId = P.id WHERE M.id = 1004;

