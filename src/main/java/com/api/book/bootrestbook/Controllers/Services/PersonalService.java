package com.api.book.bootrestbook.Controllers.Services;

import java.util.List;

import com.api.book.bootrestbook.Controllers.model.Personal;
import com.api.book.bootrestbook.dao.PersonalRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonalService {
    @Autowired
  private PersonalRepo employRepo;

  // getAll Book
  public List<Personal> getAllPersonals() {
    // database connectivity
    List<Personal> list = (List<Personal>) this.employRepo.findAll();
    return list;
  }

  // get Single Book
  public Personal getPersonalById(int id) {
    Personal employ = null;
    // employ id match using lambda functon
    try {
      employ = this.employRepo.findById(id);

    } catch (Exception e) {
      e.printStackTrace();
    }
    return employ;
  }

  public Personal addPersonal(Personal b) {
    Personal result = employRepo.save(b);
    return result;
  }

  public void deletePersonal(int bid) {
    employRepo.deleteById(bid);
  }

  // update the book
  public void updatePersonal(Personal employ, int id) {
    employ.setId(id);
    employRepo.save(employ);
  }
}
