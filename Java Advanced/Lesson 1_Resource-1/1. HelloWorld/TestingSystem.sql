-- Drop the database if it already exists
DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE IF NOT EXISTS TestingSystem;
USE TestingSystem;

-- Create table Group
DROP TABLE IF EXISTS 	`Group`;
CREATE TABLE IF NOT EXISTS `Group` (
	id 				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`name` 			NVARCHAR(50) NOT NULL UNIQUE KEY
);

-- INSERT DATA 
-- =============================================
INSERT INTO `Group` (`name` )

VALUE				('Java Fresher'	),			
					('Java Web'		),			
					('C# Fresher'	);