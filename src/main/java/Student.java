import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Access(AccessType.FIELD)
@Entity
@NamedQuery(
        name = "Student.getAll",
        query = "SELECT s FROM Student s"
)
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int stdId;
    private  String name;
    private String  gmail;

    @Embedded
    private  Marks marks;



    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                ", marks=" + marks +
                '}';
    }
}
