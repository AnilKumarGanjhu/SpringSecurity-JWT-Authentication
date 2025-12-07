package com.jwt.models;

public class JwtResponse {

	private String jwtToken;
	private String username;

	private JwtResponse(Builder builder) {
		this.jwtToken = builder.jwtToken;
		this.username = builder.username;
	}

	public JwtResponse() {
	}

	public JwtResponse(String jwtToken, String username) {
		this.jwtToken = jwtToken;
		this.username = username;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// ⭐ Correct builder() method
	public static Builder builder() {
		return new Builder();
	}

	// ⭐ Inner static Builder class
	public static class Builder {

		private String jwtToken;
		private String username;

		public Builder jwtToken(String jwtToken) {
			this.jwtToken = jwtToken;
			return this;
		}

		public Builder username(String username) {
			this.username = username;
			return this;
		}

		// ⭐ Final build() method
		public JwtResponse build() {
			return new JwtResponse(this);
		}
	}
}
