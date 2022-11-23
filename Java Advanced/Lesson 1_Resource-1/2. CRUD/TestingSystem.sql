-- =============================================
-- Create Structure database
-- =============================================

-- Drop the database if it already exists
DROP DATABASE IF EXISTS TestingSystem;
-- Create database
CREATE DATABASE IF NOT EXISTS TestingSystem;
USE TestingSystem;

-- Create table Group
DROP TABLE IF EXISTS 	`Department`;
CREATE TABLE IF NOT EXISTS `Department` (
	id 				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`name` 			NVARCHAR(50) NOT NULL UNIQUE KEY
);

-- =============================================
-- INSERT DATA 
-- =============================================
USE TestingSystem;

INSERT INTO `Department` (`name` )

VALUE				('Sale'),			
					('Marketting'),			
					('BOD');
                    