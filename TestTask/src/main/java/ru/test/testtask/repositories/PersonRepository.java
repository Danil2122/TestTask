package ru.test.testtask.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.testtask.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
}
