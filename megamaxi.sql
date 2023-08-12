-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `megamaxi_bdd` DEFAULT CHARACTER SET utf8 ;
USE `megamaxi_bdd` ;

-- -----------------------------------------------------
-- Table `mydb`.`Proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `megamaxi_bdd`.`Proveedor` (
  `idProveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `cantidadEntregaAlMes` DOUBLE NULL,
  PRIMARY KEY (`idProveedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `megamaxi_bdd`.`Categoria` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(256) NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB;

--------------------------------------------------------
-- Table `mydb`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `megamaxi_bdd`.`Producto` (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `identificador` VARCHAR(32) NULL,
  `cantidad` INT NULL,
  `precio` DOUBLE NULL,
  `precioComercializacion` DOUBLE NULL,
  `fechaCaducidad` INT NULL,
  `fechaRegistro` date NULL,
  `total` DOUBLE NULL,
  `unidadesEnExistencia` INT NULL,
  `idProveedor` INT NULL,
  `idCategoria` INT NULL,
  `esPlastico` boolean NULL,
  `esMetal` boolean NULL,
  `esImportado` boolean NULL,
  `tipoCarnico` VARCHAR(5) NULL,
  `peso` DOUBLE NULL,
  `capacidadEnvaseMl` DOUBLE NULL,
  `esLacteo` CHAR(1) NULL,
  `fechaEntrega` DATE NULL,
  PRIMARY KEY (`idProducto`),
  INDEX `idProveedorFk_idx` (`idProveedor` ASC) VISIBLE,
  INDEX `idCateroriaFk_idx` (`idCategoria` ASC) VISIBLE,
  CONSTRAINT `idProveedorFk`
    FOREIGN KEY (`idProveedor`)
    REFERENCES `megamaxi_bdd`.`Proveedor` (`idProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idCateroriaFk`
    FOREIGN KEY (`idCategoria`)
    REFERENCES `megamaxi_bdd`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
USE `megamaxi_bdd` ;


-- -----------------------------------------------------


INSERT INTO `megamaxi_bdd`.`categoria`
(`nombre`,
`descripcion`)
VALUES
("Utensilio",
"Producto para determinar si de material de metal o plastico y si es importado o no");

INSERT INTO `megamaxi_bdd`.`categoria`
(`nombre`,
`descripcion`)
VALUES
("Cárnico",
"Producto tipo de carne (cerdo, pollo, res) y el peso de estos");

INSERT INTO `megamaxi_bdd`.`categoria`
(`nombre`,
`descripcion`)
VALUES
("Líquido",
"Capacidad de envase y si es lácteo o no");
