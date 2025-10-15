import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.List;

public class Manager {
    static EntityManager em = EntityUtility.getEmf().createEntityManager();
    static EntityTransaction trans = em.getTransaction();
    public  static boolean addStudent(Student s , Marks m){
        s.setMarks(m);

        try {
            trans.begin();

            em.persist(s);
            trans.commit();
            return true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Student studentDetails(int id){
       return em.find(Student.class , id);

    }

    public static List studentsData(){
        Query q = em.createNamedQuery("Student.getAll" , Student.class);
        return q.getResultList();
    }

    public  static  boolean updateName(int id , String name){
        trans.begin();

        try{
            Student s = em.find(Student.class ,id);
            s.setName(name);
            trans.commit();
            return  true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public  static  boolean updateGmail(int id , String gmail){
        trans.begin();

        try{
            Student s = em.find(Student.class ,id);
            s.setGmail(gmail);
            trans.commit();
            return  true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean delete(int id){
        try{
            trans.begin();
            Student s = em.find(Student.class ,id);
            em.remove(s);
            trans.commit();
           return  true;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }



}
