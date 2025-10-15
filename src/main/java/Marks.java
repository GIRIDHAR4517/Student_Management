import jakarta.persistence.Embeddable;

@Embeddable
public class Marks {
    private int maths , social , science , english;

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void marksSetter(int maths, int science, int social, int english) {
        this.maths = maths;
        this.science = science;
        this.social = social;
        this.english = english;
    }

    @Override
    public String toString() {
        return "{" +
                "maths=" + maths +
                ", social=" + social +
                ", science=" + science +
                ", english=" + english +
                '}';
    }
}
