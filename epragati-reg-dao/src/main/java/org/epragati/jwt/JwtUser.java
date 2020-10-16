package org.epragati.jwt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.epragati.master.dto.RolesDTO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.CollectionUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JwtUser implements UserDetails {

	private static final long serialVersionUID = -4024495734354874317L;

	private final String id;
	private final String firstname;
	private final String lastname;
	private final String password;
	private final RolesDTO primaryRole;
	private final List<RolesDTO> additionalRoles;
	private final String officeCode;
	private final String parentUserId;
	private final boolean isParent;
	private final boolean isPasswordResetRequired;
	private Boolean isAccountNonLocked;
	private LocalDateTime userAadhaarAuthTime;
	private LocalDate validTo;
	private Collection<GrantedAuthority> authorities;
	private String lastLoginTime;
	

	public JwtUser(String id,  String firstname, String lastname,  String password
			,RolesDTO primaryRole,List<RolesDTO> additionalRoles,String officeCode,String parentUserId,boolean isParent,
			boolean isPasswordResetRequired,boolean isAccountNonLocked,LocalDateTime userAadhaarAuthTime,LocalDate validTo) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.primaryRole=primaryRole;
		this.additionalRoles=additionalRoles;
		this.officeCode=officeCode;
		this.parentUserId=parentUserId;
		this.isParent=isParent;
		this.isPasswordResetRequired = isPasswordResetRequired;
		this.isAccountNonLocked=isAccountNonLocked;
		this.userAadhaarAuthTime=userAadhaarAuthTime;
		this.validTo=validTo;
		
		final String rolePrefix="ROLE_";
	
		if (primaryRole!=null||!CollectionUtils.isEmpty(additionalRoles)) {
			
			Collection<GrantedAuthority> authorities = new HashSet<>();
			authorities.add(new SimpleGrantedAuthority(rolePrefix + primaryRole.getName()));
			if(!CollectionUtils.isEmpty(additionalRoles))
			{
					additionalRoles.stream()
					.map(r -> new SimpleGrantedAuthority(rolePrefix + r.getName())).collect(Collectors.toSet());
			}
			this.authorities=authorities;
		}	
	}

	public boolean isPasswordResetRequired() {
		return isPasswordResetRequired;
	}

	@JsonIgnore
	public String getId() {
		return id;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@JsonIgnore
	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		 
		return authorities;
	}
	
	@JsonIgnore
	public RolesDTO getPrimaryRole() {
		return primaryRole;
	}
	@JsonIgnore
	public List<RolesDTO> getAdditionalRoles() {
		return additionalRoles;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

	@Override
	public String getUsername() {
		return  id;
	}

	public String getOfficeCode() {
		return officeCode;
	}
	/**
	 * @return the parentUserId
	 */
	public String getParentUserId() {
		return parentUserId;
	}

	/**
	 * @return the isParent
	 */
	public boolean isParent() {
		return isParent;
	}

	/**
	 * @return the isAccountNonLocked
	 */
	public Boolean getIsAccountNonLocked() {
		return isAccountNonLocked;
	}

	/**
	 * @param isAccountNonLocked the isAccountNonLocked to set
	 */
	public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}
	
	public LocalDateTime getUserAadhaarAuthTime() {
		return userAadhaarAuthTime;
	}

	@JsonIgnore
	public void setUserAadhaarAuthTime(LocalDateTime userAadhaarAuthTime) {
		this.userAadhaarAuthTime = userAadhaarAuthTime;
	}

	public LocalDate getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

}
