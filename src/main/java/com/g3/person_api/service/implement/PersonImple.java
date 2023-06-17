package com.g3.person_api.service.implement;

import com.g3.person_api.model.Person;
import com.g3.person_api.repository.PersonRepository;
import com.g3.person_api.request.PersonRequest;
import com.g3.person_api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonImple implements PersonService {
    private final PersonRepository repository;

    public PersonImple(PersonRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Person> getAllPerson() {

        List<Person> persons=new ArrayList<>();

        List<Person> personList=repository.getAllPerson();
        for (Person person : personList) {
            if(person.getName()!=null && person.getGender()!=null){
                persons.add(person);
            }
        }
        return persons;
    }

    @Override
    public Person deletePerson(int id) {
        return repository.deletePerson(id);
    }

    @Override
    public Person serchByIdPerson(Integer id) {
        return repository.serchByIdPerson(id);
    }

    @Override
    public Person insertPerson(PersonRequest personRequest) {
        return repository.insertPerson(personRequest);
    }

    @Override
    public Person updatePerson(PersonRequest personRequest, Integer id) {
        return repository.updatePerson(personRequest,id);
    }

}
