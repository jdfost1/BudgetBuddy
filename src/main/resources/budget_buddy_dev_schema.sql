DROP DATABASE  IF EXISTS `budget_buddy_dev`;

CREATE DATABASE  IF NOT EXISTS `budget_buddy_dev`;
USE `budget_buddy_dev`;


--
-- Table structure for table `budget`
--
DROP TABLE IF EXISTS `budget`;
CREATE TABLE `budget` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `savings_target` decimal(10,2) NOT NULL,
  `rent` decimal(10,2) NOT NULL,
  `car_payment` decimal(10,2) NOT NULL,
  `car_insurance` decimal(10,2) NOT NULL,
  `utilities` decimal(10,2) NOT NULL,
  `general_savings` decimal(10,2) NOT NULL,
  `spending` decimal(10,2) NOT NULL,
  `retirement` decimal(10,2) NOT NULL,
  `remaining_expenses` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Table structure for table `suggested budget`
--

DROP TABLE IF EXISTS `Suggested_Budget`;
CREATE TABLE `Suggested_Budget` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `housing` decimal(10,2) NOT NULL,
  `utilities` decimal(10,2) NOT NULL,
  `transportation` decimal(10,2) NOT NULL,
  `insurance` decimal(10,2) NOT NULL,
  `spending` decimal(10,2) NOT NULL,
  `food` decimal(10,2) NOT NULL,
  `savings` decimal(10,2) NOT NULL,
   `miscellaneous` decimal(10,2) NOT NULL,
  
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Table structure for table `user`
--
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL UNIQUE,
  `password` char(60) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  `name` varchar(50) NOT NULL,
  `age` tinyint NOT NULL,
  `budget_id` int(11),
   `suggested_budget_id` int(11),
  PRIMARY KEY (`id`),
  FOREIGN KEY (`budget_id`) REFERENCES `budget` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Set up users
--
INSERT INTO `user` 
(`email`, `password`, `enabled`, `name`, `age`)
VALUES 
('john@gmail.com','$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K',1, 'John Doe', 32),
('mary@gmail.com','$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K',1, 'Mary Lamb', 27),
('jane@gmail.com','$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K',1, 'Jane Doe', 35),
('jlafaye800@gmail.com','$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K',1, 'J.D. LaFayette', 23);


--
-- Table structure for table `role`
--
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Set up roles
--
INSERT INTO `role`
(`name`)
VALUES 
('USER'),
('ADMIN');

--
-- Table structure for table `user_role`
--
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`, `role_id`),
  FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Set up user roles
--
INSERT INTO `user_role` 
(`user_id`, `role_id`)
VALUES 
(1,1),
(2,1),
(3,2),
(4,1);