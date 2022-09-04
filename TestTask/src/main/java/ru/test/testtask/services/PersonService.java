package ru.test.testtask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.test.testtask.entity.Person;
import ru.test.testtask.repositories.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Person getPersonByID(Integer id){
        return personRepository.findById(id).get();
    }
    public void save(Person person){
        personRepository.save(person);
    }

    public void update(int id, Person person){
        person.setId(id);
        personRepository.save(person);
    }

    public void delete(int id){
        personRepository.deleteById(id);
    }
}
