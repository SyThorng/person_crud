package com.g3.person_api.service;

import com.g3.person_api.model.Person;
import com.g3.person_api.request.PersonRequest;

import java.util.List;

public interface PersonService {
    List<Person> getAllPerson();
    Person deletePerson(int id);
    Person serchByIdPerson(Integer id);
    Person insertPerson(PersonRequest personRequest);
    Person updatePerson(PersonRequest personRequest,Integer id);

}
