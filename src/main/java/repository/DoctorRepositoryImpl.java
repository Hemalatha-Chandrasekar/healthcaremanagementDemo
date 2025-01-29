package repository;
import model.Appointment;
import model.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class DoctorRepositoryImpl {
    private SessionFactory sessionFactory;

    public DoctorRepositoryImpl(SessionFactory sessionFactory) {
    }

    public void DoctorRepositoryImpl(Appointment appointment) {
        this.sessionFactory=sessionFactory;
    }
    public void createDoctor(Doctor Doctor) {
        try (Session session=sessionFactory.openSession()) {
            Transaction transaction=session.beginTransaction();
            session.save(Doctor);
            transaction.commit();
        }

    }
    public Doctor getDoctorbyId(int id) {
        try (Session session=sessionFactory.openSession()) {
            return session.get(Doctor.class, id);

        }
    }
    public void updateDoctor(Doctor Doctor) {
        try (Session session=sessionFactory.openSession()) {
            Transaction transaction=session.beginTransaction();
            session.update(Doctor);
            transaction.commit();
        }
    }
    public void deleteDoctor(int id) {
        try (Session session=sessionFactory.openSession()) {
            Transaction transaction=session.beginTransaction();
            Appointment appointment=session.get(Appointment.class, id);
            if(appointment!=null) {
                session.delete(appointment);
            }
            transaction.commit();
        }
    }
    public List<Doctor> getAllDoctors() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Doctor", Doctor.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
