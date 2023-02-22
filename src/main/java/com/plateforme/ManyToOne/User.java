package com.plateforme.ManyToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
}
