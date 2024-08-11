# Api
# StudentControler
# @RestController: Indica que esta clase es un controlador de Spring que maneja solicitudes HTTP.
# @Autowired: Permite la inyección automática del repositorio StudentRepository, que se utiliza para interactuar con la base de datos.
# @GetMapping, @PostMapping, @PutMapping, @DeleteMapping: Mapean los métodos a las rutas y tipos de solicitudes HTTP correspondientes.
# ResponseEntity: Se utiliza para devolver respuestas HTTP personalizadas, incluyendo el estado HTTP y el cuerpo de la respuesta.
# @ResponseStatus: Permite especificar el estado HTTP que debe devolver un método en particular.

# Student 
# @Entity: Define la clase como una entidad que se mapea a una tabla en la base de datos.
# @Table: Especifica el nombre de la tabla en la base de datos a la cual se mapea esta entidad.
# @Id: Marca un campo como clave primaria.
# @GeneratedValue: Especifica cómo se generará el valor de la clave primaria. En este caso, IDENTITY indica que el valor será generado por la base de datos.
# @Column: Se usa para mapear los campos de la clase a las columnas correspondientes en la tabla de la base de datos.

# StudentRepository 
# Student: Es la entidad con la que el repositorio trabajará, proporcionando métodos CRUD (Crear, Leer, Actualizar, Eliminar) y otras operaciones comunes.
# Integer: Es el tipo de la clave primaria (rollNo) de la entidad Student.

# application.propertis

# spring.application.name: Define el nombre de la aplicación, lo cual puede ser útil para la identificación en entornos distribuidos o en los registros.
# spring.datasource.url: Especifica la URL para conectar con la base de datos MySQL.
# spring.datasource.username y spring.datasource.password: Las credenciales necesarias para autenticarse en la base de datos.
# spring.datasource.driver-class-name: Especifica la clase del controlador JDBC que se utilizará para la conexión con la base de datos.
# spring.jpa.database-platform: Configura el dialecto de Hibernate que optimiza la generación de SQL según el tipo de base de datos.
# spring.jpa.hibernate.ddl-auto: Controla cómo Hibernate gestiona el esquema de la base de datos.
# spring.jpa.show-sql: Habilita la visualización de las consultas SQL que se ejecutan en la base de datos, lo que es útil para depuración.

