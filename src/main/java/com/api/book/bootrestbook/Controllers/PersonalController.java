package com.api.book.bootrestbook.Controllers;

import java.util.List;
import java.util.Optional;

import com.api.book.bootrestbook.Controllers.Services.PersonalService;
import com.api.book.bootrestbook.Controllers.model.Personal;

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
public class PersonalController {
    @Autowired
    private PersonalService bookService;
    @GetMapping("/personal")
    public ResponseEntity<List<Personal>> getPersonals() {
        List<Personal> list = this.bookService.getAllPersonals();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }

    // get single book handler
    @GetMapping("/personal/{id}")
    public ResponseEntity<Personal> getPersonal(@PathVariable("id") int id) {
        Personal book = bookService.getPersonalById(id);
        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @GetMapping("/total-personal")
    public String Total() {
        List<Personal> list = this.bookService.getAllPersonals();
        int count=list.size();
    
        
        return "Data : "+String.valueOf(count);
    }

    // add Book
    @PostMapping("/personal")
    public ResponseEntity<Personal> addPersonal(@RequestBody Personal book) {
        Personal b = null;
        try {
            b = this.bookService.addPersonal(book);
            return ResponseEntity.of(Optional.of(b));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    // delete book handler
    @DeleteMapping("/personal/{employee_id}")
    public ResponseEntity<Void> deletePersonal(@PathVariable("employee_id") int id) {
        try {
            this.bookService.deletePersonal(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // update book handler
    @PutMapping("/personal/{employee_id}")
    public Personal updatePersonal(@RequestBody Personal e, @PathVariable("employee_id") int id) {
        this.bookService.updatePersonal(e, id);
        return e;
    }
    
}
