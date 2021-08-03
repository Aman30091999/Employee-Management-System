package com.api.book.bootrestbook.Controllers.Services;

import java.util.List;

import com.api.book.bootrestbook.Controllers.model.Employ;
import com.api.book.bootrestbook.dao.EmployRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployService {
  @Autowired
  private EmployRepo employRepo;

  // getAll Book
  public List<Employ> getAllEmploys() {
    // database connectivity
    List<Employ> list = (List<Employ>) this.employRepo.findAll();
    return list;
  }

  // get Single Book
  public Employ getEmployById(int id) {
    Employ employ = null;
    // employ id match using lambda functon
    try {
      employ = this.employRepo.findById(id);

    } catch (Exception e) {
      e.printStackTrace();
    }
    return employ;
  }

  public Employ addEmploy(Employ b) {
    Employ result = employRepo.save(b);
    return result;
  }

  public void deleteEmploy(int bid) {
    employRepo.deleteById(bid);
  }

  // update the book
  public void updateEmploy(Employ employ, int id) {
    employ.setEmploy_id(id);
    employRepo.save(employ);
  }
}
