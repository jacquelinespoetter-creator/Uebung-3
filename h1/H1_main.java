package h1;

public class H1_main {

	public static void main(String[] args) {
		double guthaben = -100, monEingang = 200;

		int rating = -2;
		boolean warnhinweis = false;
		boolean negativ = false;
		final int START_RATING = rating;
		if (guthaben < 0) {

			negativ = true;
		}
		if (guthaben > 0) {

			rating = START_RATING + 3;
		}

		if (guthaben == 0) {

			rating = START_RATING + 2;
		}

			else if (guthaben < 0 && monEingang >= guthaben) {

				rating = START_RATING + 1;
			} 
			
			else if (guthaben < 0 && monEingang < guthaben) {
				
				rating = START_RATING - 1;
			}

			else if (guthaben < 0 && monEingang < guthaben && rating < 0) {

				warnhinweis = true;
			}
				else warnhinweis = false;		


		
		System.out.println("Finaler Zustand der Variablen:");
		System.out.println("==============================");
		System.out.println("guthaben: " + guthaben);
		System.out.println("monEingang: " + monEingang);
		System.out.println("rating (Startwert war: " + START_RATING + "): " + rating);
		System.out.println("negativ: " + negativ);
		System.out.println("warnhinweis: " + warnhinweis);
		
			}

	}
