public class LISTE
{
    LISTENELEMENT anfang;

    public LISTE()
    {
        anfang = new ABSCHLUSS();
        PickerZuListe();
    }

    public void HintenEinfuegen(DATENELEMENT dNeu){
        anfang = anfang.HintenEinfuegen(dNeu);

    }

    public void PickerZuListe() 
    {
        for(int i =1;i<25;i++) {
            DATENELEMENT FragenObjekt =new FRAGE(DBConnection.marieDBConnGetFrage(i),DBConnection.marieDBConnGetAntwort(i,1),DBConnection.marieDBConnGetAntwort(i,2),DBConnection.marieDBConnGetAntwort(i,3),DBConnection.marieDBConnGetAntwort(i,4),DBConnection.marieDBConnGetJahr(i),DBConnection.marieDBConnGetFach(i));
            this.HintenEinfuegen(FragenObjekt);
        }
    }
}