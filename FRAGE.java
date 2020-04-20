
public class FRAGE implements DATENELEMENT
{
    
    public String frage;
    public int jahr;
    public String fach;
    public String antwort1;
    public String antwort2;
    public String antwort3;
    public String antwort4;

    public FRAGE(String frage_,String antwort1_, String antwort2_,String antwort3_,String antwort4_,int jahr_,String fach_) {
        antwort1=antwort1_;
        antwort2=antwort2_;
        antwort3=antwort3_;
        antwort4=antwort4_;
        fach=fach_;
        jahr=jahr_;
    }
    
    public void InformationAusgeben(){
        System.out.println(frage);
        System.out.println(antwort1);
        System.out.println(antwort2);
        System.out.println(antwort3);
        System.out.println(antwort4);
        System.out.println(fach);
        System.out.println(jahr);
    }

  

    public String FrageGeben(){
        return this.frage;
    }
}