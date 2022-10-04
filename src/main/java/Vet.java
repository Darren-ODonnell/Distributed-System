import java.util.ArrayList;
import java.util.List;
@Entity
public class Vet {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;
    String name;

    @OneToMany
    List<Person> patients;

    public Vet(){}

    public Vet(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatients(List<Person> patients) {
        this.patients = patients;
    }

    public void signUp(Person p){
        patients.add(p);
    }

    public List<Person> getPatients(){
        return patients;
    }
}
