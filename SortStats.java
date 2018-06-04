package ALLCAPS;
import java.util.*;

/**
* The SortStats class contains a method to sort each Washington Capitals' 
* games played / goals / assists / pionts statistics during a given season.
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
	* @param sortByThis choose 0/1/2/3 to sort by games played/goals/assists/points, respectively
	*/
	public static void sortByAField(ArrayList<PlayerStats> sortedArray, ArrayList<PlayerStats> toSort, int sortByThis){
		for(int i=0; i<toSort.size();i++){
			if(sortedArray.size()!=0){
				for(int k=0; k<sortedArray.size();k++){
					switch(sortByThis){
					case 0:
						if(toSort.get(i).getGamesPlayed() < sortedArray.get(0).getGamesPlayed()){
							sortedArray.add(0, toSort.get(i));
							k=sortedArray.size();
						}
						else if( (toSort.get(i).getGamesPlayed() >= sortedArray.get(k).getGamesPlayed() & k+1 >=sortedArray.size() )	|| 
							(toSort.get(i).getGamesPlayed() >= sortedArray.get(k).getGamesPlayed() & toSort.get(i).getGamesPlayed() <= sortedArray.get(k+1).getGamesPlayed())){
							sortedArray.add(k+1, toSort.get(i));
							k=sortedArray.size(); 
						}
						break;
					case 1:
						if(toSort.get(i).getGoals() < sortedArray.get(0).getGoals()){
							sortedArray.add(0, toSort.get(i));
							k=sortedArray.size();
						}
						else if( (toSort.get(i).getGoals() >= sortedArray.get(k).getGoals() & k+1 >=sortedArray.size() ) || 
							(toSort.get(i).getGoals() >= sortedArray.get(k).getGoals() & toSort.get(i).getGoals() <= sortedArray.get(k+1).getGoals())){
							sortedArray.add(k+1, toSort.get(i));
							k=sortedArray.size(); 
						}	
						break;
					case 2:
						if(toSort.get(i).getAssists() < sortedArray.get(0).getAssists()){
							sortedArray.add(0, toSort.get(i));
							k=sortedArray.size();
						}	
						else if( (toSort.get(i).getAssists() >= sortedArray.get(k).getAssists() & k+1 >=sortedArray.size() )	|| 
							(toSort.get(i).getAssists() >= sortedArray.get(k).getAssists() & toSort.get(i).getAssists() <= sortedArray.get(k+1).getAssists())){
							sortedArray.add(k+1, toSort.get(i));
							k=sortedArray.size(); 
						}	
						break;
					case 3:
						if(toSort.get(i).getPoints() < sortedArray.get(0).getPoints()){
							sortedArray.add(0, toSort.get(i));
							k=sortedArray.size();
						}
						else if( (toSort.get(i).getPoints() >= sortedArray.get(k).getPoints() & k+1 >=sortedArray.size() ) || 
							(toSort.get(i).getPoints() >= sortedArray.get(k).getPoints() & toSort.get(i).getPoints() <= sortedArray.get(k+1).getPoints())){
							sortedArray.add(k+1, toSort.get(i));
							k=sortedArray.size(); 
						}	
						break;
					}
				}
			}
			else{
				sortedArray.add(toSort.get(i));	
			}	
		}
		//'reverse' print to output highest to lowest
		for(int j = sortedArray.size()-1 ; j >=0 ; j--){
			System.out.println(sortedArray.get(j).formatInfoRegSeason());	
		}
	}

}