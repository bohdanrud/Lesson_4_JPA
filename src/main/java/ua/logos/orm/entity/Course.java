package ua.logos.orm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "course")
@Getter @Setter 
@NoArgsConstructor
public class Course extends BaseEntity{
	
	
	
	@Column(name = "title", length = 100)
	private String title;
	
	@Column(name = "description", length = 500)
	private String description;
	
	@Column(name = "price", columnDefinition = "DECIMAL(5,2)")                  //999.99
	private BigDecimal price;

	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;
	
	@ManyToMany
	@JoinTable(name = "course_student", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "student_id"))
	private List<Student> students = new ArrayList<>(); 
	
}
