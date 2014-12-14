package c421manyToManyBidirectional.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c421manyToManyBidirectional.model.Project421;

@Stateless
public class ProjectServiceBean421 implements ProjectService421 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Project421 createProject(String name) {
        Project421 proj = new Project421();
        proj.setName(name);
        em.persist(proj);
        
        return proj;
    }

    public Collection<Project421> findAllProjects() {
        Query query = em.createQuery("SELECT p FROM Project421 p");
        return (Collection<Project421>) query.getResultList();
    }
}
