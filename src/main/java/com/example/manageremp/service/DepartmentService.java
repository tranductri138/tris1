package com.example.manageremp.service;

import com.example.manageremp.model.DepartmentDto;
import com.example.manageremp.model.UserDto;

import java.util.List;

public interface DepartmentService {
    void add(DepartmentDto departmentDto);

    void update(DepartmentDto departmentDto);
    void delete(Long id);
    DepartmentDto getUser(Long id);

    List<DepartmentDto> searchUser(String name, int offset, int maxPerPage);
}
