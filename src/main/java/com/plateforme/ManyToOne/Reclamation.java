package com.plateforme.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Reclamation {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@NotBlank
private String titre;
@Lob
private String text;
@ManyToOne(fetch = FetchType.LAZY,optional = true)
@JoinColumn(name = "userId",nullable = true)
@OnDelete(action = OnDeleteAction.NO_ACTION)
private User user;


}
