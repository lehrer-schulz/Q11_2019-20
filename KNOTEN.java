public class KNOTEN extends LISTENELEMENT
{
    DATENELEMENT daten;
    LISTENELEMENT nachfolger;

    public KNOTEN(DATENELEMENT daten_, LISTENELEMENT nachfolger_)
    {
        daten = daten_;
        nachfolger = nachfolger_;
    }

    public KNOTEN HintenEinfuegen(DATENELEMENT dNeu){
        nachfolger = nachfolger.HintenEinfuegen(dNeu);
        return this;
    }


    public LISTENELEMENT KnotenEntfernen(DATENELEMENT dVergleich){
        if(this.daten.equals(dVergleich)){
            return nachfolger;
        }
        else{
            nachfolger = nachfolger.KnotenEntfernen(dVergleich);
            return this;
        }
    }

    public DATENELEMENT EndeGeben(DATENELEMENT dAkt){
        return nachfolger.EndeGeben(daten);
    }

    public LISTENELEMENT EndeEntfernen(DATENELEMENT dEnde){
        if(this.daten.equals(dEnde)){
            return nachfolger;
        }
        else{
            nachfolger = nachfolger.KnotenEntfernen(dEnde);
            return this;
        }
    }

    public DATENELEMENT DatenelementGeben(){
        return daten;
    }

    public LISTENELEMENT NachfolgerGeben(){
        return nachfolger;
    }

    public void InformationAusgeben(){
        daten.InformationAusgeben();
        nachfolger.InformationAusgeben();
    }

    public int RestlaengeGeben(){
        return nachfolger.RestlaengeGeben()+1; 
    }
}