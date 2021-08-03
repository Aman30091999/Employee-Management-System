package com.api.book.bootrestbook.dao;

import com.api.book.bootrestbook.Controllers.model.Employ;

import org.springframework.data.repository.CrudRepository;

public interface EmployRepo extends CrudRepository<Employ,Integer> {
    public Employ findById(int id);
}
