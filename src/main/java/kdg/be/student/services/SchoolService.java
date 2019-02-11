package kdg.be.student.services;

import kdg.be.student.model.School;
import kdg.be.student.repo.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepo schoolRepo;

    public School getSchool(int id) {
        return this.schoolRepo.getOne(id);
    }

    public School saveSchool(School school) {
        return this.schoolRepo.save(school);
    }

    public void deleteSchool(int id) {
        this.schoolRepo.deleteById(id);
    }

    public List<School> getAllSchools() {
        return this.schoolRepo.findAll();
    }


    public void fillDatabase() {
        School[] schools = new School[]{
                new School("Karel de Grote", "Antwerpen"),
                new School("Artesis Plantijn", "Antwerpen"),
                new School("Tomas More", "Mechelen"),
                new School("Hoge school Gent", "Gent"),
                new School("Hogeschool PXL", "Hasselt")


        };

        for (School school : schools) {
            this.schoolRepo.save(school);
        }
    }
}
