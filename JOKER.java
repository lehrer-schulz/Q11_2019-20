
/**
 * Write a description of class SPIEL here.
 *
 * @author (Jonas Bartl)
 * @version (1.0)
 */
public class JOKER
{
    // instance variables - replace the example below with your own
    private int joker;

    /**
     * !!! Konstruktor setzt Joker-Anzahl auf 3 !!!
     */
    public JOKER()
    {
        joker = 3;
    }

    /**
     * Methode für den 50/50 Joker. Die Fragen bekommen eine Joker-Zahl j. 
     * Je nach dem welche Zahl sie hat sind dann die folgenden Antworten richtig. 
     * 
     * !!! Nur ein Entwurf und Idee, wird womöglich so nicht ganz funktionieren!!!
     * !!! Streicht falsche Antworten nicht weg sondern gibt nur einen Tipp    !!!
     * !!! Ändert nichts am GUI                                                !!! 
     */
    public void fiftyJoker()
    {
        if(joker >= 1)
        { 
            for(int j = 0; j<4; j++) 
            { if(j == 0) { 
                    System.out.println ( "A oder B");
                    joker = joker - 1;
                    break; 
                } 
                else{ if (j==2)
                    { 
                        System.out.println("A oder C");
                        joker = joker - 1 ;
                        break; 
                    }
                    else { if (j == 3)
                        { 
                            System.out.println("A oder D");
                            joker = joker - 1; 
                            break;
                        }
                        else { if (j == 4)
                            { 
                                System.out.println("B oder C");
                                joker = joker - 1;
                                break; 
                            }
                        }
                    }
                }

            }
        }
        else
        {
            System.out.println("Du hast keine Joker mehr übrig");
        }
    }
}
