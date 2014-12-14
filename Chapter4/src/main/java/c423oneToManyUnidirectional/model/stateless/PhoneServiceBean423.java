package c423oneToManyUnidirectional.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c423oneToManyUnidirectional.model.Phone423;

@Stateless
public class PhoneServiceBean423 implements PhoneService423 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Phone423 createPhone(String num, String type) {
        Phone423 phone = new Phone423();
        phone.setNumber(num);
        phone.setType(type);
        em.persist(phone);
        
        return phone;
    }

    public Collection<Phone423> findAllPhones() {
        Query query = em.createQuery("SELECT p FROM Phone423 p");
        return (Collection<Phone423>) query.getResultList();
    }
}
