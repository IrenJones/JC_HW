package HackerRank;

public class StudentDay12 extends PersonDay12{
	private int[] testScores;

	   public StudentDay12(String firstName, String lastName, int id, int[]scores){
	        super(firstName,lastName,id);
	        testScores = scores;
	    }
	    
	    /*	
	    *   Method Name: Calculate
	    *   Return: A character denoting the grade.
	    */
	    public char calculate (){
	        int sum = 0;
	        char answer = 'T';
	        for(int i=0; i< testScores.length ; i++){
	            sum+=testScores[i];
	        }
	        double res = sum/testScores.length;
	        if (res>=40 && res<55){
	            answer = 'D';
	        }
	        else if(res>=55 && res<70){
	            answer = 'P';
	        }
	        else if(res>=70 && res<80){
	            answer = 'A';
	        }
	        else if(res>=80 && res<90){
	            answer = 'E';
	        }
	        else if(res>=90 && res<=100){
	            answer = 'O';
	        }
	        return answer;
	    }
}
