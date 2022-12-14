CREATE TABLE ASSOCIADO(
    ID BIGINT AUTO_INCREMENT,
    NOME VARCHAR(50) NOT NULL,
    CARGO VARCHAR(40) NOT NULL,
    SEXO VARCHAR(15) NOT NULL,
    NASCIMENTO DATETIME NULL,
    PARTIDO_ID BIGINT,
    FOREIGN KEY (PARTIDO_ID) REFERENCES PARTIDO(ID),
    PRIMARY KEY (ID)
)engine=InnoDB;