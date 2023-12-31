package com.safetynet.alerts.service;

import java.util.List;

import com.safetynet.alerts.model.Firestations;
import com.safetynet.alerts.model.specific.FireMedicalRecord;
import com.safetynet.alerts.model.specific.FirestationsZone;
import com.safetynet.alerts.model.specific.InfoByStation;



public interface FireStationsService {

    FirestationsZone getFirestationZone(int firestationNumber);

    List<String> getPhoneAlertFromFirestations(int firestation);

    List<Integer> getStationByAddress(String address);

    FireMedicalRecord getPersonInfosByAddressIfFire(String address);

    List<InfoByStation> getPersonInfoByStationsList(List<Integer> stations);

    Firestations saveFirestation(Firestations model);

    boolean deleteFirestation(Firestations model);
}