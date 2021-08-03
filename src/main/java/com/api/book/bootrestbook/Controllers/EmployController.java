package com.api.book.bootrestbook.Controllers;

import java.util.List;
import java.util.Optional;

import com.api.book.bootrestbook.Controllers.Services.EmployService;
import com.api.book.bootrestbook.Controllers.model.Employ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class EmployController {
    @Autowired
    private EmployService bookService;
    @GetMapping("/employ")
    public ResponseEntity<List<Employ>> getEmploys() {
        List<Employ> list = this.bookService.getAllEmploys();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }

    // get single book handler
    @GetMapping("/employ/{id}")
    public ResponseEntity<Employ> getEmploy(@PathVariable("id") int id) {
        Employ book = bookService.getEmployById(id);
        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @GetMapping("/total-employ")
    public String Total() {
        List<Employ> list = this.bookService.getAllEmploys();
        int count=list.size();
    
        
        return "Student : "+String.valueOf(count);
    }

    // add Book
    @PostMapping("/employ")
    public ResponseEntity<Employ> addEmploy(@RequestBody Employ book) {
        Employ b = null;
        try {
            b = this.bookService.addEmploy(book);
            return ResponseEntity.of(Optional.of(b));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    // delete book handler
    @DeleteMapping("/employ/{employ_id}")
    public ResponseEntity<Void> deleteEmploy(@PathVariable("employ_id") int id) {
        try {
            this.bookService.deleteEmploy(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // update book handler
    @PutMapping("/employ/{employ_id}")
    public Employ updateEmploy(@RequestBody Employ e, @PathVariable("employ_id") int id) {
        this.bookService.updateEmploy(e, id);
        return e;
    }
    
}
