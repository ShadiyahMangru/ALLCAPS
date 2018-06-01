package ALLCAPS;
import java.util.*;
public class SortStats{

	public static void sortByAField(int seasonStartYr, ArrayList<PlayerStats> sortedArray, ArrayList<PlayerStats> toSort, int sortByThis){
		for(int i=0; i<toSort.size();i++){
			if(toSort.get(i).getSeasonStartYr()==seasonStartYr){
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
		}
		//'reverse' print to output highest to lowest
		for(int j = sortedArray.size()-1 ; j >=0 ; j--){
			System.out.println(sortedArray.get(j).formatInfoRegSeason(seasonStartYr));	
		}
	}

}