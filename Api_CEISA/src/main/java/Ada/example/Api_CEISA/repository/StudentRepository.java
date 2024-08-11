package Ada.example.Api_CEISA.repository;

import Ada.example.Api_CEISA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// Interfaz que extiende JpaRepository para proporcionar métodos CRUD y consultas personalizadas
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // JpaRepository<Student, Integer>:
    // - Student: la entidad para la cual se crean los métodos de repositorio.
    // - Integer: el tipo de dato de la clave primaria (rollNo) en la entidad Student.
}


