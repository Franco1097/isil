import entidades.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<EvaluacionPermanente> evaluacionPermanenteList = new ArrayList<>();
        evaluacionPermanenteList.add(new EvaluacionPermanente(15));
        evaluacionPermanenteList.add(new EvaluacionPermanente(18));
        evaluacionPermanenteList.add(new EvaluacionPermanente(20));
        evaluacionPermanenteList.add(new EvaluacionPermanente(19));

        List<EvaluacionPermanente> evaluacionPermanenteList2 = new ArrayList<>();
        evaluacionPermanenteList2.add(new EvaluacionPermanente(10));
        evaluacionPermanenteList2.add(new EvaluacionPermanente(8));
        evaluacionPermanenteList2.add(new EvaluacionPermanente(10));
        evaluacionPermanenteList2.add(new EvaluacionPermanente(10));

        Asignatura asignatura1 = new Asignatura();
        asignatura1.setDescripcion("Desarrollo de Aplicaciones I");
        asignatura1.setCredito(6);
        asignatura1.setCodigoUnico("NRC2023564");
        asignatura1.setProfesor("Eduardo Zuñiga");
        asignatura1.setEvaluacionFinal(new EvaluacionFinal(15));
        asignatura1.setEvaluacionParcial(new EvaluacionParcial(12));
        asignatura1.setEvaluacionPermanentes(evaluacionPermanenteList);

        Asignatura asignatura2 = new Asignatura();
        asignatura2.setDescripcion("Desarrollo de App Modernas con SCRUM");
        asignatura2.setCredito(7);
        asignatura2.setCodigoUnico("NRC2621564");
        asignatura2.setProfesor("Eduardo Zuñiga");
        asignatura2.setEvaluacionFinal(new EvaluacionFinal(10));
        asignatura2.setEvaluacionParcial(new EvaluacionParcial(8));
        asignatura2.setEvaluacionPermanentes(evaluacionPermanenteList2);

        List<Asignatura> asignaturas = new ArrayList<>();
        asignaturas.add(asignatura1);
        asignaturas.add(asignatura2);


        Alumno alumno1 = new Alumno();
        alumno1.setNombres("Franco");
        alumno1.setApellidos("Lozano");
        alumno1.setAsignaturas(asignaturas);
        List<Asignatura> listaAsignatura = alumno1.getAsignaturas();

        for (Asignatura asignatura : listaAsignatura){

            String resultado = asignatura.estaAprobado()? "Aprobado" : "Desaprobado";
            System.out.println("En el curso de : " + asignatura.getDescripcion() + " El alumno esta : " + resultado
                    + " Con la nota final : " + asignatura.getNotaDefinitiva());
        }


        Alumno alumno2 = new Alumno();
        alumno2.setNombres("Andrea");
        alumno2.setApellidos("Perez");
        asignatura1.setEvaluacionParcial(new EvaluacionParcial(10));
        List<EvaluacionPermanente> evaluacionPermanentes = new ArrayList<>();
        evaluacionPermanentes.add(new EvaluacionPermanente(8));
        evaluacionPermanentes.add(new EvaluacionPermanente(15));
        evaluacionPermanentes.add(new EvaluacionPermanente(16));
        evaluacionPermanentes.add(new EvaluacionPermanente(20));
        asignatura1.setEvaluacionPermanentes(evaluacionPermanentes);

        //System.out.println(String.format("Al alumno {} le falta {} para aprobar el curso de {}",
        //        alumno2.getNombres(), alumno2.?, alumno2.getAsignaturas().get(8).getDescripcion()));

        String nombres = "Franco lozano";
        int edad = 30;
        String profesion = "Desarrollador";
        boolean tieneLicenciaConducir = true;

        String mensaje =String.format("Nombres : %s , edad : %s , profesion: %s, Licencia de conducir : %s",
                nombres,edad,profesion,tieneLicenciaConducir?"Si":"No");

        System.out.println(mensaje);

    }
}
