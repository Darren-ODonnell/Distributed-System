import java.util.ArrayList;
import java.util.List;

import dao.PersonDAO;
import dao.PetDAO;
import dao.VetDAO;
import entities.Person;
import entities.Pet;
import entities.Vet;

public class Main {

    public Main(){
        Vet vet = new Vet("WildWood PetHealth");

        List<Person> people = new ArrayList<>();
        Pet pet1 = new Pet("Rusty", "Dog", 6);
        Pet pet2 = new Pet("Tabby", "Cat", 2);
        Pet pet3 = new Pet("Bunny", "Rabbit", 0.5);
        Person person1 = new Person("John", "2 Wildwood Terrace", pet1);
        Person person2 = new Person("Mary", "3 Wildwood Terrace", pet2);
        Person person3 = new Person("Tara", "4 Wildwood Terrace", pet3);
        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person person: people) {
            vet.signUp(person);
        }

        System.out.println(vet.getName());
        for(Person p: vet.getPatients()){
            System.out.println(p.toString());
        }
        
        persistPet(pet1);
        persistPet(pet2);
        persistPet(pet3);
        
        persistPeople(people);
        
        persistVet(vet);
        
    }
    
    public void persistPet(Pet pet){
    	PetDAO petDao = new PetDAO();
    	petDao.persistPet(pet);
    }
    
    
    public void persistVet(Vet vet) {
    	VetDAO vetDao = new VetDAO();
    	vetDao.persistVet(vet);
    }
    
    public void persistPeople(List<Person> people) {
    	for(Person p: people) {
    		PersonDAO personDao = new PersonDAO();
    		personDao.persistPerson(p);
    	}
    }

    
    public void persistPerson(Person person) {
    	PersonDAO personDao = new PersonDAO();
    	personDao.persistPerson(person);
    }

    public static void main(String[] args) {
        new Main();
    }
}