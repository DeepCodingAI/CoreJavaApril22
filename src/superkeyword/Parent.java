package superkeyword;

public class Parent {
    public String height;
    public Parent(){}
    public Parent(String height){
        this.height = height;
        System.out.println("Family average heights: " + height);
    }
    public void showSkills(){
        System.out.println("Parents have atheletic skills");
    }
    public final void familyLastName(){
        System.out.println("Family last name is: bush");
    }
}
