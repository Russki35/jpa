/**
 * 
 */
package dev.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import fr.entite.Article;
import fr.entite.Commande;

/**
 * @author ETY8
 *
 */
public class TestJpa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("brico");
		EntityManager em = entityManagerFactory.createEntityManager();
		
//		Query query = em.createQuery("select a from Article where a.commande.id=id1 ");
		
//		 List<Article> rows = query.getResultList();
//		 for(Article article: rows){			 
//		 }
		 
			 
		 TypedQuery<Commande> query = em.createQuery("from Commande", Commande.class);
		 Commande com = query.getResultList().get(0);
		 
		 List<Article> articles = com.getArticles();
		 for (Article article: articles){
			 System.out.println(article);
		 }
		 
		 em.close();
		 entityManagerFactory.close();

	}
 
}
