package service;

import model.Doctor;
import repository.DoctorRepositoryImpl;

import java.util.List;

public class DoctorService {
    private final DoctorRepositoryImpl doctorRepositoryImpl;
    public DoctorService(DoctorRepositoryImpl doctorRepositoryImpl) {
        this.doctorRepositoryImpl = doctorRepositoryImpl;
    }
    public void createDoctor(Doctor doctor) {
        doctorRepositoryImpl.createDoctor(doctor);
    }

    public Doctor getDoctorById(int id) {
        return doctorRepositoryImpl.getDoctorbyId(id);
    }
    public void updateDoctor(Doctor doctor) {
        doctorRepositoryImpl.updateDoctor(doctor);
    }
    public void deleteDoctorById(int id) {
        doctorRepositoryImpl.deleteDoctor(id);
    }
    public List<Doctor> getAllDoctors() {
        return doctorRepositoryImpl.getAllDoctors();
    }
}