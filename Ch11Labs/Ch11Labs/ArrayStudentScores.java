package Ch11Labs;

public class ArrayStudentScores {

	public static void main(String[] args) {
  
			int score [] = new int [4];
	        float average;

	        score[0] = 97;
	        score[1] = 85;
	        score[2] = 88;
	        score[3] = 91;

	        average = (score[0] + score[1] + score[2]+ score[3]) / 4;

	        System.out.println("Score 1 was: " + score[0]);
	        System.out.println("Score 2 was: " + score[1]);
	        System.out.println("Score 3 was: " + score[2]);
	        System.out.println("Score 4 was: " + score[3]);

	        System.out.print("The average of the student's test scores was: ");
	        System.out.println(average);
	    }
	}

