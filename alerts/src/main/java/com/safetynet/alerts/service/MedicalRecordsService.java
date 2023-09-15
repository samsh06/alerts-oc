package com.safetynet.alerts.service;

import java.util.List;

import com.safetynet.alerts.model.MedicalRecords;
import com.safetynet.alerts.model.Person;

public interface MedicalRecordsService {

    List<String> getMedicationsFromPerson(Person person);

    List<String> getAllergiesFromPerson(Person person);

    boolean deleteMedicalRecords(MedicalRecords model);

    MedicalRecords updateMedicalRecords(MedicalRecords model);

    MedicalRecords saveMedicalRecords(MedicalRecords model);
}
