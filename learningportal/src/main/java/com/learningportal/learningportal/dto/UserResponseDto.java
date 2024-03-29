package com.learningportal.learningportal.dto;

import java.util.List;

import com.learningportal.learningportal.entity.UserEntity;

import lombok.Data;

@Data
public class UserResponseDto {

	private Long id;
	private String name;
	private UserEntity.Roles role;
	private List<CourseResponseDto> enrolledCourses;
	private List<CourseResponseDto> favoriteCourses;
}