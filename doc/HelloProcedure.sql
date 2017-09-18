DELIMITER //
CREATE PROCEDURE getnamedemo (IN id INT(11))
	BEGIN
		SELECT h.message
		FROM hello_entity as h 
		WHERE h.id = id;
	END //
    
DELIMITER ;