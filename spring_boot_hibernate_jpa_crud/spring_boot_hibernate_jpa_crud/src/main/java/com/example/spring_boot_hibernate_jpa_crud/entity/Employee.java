package com.example.spring_boot_hibernate_jpa_crud.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "emp")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@Column(name = "employee_id")
	private Long id;

	@Column(name = "employee_name")
	private String name;
}
