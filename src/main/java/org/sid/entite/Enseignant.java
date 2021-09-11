package org.sid.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name="enseignant")
public class Enseignant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String motDePasse;
	private String numTel;
	private String empreinte ="nonEnregistrer";
	/*
	 * @OneToMany (mappedBy = "enseignant") private Collection<TableAccee>
	 * tableAccee;
	 */}