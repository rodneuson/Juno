CREATE TABLE Category (
    Id INT IDENTITY(1,1) NOT NULL,
    Name VARCHAR(128) NOT NULL
);

CREATE TABLE Product (
    Id INT IDENTITY(1,1) NOT NULL,
    Name VARCHAR(128) NOT NULL,
    Category_Id INT NOT NULL,
    FOREIGN KEY (Category_Id) REFERENCES Category(Id)
);