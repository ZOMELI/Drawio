-- CREATE TABLE PERSON (
-- personId INT NOT NULL IDENTITY PRIMARY KEY,
-- dni VARCHAR(8) UNIQUE NOT NULL ,
-- name VARCHAR(50) NOT NULL,
-- creationDate DATETIME DEFAULT GETDATE(),
-- );
--
-- CREATE TABLE CUSTOMER_ACCOUNT(
-- id INT NOT NULL IDENTITY PRIMARY KEY ,
-- personId INT NOT NULL,
-- accountId VARCHAR(22) UNIQUE,
-- amount DECIMAL(11,2) NOT NULL,
-- currency VARCHAR(3),
-- creationDate DATETIME DEFAULT GETDATE(),
-- FOREIGN KEY (personId) REFERENCES PERSON(personId),
-- );

-- CREATE TABLE ACCOUNTING_ACCOUNT(
-- id INT NOT NULL IDENTITY PRIMARY KEY ,
-- accountId VARCHAR(22) UNIQUE NOT NULL ,
-- amount DECIMAL(11,2) NOT NULL,
-- currency VARCHAR(3),
-- creationDate DATETIME DEFAULT GETDATE(),
-- );


-- CREATE TABLE TRANSFER_ACCOUNTS(
-- id INT NOT NULL IDENTITY PRIMARY KEY ,
-- amount DECIMAL(11,2) NOT NULL,
-- currency VARCHAR(3),
-- accountIdOrigin VARCHAR(22) UNIQUE,
-- currencyOrigin VARCHAR(3),
-- amountOrigin DECIMAL(11,2) NOT NULL,
-- amountBalanceOrigin DECIMAL(11,2) NOT NULL,
-- amountAvailableOrigin DECIMAL(11,2) NOT NULL,
-- accountIdDestine VARCHAR(22) UNIQUE,
-- currencyDestine VARCHAR(3),
-- amountOriginDestine DECIMAL(11,2) NOT NULL,
-- amountBalanceOriginDestine DECIMAL(11,2) NOT NULL,
-- amountAvailableOriginDestine DECIMAL(11,2) NOT NULL,
-- description VARCHAR(255),
-- creationDate DATETIME DEFAULT GETDATE(),
-- );

INSERT INTO PERSON (name,dni) VALUES('Zomeli','48491134');
INSERT INTO PERSON (name,dni) VALUES('Juan','47431467');
INSERT INTO PERSON (name,dni) VALUES('Mariella','67418541');
INSERT INTO PERSON (name,dni) VALUES('Luis','67984423');
INSERT INTO PERSON (name,dni) VALUES('Pedro','47336874');

INSERT INTO CUSTOMER_ACCOUNT (personId,accountId,amount,currency) VALUES(1,'1948412121022',1500.87,'PEN');
INSERT INTO CUSTOMER_ACCOUNT (personId,accountId,amount,currency) VALUES(1,'1948211421022',500,'USD');
INSERT INTO CUSTOMER_ACCOUNT (personId,accountId,amount,currency) VALUES(2,'1943225117022',2000,'PEN');
INSERT INTO CUSTOMER_ACCOUNT (personId,accountId,amount,currency) VALUES(3,'1947875121022',200,'USD');
INSERT INTO CUSTOMER_ACCOUNT (personId,accountId,amount,currency) VALUES(4,'1943775491022',24000,'PEN');

INSERT INTO ACCOUNTING_ACCOUNT (accountId,amount,currency) VALUES('2001675491099',1000000.60,'PEN');
INSERT INTO ACCOUNTING_ACCOUNT (accountId,amount,currency) VALUES('2007789741099',2000,'USD');
INSERT INTO ACCOUNTING_ACCOUNT (accountId,amount,currency) VALUES('2003319424099',0,'PEN');
INSERT INTO ACCOUNTING_ACCOUNT (accountId,amount,currency) VALUES('2008712451099',900000,'USD');
INSERT INTO ACCOUNTING_ACCOUNT (accountId,amount,currency) VALUES('2009712154099',700000,'PEN');

INSERT INTO TRANSFER_ACCOUNTS (amount,currency,
                               accountIdOrigin,currencyOrigin,amountOrigin,amountBalanceOrigin,amountAvailableOrigin,
                               accountIdDestine,currencyDestine,amountOriginDestine,amountBalanceOriginDestine,amountAvailableOriginDestine,
                               description)
VALUES(499.13,'PEN',
       '1948412121022','PEN',2000,1500.87,1500.87,
       '1948211421022','USD',300,436.11,436.11,
       'Transferencia entre cuentas propias');



-- CREATE TABLE PERSON (
-- Id INT NOT NULL IDENTITY,
-- personId AS 'P' + RIGHT('00000000' + CAST(Id AS VARCHAR(8)), 8) PERSISTED PRIMARY KEY,
-- name VARCHAR(50) NOT NULL
-- );
--
-- CREATE TABLE ACCOUNT (
-- Id INT NOT NULL IDENTITY,
-- accountId AS accountType + RIGHT('00000000' + CAST(Id AS VARCHAR(8)), 8) PERSISTED PRIMARY KEY,
-- accountNumber VARCHAR(22) UNIQUE,
-- accountType VARCHAR(4) NOT NULL
-- );
--
-- CREATE TABLE PERSON_ACCOUNT (
-- id INT NOT NULL PRIMARY KEY IDENTITY,
-- personId VARCHAR(9) NULL,
-- accountId VARCHAR(12) NOT NULL,
-- amount DECIMAL(11,2) DEFAULT 0,
-- creationDate DATETIME DEFAULT GETDATE(),
-- FOREIGN KEY (personId) REFERENCES PERSON(personId),
-- FOREIGN KEY (accountId) REFERENCES ACCOUNT(accountId)
-- );
--

-- INSERT INTO ACCOUNT (accountNumber,accountType) VALUES('1948412121022','CTBL');
-- INSERT INTO ACCOUNT (accountNumber,accountType) VALUES('1948211421022','CTBL');
-- INSERT INTO ACCOUNT (accountNumber,accountType) VALUES('1943225117022','CTDA');
-- INSERT INTO ACCOUNT (accountNumber,accountType) VALUES('1947875121022','CTDA');
-- INSERT INTO ACCOUNT (accountNumber,accountType) VALUES('1943775491022','CTDA');
-- INSERT INTO ACCOUNT (accountNumber,accountType) VALUES('1947875491022','CTDA');
-- INSERT INTO ACCOUNT (accountNumber,accountType) VALUES('1941675491022','CTDA');
-- INSERT INTO ACCOUNT (accountNumber,accountType) VALUES('1947789741022','CTDA');
-- INSERT INTO ACCOUNT (accountNumber,accountType) VALUES('1943319424022','CTDA');
--
-- INSERT INTO PERSON_ACCOUNT (accountId,amount) VALUES('CTBL00000001',10000000);
-- INSERT INTO PERSON_ACCOUNT (accountId,amount) VALUES('CTBL00000002',1000);
-- INSERT INTO PERSON_ACCOUNT (personId,accountId,amount) VALUES('P00000001','CTDA00000003', 1200);
-- INSERT INTO PERSON_ACCOUNT (personId,accountId,amount) VALUES('P00000004','CTDA00000004', 8700);
-- INSERT INTO PERSON_ACCOUNT (personId,accountId,amount) VALUES('P00000004','CTDA00000005', 75000);
-- INSERT INTO PERSON_ACCOUNT (personId,accountId,amount) VALUES('P00000002','CTDA00000006', 200);
-- INSERT INTO PERSON_ACCOUNT (personId,accountId,amount) VALUES('P00000003','CTDA00000007', 1200);



