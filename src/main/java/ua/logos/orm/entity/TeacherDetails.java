package ua.logos.orm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teacher_details")
@Getter @Setter 
@NoArgsConstructor
public class TeacherDetails extends BaseEntity{

	@Column (name = "first_name")
	private String firstName;
	
	@Column (name = "last_name")
	private String lastName;
	
	@Column (name = "age")
	private int age;
	
	@Column (name = "hobby")
	private String hobby;
	
	@OneToOne(mappedBy = "teacherDetails")
	private Teacher teacher;

	
	
	
	
}
