package org.epragati.dto.enclosure;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ImageActionsDTO {
private String name;
private String  role;
private String action;
private String comments;
@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss.SSS")
private LocalDateTime actionDatetime;

/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the role
 */
public String getRole() {
	return role;
}
/**
 * @param role the role to set
 */
public void setRole(String role) {
	this.role = role;
}
/**
 * @return the action
 */
public String getAction() {
	return action;
}
/**
 * @param action the action to set
 */
public void setAction(String action) {
	this.action = action;
}
/**
 * @return the comments
 */
public String getComments() {
	return comments;
}
/**
 * @param comments the comments to set
 */
public void setComments(String comments) {
	this.comments = comments;
}
/**
 * @return the comments
 */
/**
 * @return the actionDatetime
 */
public LocalDateTime getActionDatetime() {
	return actionDatetime;
}
/**
 * @param actionDatetime the actionDatetime to set
 */
public void setActionDatetime(LocalDateTime actionDatetime) {
	this.actionDatetime = actionDatetime;
}


}
