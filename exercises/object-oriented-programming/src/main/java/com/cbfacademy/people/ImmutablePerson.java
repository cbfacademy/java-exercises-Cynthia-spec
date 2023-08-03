package com.cbfacademy.people;

import java.util.ArrayList;


public class ImmutablePerson {
    private String firstName; 
    private String middleName;
    private String lastName;
    private ArrayList<String>listOfNickName;


public ImmutablePerson(String firstName,String lastName ) {
  this.firstName = firstName;
  this.lastName = lastName;

};

} 