import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityUtility {
    private static final EntityManagerFactory emf =  buildEntityFactory();

    private static EntityManagerFactory buildEntityFactory() {
        try{
            return Persistence.createEntityManagerFactory("PU");
        }catch (Exception e){
            throw e;
        }
    }

    public static EntityManagerFactory getEmf(){
        return emf;
    }

    public static void shutdown(){
        emf.close();
    }
}
