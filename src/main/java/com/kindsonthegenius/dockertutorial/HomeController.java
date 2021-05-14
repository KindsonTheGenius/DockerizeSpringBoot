package com.kindsonthegenius.dockertutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/")
    private List<Person> personList() {
        ArrayList<Person> personList = new ArrayList<Person>(
                Arrays.asList(
                new Person("Kindson", "Munonye", "Budapest"),
                new Person("Adaku", "Okeke", "Nigeria"),
                new Person("Helen", "Grudals", "Hungary")
        ));
        return personList;
    }

}
