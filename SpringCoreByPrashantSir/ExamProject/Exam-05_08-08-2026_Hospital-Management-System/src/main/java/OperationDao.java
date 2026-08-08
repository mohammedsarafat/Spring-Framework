package com.nit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("operation")
public class OperationDao {

    @Autowired
    private JdbcTemplate template;


    // =====================================================
    // SELECT
    // =====================================================

    private static final String SQL_QUERY_FOR_GETPATIENTBYID =
            "SELECT * FROM patients WHERE patient_id = ?";

    private static final String SQL_QUERY_FOR_GETALLPATIENT =
            "SELECT * FROM patients";


    // =====================================================
    // INSERT
    // =====================================================

    private static final String SQL_QUERY_FOR_INSERTPATIENT =
            "INSERT INTO patients " +
            "(patient_name, age, gender, disease, doctor_name, contact_number) " +
            "VALUES (?, ?, ?, ?, ?, ?)";


    // =====================================================
    // DELETE
    // =====================================================

    private static final String SQL_QUERY_FOR_DELETEPATIENT =
            "DELETE FROM patients WHERE patient_id = ?";


    // =====================================================
    // UPDATE
    // =====================================================

    private static final String SQL_QUERY_FOR_UPDATEPATIENT =
            "UPDATE patients SET " +
            "patient_name = ?, " +
            "age = ?, " +
            "gender = ?, " +
            "disease = ?, " +
            "doctor_name = ?, " +
            "contact_number = ? " +
            "WHERE patient_id = ?";


    // =====================================================
    // GET PATIENT BY ID
    // =====================================================

    public Patient getPatientById(int patientId) {

        return template.queryForObject(
                SQL_QUERY_FOR_GETPATIENTBYID,

                (rs, rowNum) -> {

                    Patient patient = new Patient();

                    patient.setPatientId(
                            rs.getInt("patient_id"));

                    patient.setPatientName(
                            rs.getString("patient_name"));

                    patient.setAge(
                            rs.getInt("age"));

                    patient.setGender(
                            rs.getString("gender"));

                    patient.setDisease(
                            rs.getString("disease"));

                    patient.setDoctorName(
                            rs.getString("doctor_name"));

                    patient.setContactNumber(
                            rs.getString("contact_number"));

                    return patient;
                },

                patientId
        );
    }


    // =====================================================
    // GET ALL PATIENTS
    // =====================================================

    public List<Patient> getAllPatient() {

        return template.query(
                SQL_QUERY_FOR_GETALLPATIENT,

                (rs, rowNum) -> {

                    Patient patient = new Patient();

                    patient.setPatientId(
                            rs.getInt("patient_id"));

                    patient.setPatientName(
                            rs.getString("patient_name"));

                    patient.setAge(
                            rs.getInt("age"));

                    patient.setGender(
                            rs.getString("gender"));

                    patient.setDisease(
                            rs.getString("disease"));

                    patient.setDoctorName(
                            rs.getString("doctor_name"));

                    patient.setContactNumber(
                            rs.getString("contact_number"));

                    return patient;
                }
        );
    }


    // =====================================================
    // INSERT PATIENT
    // =====================================================

    public int insertPatient(Patient patient) {

        return template.update(

                SQL_QUERY_FOR_INSERTPATIENT,

                patient.getPatientName(),
                patient.getAge(),
                patient.getGender(),
                patient.getDisease(),
                patient.getDoctorName(),
                patient.getContactNumber()
        );
    }


    // =====================================================
    // DELETE PATIENT
    // =====================================================

    public int deletePatient(int patientId) {

        return template.update(
                SQL_QUERY_FOR_DELETEPATIENT,
                patientId
        );
    }


    // =====================================================
    // UPDATE PATIENT
    // =====================================================

    public int updatePatient(
            int patientId,
            Patient patient) {

        return template.update(

                SQL_QUERY_FOR_UPDATEPATIENT,

                patient.getPatientName(),
                patient.getAge(),
                patient.getGender(),
                patient.getDisease(),
                patient.getDoctorName(),
                patient.getContactNumber(),
                patientId
        );
    }
}
