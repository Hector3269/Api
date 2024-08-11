package Ada.example.Api_CEISA.controller;

import Ada.example.Api_CEISA.entity.Student;
import Ada.example.Api_CEISA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentControler {

    // Inyección de dependencias para el repositorio de estudiantes
    @Autowired
    StudentRepository repo;

    // Método para obtener todos los estudiantes
    // Se accede mediante: localhost:8080/students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        // Busca y devuelve todos los estudiantes de la base de datos
        List<Student> students = repo.findAll();
        return students;
    }

    // Método para obtener un estudiante por su ID
    // Se accede mediante: localhost:8080/students/{id}
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        // Busca y devuelve el estudiante con el ID especificado
        Student student = repo.findById(id).get();
        return student;
    }

    // Método para crear un nuevo estudiante
    // Se accede mediante: localhost:8080/student/add
    @PostMapping("/student/add")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        // Guarda el nuevo estudiante en la base de datos
        Student newStudent = repo.save(student);
        // Devuelve una respuesta con el estado HTTP 201 (CREATED) y el estudiante creado
        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
    }

    // Método para actualizar un estudiante existente
    // Se accede mediante: localhost:8080/student/update/{id}
    @PutMapping("/student/update/{id}")
    public Student updateStudents(@PathVariable int id) {
        // Busca el estudiante con el ID especificado
        Student student = repo.findById(id).get();
        // Actualiza los valores de nombre y porcentaje del estudiante
        student.setName("poonam");
        student.setPercentage(92);
        // Guarda los cambios en la base de datos
        repo.save(student);
        // Devuelve el estudiante actualizado
        return student;
    }

    // Método para eliminar un estudiante por su ID
    // Se accede mediante: localhost:8080/student/delete/{id}
    @DeleteMapping("/student/delete/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT) // Indica que la operación fue exitosa pero no devuelve contenido
    public void removeStudent(@PathVariable int id) {
        // Busca el estudiante con el ID especificado
        Student student = repo.findById(id).get();
        // Elimina el estudiante de la base de datos
        repo.delete(student);
    }
}

