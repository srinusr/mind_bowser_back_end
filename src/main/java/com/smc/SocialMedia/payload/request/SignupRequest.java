package com.smc.SocialMedia.payload.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignupRequest {
 
	 @Size(max = 100)
	 private String firstName;
	 
	 @Size(max = 100)
	 private String lastName;
	 
	
	 
    @NotBlank
    @Size(max = 100)
    @Email
    private String email;
    
    
    @Size( max = 100)
    private String password;
    
   
    
    @Size(max = 100)
    private String city;
    
    
    @Size(max = 200)
    private String adress;
    
    @Size(max = 50)
    private String dob;
    
    
    private Set<String> role;
    
   
  
 
    public String getEmail() {
    	
        return email;
    }
 
    public void setEmail(String email) {
    	System.out.println("ufool"+email);
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
    	System.out.println("ufool"+password);
        this.password = password;
    }
    
    public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
    }

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
