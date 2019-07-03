/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.hitema.jpajaxrs.rest;

import fr.hitema.jpajaxrs.model.Bidule;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;


@Path("/bidule")
public class BiduleController {
        
    @PersistenceContext(unitName = "vide_PU",type = PersistenceContextType.TRANSACTION)
    EntityManager em;
    
    
    @POST
    @Path("/")
    @Transactional
    public void recupereFormulairePageIndex(@Context HttpServletRequest req){
        Bidule b = new Bidule();
        b.setTexte(  req.getParameter("texte") );
        em.persist(b);
    }
    
    @GET
    @Path("/")
    public String bidule(){
        return "YEPA";
    }
    
}
