package ALLCAPS;
import java.util.*;

/**
* The SortStats class contains a method to sort each Washington Capitals' 
* games played / goals / assists / points statistics during a given season.
* 
* @author  Shadiyah Mangru
* @version 1.0
* @since   June 2018
*/

public class SortStats{

	/**
	* Sorts the player statistics for a given season by either games played/goals/assists/points.
	* Upon method completion, the sorted stats are printed in descending order.
	* @param sortedArray the arraylist that will contain the sorted statistics, upon method completion
	* @param toSort the arraylist of unsorted statistics
	* @param sortByThis choose 1/2/3/4 to sort by games played/goals/assists/points, respectively
	*/
	public static void sortByAField(ArrayList<ArrayList<Object>> sortedArray, ArrayList<ArrayList<Object>> toSort, int sortByThis){
		for(int i=0; i<toSort.size();i++){
			if(sortedArray.size()!=0){
				for(int k=0; k<sortedArray.size();k++){
					if((Integer)toSort.get(i).get(sortByThis) < (Integer)sortedArray.get(0).get(sortByThis)){
						sortedArray.add(0, toSort.get(i));
						k=sortedArray.size();
					}
					else if( ((Integer)toSort.get(i).get(sortByThis) >= (Integer)sortedArray.get(k).get(sortByThis) & k+1 >=sortedArray.size() )	|| 
						((Integer)toSort.get(i).get(sortByThis) >= (Integer)sortedArray.get(k).get(sortByThis) & (Integer)toSort.get(i).get(sortByThis) <= (Integer)sortedArray.get(k+1).get(sortByThis))){
						sortedArray.add(k+1, toSort.get(i));
						k=sortedArray.size(); 
					}
				}
			}
			else{
				sortedArray.add(toSort.get(i));	
			}	
		}
		//'reverse' print to output highest to lowest
		String sortType = "";
		switch(sortByThis){
		case 1: sortType = "Games Played";
			break;
		case 2: sortType = "Goals";
			break;
		case 3: sortType = "Assists";
			break;
		case 4: sortType = "Points";
			break;	
		}
		System.out.println("\n***  " + sortedArray.get(0).get(5) + "-" + ((Integer)(sortedArray.get(0).get(5))+1) + " Washington Capitals Roster Ranked by " + sortType + "  ***\n");		
		for(int i = sortedArray.size()-1; i>0 ; i--){
			Player plyInfo = (Player)sortedArray.get(i).get(0);
				System.out.println(plyInfo.getFirstName() + " " + plyInfo.getLastName() + "| #" + plyInfo.getJerseyNumber() + " | " + plyInfo.getPosition());
				System.out.println("Games Played: " + sortedArray.get(i).get(1));
				System.out.println("Goals: " + sortedArray.get(i).get(2));
				System.out.println("Assists: " + sortedArray.get(i).get(3));
				System.out.println("Points: " + sortedArray.get(i).get(4) + "\n");
		}	
			
	}
}
