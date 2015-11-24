package org.ema.ProjetJsfEma;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.ema.ProjetJsfEma.Glasses;




@Named
@Stateless
public class GlassesS {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Glasses> getGlasses() {
		return entityManager.createQuery("FROM Glasses", Glasses.class).getResultList();
	}
	
	public void newGlasses() {
		Glasses glasses = new Glasses();
		glasses.setBrand("Ray-ban");
		glasses.setColor("Marron");
		entityManager.persist(glasses);
	}

}
