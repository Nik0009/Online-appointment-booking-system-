package com.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "appointments")
public class Appointment {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		
		@ManyToOne
		@JoinColumn(name = "user_id")
		private User user;


		@ManyToOne
		@JoinColumn(name = "provider_id")
		private Provider provider;
		
		
		private String date;
		private String time;
		private String status;

		
		public int getId() { return id; }
		public void setId(int id) { this.id = id; }
		public User getUser() { return user; }
		public void setUser(User user) { this.user = user; }
		public Provider getProvider() { return provider; }
		public void setProvider(Provider provider) { this.provider = provider; }
		public String getDate() { return date; }
		public void setDate(String date) { this.date = date; }
		public String getTime() { return time; }
		public void setTime(String time) { this.time = time; }
		public String getStatus() { return status; }
		public void setStatus(String status) { this.status = status; }
}

