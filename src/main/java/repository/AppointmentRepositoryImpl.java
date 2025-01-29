package repository;
import model.Appointment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class AppointmentRepositoryImpl {
private SessionFactory sessionFactory;

    public AppointmentRepositoryImpl(SessionFactory sessionFactory) {
    }

    public void AppointmentRepositoryImpl(Appointment appointment) {
        this.sessionFactory=sessionFactory;
    }
    public void createAppointment(Appointment appointment) {
        try (Session session=sessionFactory.openSession()) {
            Transaction transaction=session.beginTransaction();
            session.save(appointment);
            transaction.commit();
        }

    }
    public Appointment getAppointmentById(int id) {
        try (Session session=sessionFactory.openSession()) {
            return session.get(Appointment.class, id);

        }
    }
    public void updateAppointment(Appointment appointment) {
        try (Session session=sessionFactory.openSession()) {
            Transaction transaction=session.beginTransaction();
            session.update(appointment);
            transaction.commit();
        }
    }
    public void deleteAppointmentById(int id) {
        try (Session session=sessionFactory.openSession()) {
            Transaction transaction=session.beginTransaction();
            Appointment appointment=session.get(Appointment.class, id);
            if(appointment!=null) {
                session.delete(appointment);
            }
            transaction.commit();
        }

    }
    //listing all Appointment
    public List<Appointment> getAllAppointments() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Appointment",Appointment.class).list();
        }
    }

}
