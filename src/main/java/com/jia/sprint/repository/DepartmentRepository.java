package com.jia.sprint.repository;

import com.jia.sprint.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Jarris on 11/14/2018.
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
