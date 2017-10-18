/**
 * 
 */
package fr.entite;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author ETY8
 *
 */
@Entity
@Table(name = "commande")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "numero")
	private int numero;

	@Transient
	private LocalDate date;

	@Column(name = "delai")
	private int delai;

	@ManyToMany
	@JoinTable(name = "compo", 
		joinColumns = @JoinColumn(name = "ID_CMDE", referencedColumnName = "ID"), 
		inverseJoinColumns = @JoinColumn(name = "ID_ART", referencedColumnName = "ID")

	)
	private List<Article> articles;
	
	@ManyToOne
	@JoinColumn(name="id_fou")
	private Fournisseur fournisseur;

	public Commande() {

	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", numero=" + numero + ", date=" + date + ", delai=" + delai
				+ ", articles=" + articles + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

}
