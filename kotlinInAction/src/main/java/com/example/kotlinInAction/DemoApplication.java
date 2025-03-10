package com.example.kotlinInAction;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.kotlinInAction.classAndProperty.kotlin.Person;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Person person = new Person("Bob", false);
		System.out.println(person.getName());
		System.out.println(person.isStudent());

		person.setStudent(true);
		System.out.println(person.isStudent());
	}
}

