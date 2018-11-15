package com.jia.sprint.repository;

import com.jia.sprint.config.JpaConfig;
import com.jia.sprint.model.Department;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Jarris on 11/14/2018.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {JpaConfig.class})
@Slf4j
public class MySQLTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    public void testSave(){
        Department department = new Department();
        department.setName("开发部");
        departmentRepository.save(department);
    }
}
