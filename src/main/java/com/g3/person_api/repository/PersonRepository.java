package com.g3.person_api.repository;

import com.g3.person_api.model.Person;
import com.g3.person_api.request.PersonRequest;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonRepository {

    @Select("Select * from person")
    List<Person> getAllPerson();

    @Select("Delete from person where id=#{id}")
    Person deletePerson(int id);

    @Select("Select * from person where id=#{id}")
    Person serchByIdPerson(Integer id);
    @Select("Insert into person (name,gender) values (#{person.name},#{person.gender}) returning  *")
    Person insertPerson(@Param("person") PersonRequest personRequest);

    @Select("Update person set name=#{PersonRequest.name},gender=#{PersonRequest.gender} where id=#{id} returning *")
    Person updatePerson(@Param("PersonRequest") PersonRequest personRequest, Integer id);
}
