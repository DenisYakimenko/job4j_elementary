package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Pavel", "Sidorov", "534111", "Moscow")
        );
        ArrayList<Person> persons = phones.find("Sidorov");
        assertThat(persons.get(0).getName()).isEqualTo("Pavel");
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Pavel", "Sidorov", "534111", "Moscow")
        );
        ArrayList<Person> persons = phones.find("534");
        assertThat(persons.get(0).getSurname()).isEqualTo("Sidorov");
    }

    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Pavel", "Sidorov", "534111", "Moscow")
        );
        ArrayList<Person> persons = phones.find("Mos");
        assertThat(persons.get(0).getSurname()).isEqualTo("Sidorov");
    }

    @Test
    public void whenFindThenEmpty() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Pavel", "Sidorov", "534111", "Moscow")
        );
        ArrayList<Person> persons = phones.find("Ivanov");
        assertThat(persons).isEmpty();
    }

}