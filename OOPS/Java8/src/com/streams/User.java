package com.streams;

import java.util.Objects;
import java.util.Optional;

public class User {
	
	int userId;
	
	String email;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + "]";
	}

	public User(int userId, String email) {
		super();
		this.userId = userId;
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && userId == other.userId;
	}
	
	public Optional<String> getUserEmailById(int id) {
		if(id == 10) {
			return Optional.of(email);
		}
		return Optional.empty();
	}

}
