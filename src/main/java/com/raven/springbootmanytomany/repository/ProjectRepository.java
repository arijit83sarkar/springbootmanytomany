package com.raven.springbootmanytomany.repository;

import com.raven.springbootmanytomany.entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
