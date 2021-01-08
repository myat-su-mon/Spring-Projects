create table if not exists `spring`.`product`(
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR (45) NULL,
    `owner` VARCHAR (45) NULL,
    PRIMARY KEY(`id`)
);