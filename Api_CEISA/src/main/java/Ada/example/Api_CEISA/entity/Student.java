package Ada.example.Api_CEISA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Indica que esta clase es una entidad de JPA que se mapea a una tabla en la base de datos
@Table(name = "student") // Especifica el nombre de la tabla en la base de datos
public class Student {

    @Id // Marca el campo 'rollNo' como la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configura la generación automática del valor del campo 'rollNo' utilizando la estrategia de identidad
    private int rollNo;

    @Column(name = "student_name") // Mapea el campo 'name' a la columna 'student_name' en la tabla
    private String name;

    @Column(name = "student_percentage") // Mapea el campo 'percentage' a la columna 'student_percentage' en la tabla
    private float percentage;

    @Column(name = "student_branch") // Mapea el campo 'branch' a la columna 'student_branch' en la tabla
    private String branch;

    // Constructor sin argumentos necesario para JPA
    public Student() {
        // TODO Auto-generated constructor stub
    }

    // Constructor con argumentos para inicializar los campos de la clase
    public Student(String name, float percentage, String branch) {
        super();
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    // Métodos getters y setters para acceder y modificar los campos de la clase
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // Método toString para representar el objeto Student como una cadena de texto
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch + "]";
    }

}



