package fr.idm.Racing;

import java.util.SortedMap;
import java.util.TreeMap;

public class RaceResults {

	private SortedMap<Integer, String> results = new TreeMap<Integer, String>();
	
	public void onNewResult(String tagNumber,TimeDuration resultTime){
		results.put(resultTime.getDuration(), tagNumber);
	}
	public void printResults() throws BadValueException{
		for(Integer key: results.keySet())
		{
			System.out.print(results.get(key)); 
			System.out.print(" arrivé en : ");
			System.out.println(new TimeDuration(key));
		}
	}
	public static void main(String[] args){
		RaceResults raceResults = new RaceResults();
		try {
			raceResults.onNewResult("first", new TimeDuration(300));
			raceResults.onNewResult("third", new TimeDuration(150));
			raceResults.onNewResult("second", new TimeDuration(200));
			raceResults.onNewResult("forth", new TimeDuration(7242));
			raceResults.printResults();
		} catch (BadValueException e) {
			e.printStackTrace();
			System.out.println("Une mauvaise duree a été enregistée");
		}
	}
}
