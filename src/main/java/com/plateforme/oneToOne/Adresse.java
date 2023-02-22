package com.plateforme.oneToOne;

import com.plateforme.ManyToOne.User;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@NotBlank
private String ville,province;
@Size(max = 4,min = 4)
private int codepostale;

private String localisation;
@OneToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "userId",nullable = false)
private User user;
}
