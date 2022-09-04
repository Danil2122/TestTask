package ru.test.testtask.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.test.testtask.entity.Person;
import ru.test.testtask.services.PersonService;

import java.util.List;


@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public ResponseEntity<List<Person>> getCompanyList() {
        return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/person/save")
    public ResponseEntity<Void> saveOrUpdateCompany(@RequestBody Person person) {
        personService.save(person);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/person/save/{id}")
    public ResponseEntity<Void> update(@RequestBody Person person, @PathVariable Integer id) {
        person.setId(id);
        personService.save(person);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/person/delete/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable Integer id) {
        personService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
