package c422manyToManyJoinTable.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c422manyToManyJoinTable.model.Project422;

@Stateless
public class ProjectServiceBean422 implements ProjectService422 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Project422 createProject(String name) {
        Project422 proj = new Project422();
        proj.setName(name);
        em.persist(proj);
        
        return proj;
    }

    public Collection<Project422> findAllProjects() {
        Query query = em.createQuery("SELECT p FROM Project422 p");
        return (Collection<Project422>) query.getResultList();
    }
}
