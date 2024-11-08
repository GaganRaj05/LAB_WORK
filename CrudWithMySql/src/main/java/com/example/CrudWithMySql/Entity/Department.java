package com.example.CrudWithMySql.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentID;
	private String departmentName;
	private String departmentAddress;
}