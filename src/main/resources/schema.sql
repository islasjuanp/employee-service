USE enterprise;

CREATE TABLE employee (
    employee_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone VARCHAR(255) DEFAULT NULL,
    birth_date DATE NOT NULL,
    title VARCHAR(255) DEFAULT NULL,
    dept VARCHAR(255) NOT NULL,
    PRIMARY KEY (employee_id)
) ENGINE = INNODB;