package devandroid.rosaneto.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.rosaneto.applistacurso.model.Curso;

public class CursoController {

    private List listCursos;
    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("Java")); //Java
        listCursos.add(new Curso("HTML")); //HTML
        listCursos.add(new Curso("C#")); //C#
        listCursos.add(new Curso("Python")); //Python
        listCursos.add(new Curso("Kotlin")); //Kotlin
        listCursos.add(new Curso("SQL")); //SQL

        return listCursos;
    }
;}
