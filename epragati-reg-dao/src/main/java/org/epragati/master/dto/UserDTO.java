package org.epragati.master.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_users")
public class UserDTO extends UserLogDTO {

	private static final long serialVersionUID = 1L;

}
