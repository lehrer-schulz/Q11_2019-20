
/**
 * Beschreiben Sie hier die Klasse ABSCHLUSS.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ABSCHLUSS extends LISTENELEMENT
{

    public ABSCHLUSS(){

    }

    public KNOTEN HintenEinfuegen(DATENELEMENT dNeu){
        return new KNOTEN(dNeu, this);
    }

    public KNOTEN EinfuegenVor(DATENELEMENT dNeu, DATENELEMENT dVergleich){
        return new KNOTEN(dNeu, this);
    }

    public KNOTEN SortiertEinfuegen(DATENELEMENT dNeu){
        return new KNOTEN(dNeu, this);
    }

    public LISTENELEMENT KnotenEntfernen(DATENELEMENT dVergleich){
        return this;
    }

    public DATENELEMENT EndeGeben(DATENELEMENT dAkt){
        return dAkt;
    }

    public LISTENELEMENT EndeEntfernen(DATENELEMENT dEnde){
        return this;
    }

    public DATENELEMENT DatenelementGeben(){
        return null;
    }

    public LISTENELEMENT NachfolgerGeben(){
        return this;
    }

    public DATENELEMENT Suchen(String schluessel){
        return null;
    }

    public void InformationAusgeben(){

    }

    public int RestlaengeGeben(){
        return 0;
    }
}
