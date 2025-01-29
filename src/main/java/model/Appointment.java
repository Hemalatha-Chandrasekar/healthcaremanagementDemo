package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AppointmentId")
    private int appointmentId;

    @Column(name = "PatientId")
    private int patientId;

    @Column(name = "DoctorId")
    private int doctorId;

    @Column(name = "AppointmentDate")
    private String appointmentDate;

    @Column(name = "Notes")
    private String notes;

    // Constructors
    public Appointment() {}

    public Appointment(int patientId, int doctorId, String appointmentDate, String notes) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.notes = notes;
    }

    // Getters and Setters
    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
