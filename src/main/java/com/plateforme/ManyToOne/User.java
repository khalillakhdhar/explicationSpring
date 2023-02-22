package com.plateforme.ManyToOne;

import com.plateforme.oneToOne.Adresse;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class User {
@Id
private int id;

@NotBlank
@Column(nullable = false)
private String nom,prenom;
@Email
private String email;
@OneToOne(fetch = FetchType.EAGER,
cascade = CascadeType.ALL,
mappedBy = "user")
// OneToOne partout (ici [dominant] on écrit le cascade fetch et mappedBy)
private Adresse adresse;
}
