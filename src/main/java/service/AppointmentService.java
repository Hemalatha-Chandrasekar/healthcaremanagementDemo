package service;


import model.Appointment;
import model.Doctor;
import org.hibernate.Session;
import repository.AppointmentRepositoryImpl;

import java.util.List;

public class AppointmentService {
    private final AppointmentRepositoryImpl appointmentRepository;
    public AppointmentService(AppointmentRepositoryImpl appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }
    public void createAppointment(Appointment appointment) {
        appointmentRepository.createAppointment(appointment);
    }
    public Appointment getAppointmentById(int id) {
        return appointmentRepository.getAppointmentById(id);
    }
    public void updateAppointment(Appointment appointment) {
        appointmentRepository.updateAppointment(appointment);
    }
    public void deleteAppointmentById(int id) {
        appointmentRepository.deleteAppointmentById(id);
    }
    public List<Appointment> getAllAppointment() {
        return appointmentRepository.getAllAppointments();
    }

}