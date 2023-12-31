package com.safetynet.alerts.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.safetynet.alerts.model.Person;
import com.safetynet.alerts.model.specific.ChildAlert;
import com.safetynet.alerts.model.specific.FullInfoPerson;

public interface PersonsService {

    ChildAlert getChildAlertFromAddress(String address);

    List<FullInfoPerson> getFullInfoByName(String firstName, String lastName);

    List<String> getEmailsFromCity(@RequestParam String city);

    Person savePerson(Person model);

    Person updatePerson(Person model);

    boolean deletePerson(Person model);

}
