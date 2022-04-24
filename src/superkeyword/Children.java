package superkeyword;

public class Children extends Parent{
    public String height;
    public Children(){}
    public Children(String height){
        super(height);
    }
    public void extraActivities(){
        super.showSkills();
    }
}
