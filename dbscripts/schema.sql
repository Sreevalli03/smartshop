-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema smartshop
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema smartshop
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `smartshop` DEFAULT CHARACTER SET utf8 ;
USE `smartshop` ;

-- -----------------------------------------------------
-- Table `smartshop`.`hibernate_sequence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `smartshop`.`hibernate_sequence` (
  `next_val` BIGINT(20) NULL DEFAULT NULL)
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `smartshop`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `smartshop`.`product` (
  `product_code` VARCHAR(255) NOT NULL,
  `aisle` VARCHAR(255) NULL DEFAULT NULL,
  `brand` VARCHAR(255) NULL DEFAULT NULL,
  `add_date` DATE NULL DEFAULT NULL,
  `date_of_expiry` DATE NULL DEFAULT NULL,
  `date_of_manufacture` DATE NULL DEFAULT NULL,
  `product_image` VARCHAR(400) NULL DEFAULT NULL,
  `product_name` VARCHAR(255) NULL DEFAULT NULL,
  `product_type` VARCHAR(255) NULL DEFAULT NULL,
  `rate_per_quantity` VARCHAR(255) NULL DEFAULT NULL,
  `shelf` VARCHAR(255) NULL DEFAULT NULL,
  `stock_count` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`product_code`))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `smartshop`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `smartshop`.`user` (
  `first_name` VARCHAR(50) NULL DEFAULT NULL,
  `last_name` VARCHAR(50) NULL DEFAULT NULL,
  `age` INT(2) NULL DEFAULT NULL,
  `gender` VARCHAR(7) NULL DEFAULT NULL,
  `contact_number` VARCHAR(10) NULL DEFAULT NULL,
  `user_id` VARCHAR(15) NOT NULL,
  `password` VARCHAR(255) NULL DEFAULT NULL,
  `user_type` VARCHAR(50) NULL DEFAULT NULL,
  `status` VARCHAR(1) NULL DEFAULT NULL,
  `purchase_history_purchase_id` INT(11) NOT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `smartshop`.`purchase_history`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `smartshop`.`purchase_history` (
  `purchase_id` INT(11) NOT NULL,
  `purchase_date` DATE NULL DEFAULT NULL,
  `quantity` INT(11) NULL DEFAULT NULL,
  `product_product_code` VARCHAR(255) NOT NULL,
  `user_user_id` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`purchase_id`),
  INDEX `fk_purchase_history_product1_idx` (`product_product_code` ASC),
  INDEX `fk_purchase_history_user1_idx` (`user_user_id` ASC))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `smartshop`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `smartshop`.`role` (
  `ro_id` INT(11) NOT NULL,
  `ro_name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`ro_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `smartshop`.`user_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `smartshop`.`user_role` (
  `ur_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ur_user_id` VARCHAR(255) NOT NULL,
  `ur_ro_id` INT(11) NOT NULL,
  PRIMARY KEY (`ur_id`),
  INDEX `FKjia4161ecu6h4p0egc2oc04lt` (`ur_ro_id` ASC),
  INDEX `FKoo1lekq7ucqjqc6xbgi6wr87c` (`ur_user_id` ASC),
  CONSTRAINT `FKjia4161ecu6h4p0egc2oc04lt`
    FOREIGN KEY (`ur_ro_id`)
    REFERENCES `smartshop`.`role` (`ro_id`),
  CONSTRAINT `FKoo1lekq7ucqjqc6xbgi6wr87c`
    FOREIGN KEY (`ur_user_id`)
    REFERENCES `smartshop`.`user` (`user_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
