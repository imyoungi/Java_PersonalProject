package DatabaseConnVer;

import SimpleVer.SerieAinfo;

public class Test {

	public static void main(String[] args) {
		SerieAinfo seie = new SerieAinfo();
		
		System.out.println(seie.bestplayer.length);
		System.out.println(seie.Coach.length);

		System.out.println(seie.Hometown.length);

		for(int i=0;i<seie.Teams.length;i++) {
			System.out.println(seie.Teams[i]);
		}
		
		System.out.println(seie.PreviousRank.length);

		

	}

}
