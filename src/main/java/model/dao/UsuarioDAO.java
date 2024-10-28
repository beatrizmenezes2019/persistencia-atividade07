package model.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.domain.Usuario;

public class UsuarioDAO {
	
	public static void main(String[] args) {
		Usuario usuario = new Usuario("teste", new Date(), "Feminino", "teste", 1, "teste", "Goiania", "Goias");
		//gravarUsuario(usuario);
		
		listarUsuarios();
		
		System.out.println("Gravado!");
	}
	

	public static void gravarUsuario(Usuario usuario) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("vacinacao");
		EntityManager em = fabrica.createEntityManager();
				
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();
		fabrica.close();
		
		
	}
	
	public static void listarUsuarios() {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("vacinacao");
		EntityManager em = fabrica.createEntityManager();
				
		
		Usuario usuario = em.find(Usuario.class, 1);
		
		System.out.println(usuario.getNome());
		
		em.close();
		fabrica.close();
		
	}
	
}
