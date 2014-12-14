package c423oneToManyUnidirectional.model.stateless;

import java.util.Collection;

import c423oneToManyUnidirectional.model.Phone423;

public interface PhoneService423 {
    public Phone423 createPhone(String num, String type);
    public Collection<Phone423> findAllPhones();
}
