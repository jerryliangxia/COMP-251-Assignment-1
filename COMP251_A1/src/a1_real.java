import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class a1_real {
	
	
	public static int silence(int[] positions) {

        HashMap<Integer, Integer> indices = new HashMap<>(); 
        int[] nums = new int[positions.length];
        int count = 0;

        for(int i = 0; i < positions.length; i++) { 
            if(indices.get(positions[i])!=null) { // if there is already an entry there
  
            	// get old index for comparison
                int oldIndex = indices.get(positions[i]); 
  
                nums[count] = i - oldIndex;
                count++; 
            } 
            indices.put(positions[i], i); // insert into the map with index
        } 
        
        if(count == 0) return positions.length;	// if no match, then return length
        else {	// otherwise, loop through array until you find the smallest value
        	int returned = nums[count-1];
        	for(int i = count-1; i > 0; i--) {
        		if(returned > nums[i-1]) returned = nums[i-1];
        	}
        	return returned;
        }
	}
	

	public static void main(String[] args) {
		try {
			String path = args[0];
      		File myFile = new File(path);
      		Scanner sc = new Scanner(myFile);
      		int num_students = sc.nextInt();
      		int[] positions = new int[num_students];
      		for (int student = 0; student<num_students; student++){
				positions[student] =sc.nextInt();
      		}
      		sc.close();
      		int answer = silence(positions);
      		System.out.println(answer);
    	} catch (FileNotFoundException e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
    	}
  	}		
}