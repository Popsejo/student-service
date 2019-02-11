package kdg.be.student.services;

import kdg.be.student.model.Student;
import kdg.be.student.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;
    @Autowired
    private SchoolService schoolService;

    public Student getStudent(int id){
        return repo.getOne(id);
    }

    public Student saveStudent(Student student){
        return this.repo.save(student);
    }

    public void deleteStudent(int id){
        this.repo.deleteById(id);
    }

    public List<Student> getAllStudents(){
        return this.repo.findAll();
    }


    public void fillDatabase(){
        this.schoolService.fillDatabase();
        Random rand = new Random();
        Student [] students = new Student[]{
                new Student("Jordi Bosch", "Toegepaste Informatica",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Rilind Nuka", "Toegepaste Informatica",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Robin Ryckmans", "Toegepaste Informatica",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Matthias Suykerbuyk", "Toegepaste Informatica",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Abdel el Makrini", "Toegepaste Informatica",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Yassine Bouzeya", "Toegepaste Informatica",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Jef Peeters", "Toegepaste Informatica",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Maarten Janssens", "Toegepaste Filosofie",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Johnny Walker", "Toegepaste Filosofie",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Jack Daniels", "Toegepaste Psychologie",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Gin Gordon", "Toegepaste Filosofie",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Jim Beam", "Rechten",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Hilary Amanda", "Fotografie",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Leila Ines", "Grafisch Ontwerp",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Wade Milly", "Vrije Kunsten",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Samuli Indah", "Maatschappelijk Werk",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Brian Arun", "Orthopedadogie",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Kalyani Herman", "Multimedia",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Deidra Unity", "Bedrijfsmanagement",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Silvio Silke", "Chemie",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Maxine Yonina", "Cross Media Management",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Eos Cevahir", "HR for Business",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Abel Mus", "Rechten",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Zuzanna Aggier", "Toegepaste Psychologie",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Jacek Raja", "Toegepaste Psychologie",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Meryl Tracey", "Toegepaste Filosofie",schoolService.getSchool(rand.nextInt(5)+1)),
                new Student("Metodij Hellem", "Toegepaste Filosofie",schoolService.getSchool(rand.nextInt(5)+1))
        };
        for (Student student : students){
            this.repo.save(student);
        }
    }
}
