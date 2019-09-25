package edu.unimagdalena.springacademic.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Hora_Semanal
 */
@Entity
@Table(name = "HORAS_SEMANALES")
@NoArgsConstructor
@Getter
@Setter
public class Hora_Semanal {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "dia", length = 10, nullable = false)
  private String dia;
  @Column(name = "hora", length = 13, nullable = false)
  private String hora;
  @Column(name = "dia_indice", nullable = false) 
  private Integer diaIndice;
  @Column(name = "hora_indice", nullable = false) 
  private Integer horaIndice;

}