package Jean_Garry_java_devoir#2;

public class Jean_Garry_java_devoir#2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Devoir #2 de JEAN Garry
		
		
double montant = 285000; // montant cible
double taxe = 0.15; // taux taxe
double economieparjour = 2500; // economie par jours
double montant_total = montant + montant*taxe; // montant plus taxe
double economie_totale = 0; // initialisation du montant a economiser
int jours = 0; // initialisation du nombre de jours


while(economie_totale < montant_total ) {

jours++;

int joursdesemaine = jours  % 7;
if(joursdesemaine !=5 || joursdesemaine !=7 ) {
	economie_totale += economieparjour;
    }
else {economie_totale = economie_totale;}
}

System.out.println("le nombre de jours necessaires pour economiser " +montant_total+ " est: "+jours);


 

	}

}
