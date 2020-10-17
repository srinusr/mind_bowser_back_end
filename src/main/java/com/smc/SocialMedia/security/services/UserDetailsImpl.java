package com.smc.SocialMedia.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.smc.SocialMedia.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails{
	private static final long serialVersionUID = 1L;

	private Long id;

	private String firstName;

	private String email;

	@JsonIgnore
	private String password;


	public UserDetailsImpl(Long id, String firstname, String email, String password) {
		this.id = id;
		this.firstName = firstname;
		this.email = email;
		this.password = password;
	}

	public static UserDetailsImpl build(User user) {


		return new UserDetailsImpl(
				user.getId(), 
				user.getFirstName(), 
				user.getEmail(),
				user.getPassword() 
				);
	}



	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String getPassword() {
		return password;
	}

	
	public String getFirstName() {
		return firstName;
	}


	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user = (UserDetailsImpl) o;
		return Objects.equals(id, user.id);
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

}
