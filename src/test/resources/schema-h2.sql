CREATE TABLE FILES (
    FILE_ID INTEGER UNSIGNED AUTO_INCREMENT,
    ASSET_CLASS ENUM('RATES','FOREX','EQUITIES','COMMODITIES','CREDITS') NOT NULL,
    FILE_NAME CHAR(38) NOT NULL,
    UPLOAD_TIMESTAMP TIMESTAMP NOT NULL,
    DATE_STR CHAR(10) NOT NULL,
    PRIMARY KEY (FILE_ID)
);
