CREATE TABLE student        
(
student_id VARCHAR(6),
student_name VARCHAR(40),
degree_scheme VARCHAR(40),
PRIMARY KEY (student_id)
);

CREATE TABLE `module`
(
module_id VARCHAR(5),
module_name VARCHAR(40),
credits INT(2),
PRIMARY KEY (module_id)
);

CREATE TABLE staff
(
staff_id VARCHAR(6),
staff_name VARCHAR(40),
grade VARCHAR(40),
PRIMARY KEY (staff_id)
);

CREATE TABLE registered
(
student_id VARCHAR(6),
module_id VARCHAR(6),
PRIMARY KEY (student_id, module_id),
FOREIGN KEY (student_id) REFERENCES student(student_id), 
FOREIGN KEY (module_id) REFERENCES `module`(module_id)
);

CREATE TABLE teaches
(
staff_id VARCHAR(6),
module_id VARCHAR(6),
PRIMARY KEY (staff_id, module_id),
FOREIGN KEY (staff_id) REFERENCES staff(staff_id), 
FOREIGN KEY (module_id) REFERENCES `module`(module_id)
);