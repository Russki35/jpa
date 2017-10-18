/**
 * 
 */
package fr.entite;

import dev.jpa.*;

import java.util.List;

import javax.persistence.*;
/**
 * @author ETY8
 *
 */
@Entity
@Table(name="article")
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="ref")
	private String ref;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="prix")
	private double prix;
	
	@ManyToOne
	@JoinColumn(name="id_fou")
	private Fournisseur fournisseur;
	

	
	public Article(){
		
	}
	

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}





	@Override
	public String toString() {
		return "Article [id=" + id + ", ref=" + ref + ", designation=" + designation + ", prix=" + prix
				+ ", fournisseur=" + fournisseur + "]";
	}
	
	
	

}
