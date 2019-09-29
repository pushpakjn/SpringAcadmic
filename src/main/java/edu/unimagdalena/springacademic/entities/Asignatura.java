package edu.unimagdalena.springacademic.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Asignatura
 */
@Entity
@Table(name = "ASIGNATURAS")
@NoArgsConstructor
@Getter
@Setter
public class Asignatura implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "nombre", length = 50, nullable = false)
  private String nombre;

  @ManyToOne
  @JoinColumn(name = "curso")
  private Curso curso;

  @OneToMany(mappedBy = "asignatura")
  @NonNull
  private Set<Clase> clases;
}