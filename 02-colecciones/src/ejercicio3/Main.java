package ejercicio3;

public class Main {

    public static void main(String[] args) {

        // 1. Crear la universidad, 3 profesores y 5 cursos
        Universidad universidad = new Universidad("Universidad Tecnológica Nacional");

        Profesor p1 = new Profesor("P001", "Juan Pérez", "Programación");
        Profesor p2 = new Profesor("P002", "María González", "Bases de Datos");
        Profesor p3 = new Profesor("P003", "Carlos López", "Matemática");

        Curso c1 = new Curso("C001", "Programación I");
        Curso c2 = new Curso("C002", "Programación II");
        Curso c3 = new Curso("C003", "Bases de Datos");
        Curso c4 = new Curso("C004", "Sistemas Operativos");
        Curso c5 = new Curso("C005", "Matemática");

        // 2. Agregar profesores y cursos a la universidad
        System.out.println("=== AGREGAR PROFESORES Y CURSOS ===");

        universidad.agregarProfesor(p1);
        universidad.agregarProfesor(p2);
        universidad.agregarProfesor(p3);

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        System.out.println("Profesores y cursos agregados correctamente");

        // 3. Asignar profesores a los cursos
        System.out.println("\n=== ASIGNAR PROFESORES ===");

        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P001");
        universidad.asignarProfesorACurso("C003", "P002");
        universidad.asignarProfesorACurso("C004", "P002");
        universidad.asignarProfesorACurso("C005", "P003");

        System.out.println("Profesores asignados correctamente");

        // 4. Listar profesores y cursos
        System.out.println("\n=== LISTA DE PROFESORES ===");
        universidad.listarProfesores();

        System.out.println("\n=== LISTA DE CURSOS ===");
        universidad.listarCursos();

        System.out.println("\n=== CURSOS DE CADA PROFESOR ===");

        System.out.println("\nCursos de Juan:");
        p1.listarCursos();

        System.out.println("\nCursos de María:");
        p2.listarCursos();

        System.out.println("\nCursos de Carlos:");
        p3.listarCursos();

        // 5. Cambiar el profesor de un curso
        System.out.println("\n=== CAMBIAR PROFESOR DE UN CURSO ===");

        System.out.println("Profesor anterior de Programación II:");
        c2.mostrarInfo();

        universidad.asignarProfesorACurso("C002", "P002");

        System.out.println("\nProfesor nuevo de Programación II:");
        c2.mostrarInfo();

        System.out.println("\nCursos de Juan después del cambio:");
        p1.listarCursos();

        System.out.println("\nCursos de María después del cambio:");
        p2.listarCursos();

        // 6. Eliminar un curso
        System.out.println("\n=== ELIMINAR CURSO ===");

        universidad.eliminarCurso("C003");

        System.out.println("Cursos restantes en la universidad:");
        universidad.listarCursos();

        System.out.println("\nCursos de María después de eliminar C003:");
        p2.listarCursos();

        // 7. Eliminar un profesor
        System.out.println("\n=== ELIMINAR PROFESOR ===");

        universidad.eliminarProfesor("P003");

        System.out.println("Profesores restantes:");
        universidad.listarProfesores();

        System.out.println("\nCurso que pertenecía a Carlos:");
        c5.mostrarInfo();

        // 8. Reporte de cantidad de cursos por profesor
        System.out.println("\n=== REPORTE DE CURSOS POR PROFESOR ===");

        universidad.listarProfesores();

    }
}
