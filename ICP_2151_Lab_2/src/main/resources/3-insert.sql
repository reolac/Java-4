INSERT INTO student VALUES('S10345', 'John Smith', 'BSc Computer Science');
INSERT INTO student VALUES('S10346', 'Sian Evans', 'BSc Computer Science');
INSERT INTO student VALUES('S10347', 'Sean Crossan', 'BSc Electronic Engineering');
INSERT INTO student VALUES('S10348', 'Jamie McDonald', 'BSc Mathematics');

INSERT INTO `module` VALUES('CS101', 'Introduction to Computing', '10');
INSERT INTO `module` VALUES('CS203', 'Data Structures and Algorithms', '10');
INSERT INTO `module` VALUES('CS204', 'Computer Architecture', '10');
INSERT INTO `module` VALUES('M101', 'Foundation Mathematics', '20');

INSERT INTO staff VALUES('E10010', 'Alan Turing', 'Senior Lecturer');
INSERT INTO staff VALUES('E10011', 'Tony Hoare', 'Reader');
INSERT INTO staff VALUES('E10012', 'Seymour Cray', 'Lecturer');

INSERT INTO registered VALUES('S10345', 'CS101');
INSERT INTO registered VALUES('S10346', 'CS203');
INSERT INTO registered VALUES('S10346', 'CS204');
INSERT INTO registered VALUES('S10347', 'CS204');
INSERT INTO registered VALUES('S10348', 'M101');
INSERT INTO registered VALUES('S10348', 'CS101');

INSERT INTO teaches VALUES('E10010', 'CS101');
INSERT INTO teaches VALUES('E10011', 'CS203');
INSERT INTO teaches VALUES('E10012', 'CS204');
INSERT INTO teaches VALUES('E10010', 'CS204');
INSERT INTO teaches VALUES('E10011', 'M101');
INSERT INTO teaches VALUES('E10011', 'CS101');

