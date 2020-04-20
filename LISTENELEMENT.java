public abstract class LISTENELEMENT
{
    public abstract KNOTEN HintenEinfuegen(DATENELEMENT dNeu);

    public abstract LISTENELEMENT KnotenEntfernen(DATENELEMENT dVergleich);

    public abstract DATENELEMENT EndeGeben(DATENELEMENT dAkt);

    public abstract LISTENELEMENT EndeEntfernen(DATENELEMENT dEnde);

    public abstract DATENELEMENT DatenelementGeben();

    public abstract LISTENELEMENT NachfolgerGeben();

    public abstract void InformationAusgeben();

    public abstract int RestlaengeGeben();
}
