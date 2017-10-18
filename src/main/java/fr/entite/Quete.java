/**
 * 
 */
package fr.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ETY8
 *
 */

@Entity
@Table(name = "Quete")
public class Quete {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="delai")
	private String delai;
	
	@Column(name="debutCoordX")
	private int debutCoordX;
	
	@Column(name="debutCoordY")
	private int debutCoordY;

	public Quete (){

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDelai() {
		return delai;
	}

	public void setDelai(String delai) {
		this.delai = delai;
	}

	public int getDebutCoordX() {
		return debutCoordX;
	}

	public void setDebutCoordX(int debutCoordX) {
		this.debutCoordX = debutCoordX;
	}

	public int getDebutCoordY() {
		return debutCoordY;
	}

	public void setDebutCoordY(int debutCoordY) {
		this.debutCoordY = debutCoordY;
	}
	
	
}
