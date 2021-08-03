package com.api.book.bootrestbook.dao;
import com.api.book.bootrestbook.Controllers.model.Personal;

import org.springframework.data.repository.CrudRepository;

public interface PersonalRepo extends CrudRepository<Personal,Integer> {
    public Personal findById(int id);
}
