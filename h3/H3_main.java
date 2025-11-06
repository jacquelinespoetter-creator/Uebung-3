package h3;

public class H3_main {

	public static void main(String[] args) {

		int max = 5;
		int fix = 2;
		int wartend = 2;
		boolean istVoll = false;

		int freiePlaetze = max - fix;

		if (freiePlaetze > 0 && wartend > 0) {
			int nachruecker = Math.min(freiePlaetze, wartend);
			fix = fix + nachruecker;
			wartend = wartend - nachruecker;
		}

		istVoll = (fix == max);

		System.out.println("fix: " + fix);
		System.out.println("wartend: " + wartend);
		System.out.println("istVoll: " + istVoll);
	}

}
