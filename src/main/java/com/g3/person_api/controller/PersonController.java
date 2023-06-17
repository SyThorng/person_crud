package com.g3.person_api.controller;

import com.g3.person_api.exception.NotFound;
import com.g3.person_api.model.Person;
import com.g3.person_api.model.dto.Respon;
import com.g3.person_api.request.PersonRequest;
import com.g3.person_api.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/person")
@CrossOrigin
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("")
    public ResponseEntity<Respon<List<Person>>> getAllPerson(){
        Respon<List<Person>> respon=Respon.<List<Person>>builder()
                .payload(personService.getAllPerson())
                .message("Get Data Success")
                .stauts(200).build();
        return ResponseEntity.ok().body(respon);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Respon<Person>> deletePerson(
            @PathVariable int id
    ){
        if(personService.serchByIdPerson(id)==null){
           throw new NotFound("id not found..!!");
        }
        Respon<Person> respon=Respon.<Person>builder()
                .payload(personService.deletePerson(id))
                .message("delete Data Success")
                .stauts(200).build();
        return ResponseEntity.ok().body(respon);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Respon<Person>> searchByIdPerson(
            @PathVariable int id
    ){
        if (personService.serchByIdPerson(id)!=null){
            Respon<Person> respon=Respon.<Person>builder()
                    .payload(personService.serchByIdPerson(id))
                    .message("search Data Success")
                    .stauts(200).build();
            return ResponseEntity.ok().body(respon);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("")
    public ResponseEntity<Respon<Person>>  insertPerson(
            @RequestBody PersonRequest personRequest
            ){
        Respon<Person> respon=Respon.<Person>builder()
                .payload(personService.insertPerson(personRequest))
                .message("insert Data Success")
                .stauts(200).build();
        return ResponseEntity.ok().body(respon);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Respon<Person>>  updatePerson(
            @PathVariable int id,
            @RequestBody PersonRequest personRequest
    ){
        if(personService.serchByIdPerson(id)!=null){
            Respon<Person> respon=Respon.<Person>builder()
                    .payload(personService.updatePerson(personRequest,id))
                    .message("update Data Success")
                    .stauts(200).build();
            return ResponseEntity.ok().body(respon);
        }
        return ResponseEntity.notFound().build();
    }
}
