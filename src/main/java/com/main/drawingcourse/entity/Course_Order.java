package com.main.drawingcourse.entity;

import java.time.LocalDateTime;
import java.util.Collection;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Course_Order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course_Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "courseId")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name = "orderId")
	private Order order;
	
	@Column
	private int rating;
	
	@Column(columnDefinition = "DATE")
	LocalDateTime registeredAt;
	
	@Column
	private float progress;
	
	@OneToMany(mappedBy = "course_Order")
	private Collection<Review> reviews;

}
