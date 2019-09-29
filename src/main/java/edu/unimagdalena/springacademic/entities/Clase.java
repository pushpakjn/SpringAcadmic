package edu.unimagdalena.springacademic.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;

/**
 * Alumno
 */
@Entity
public class Clase implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "profesor")
  private Profesor profesor;

  @ManyToOne
  @JoinColumn(name = "asignatura")
  private Asignatura asignatura;

  @ManyToMany(mappedBy="clases")
  private Set<Alumno> alumnos;

  @ManyToMany
  @OrderBy("diaIndice, horaIndice")
  @JoinTable(name="CLASE_HORASEMANAL", joinColumns= @JoinColumn(name="id_clase", referencedColumnName="id"), inverseJoinColumns= @JoinColumn(name="id_horasemanal", referencedColumnName="id"))
  private Set<HoraSemanal> horasSemanales;
}