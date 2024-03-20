/***
Consider a grading scheme where your final grade is computed more generously
if your grades show improvement over the term.  Scores show improvement
if each grade is greater than or equal to the previous grade.

A student has x scores indexed from 0 to x-1.  If the scores have shown improvement
only those grades with indexes greater than to equal to x/2 are averaged.  If the
scores have not improved, all of the scores are averaged.
***/

public class GradeAverage {
    private int [] scores;
	public GradeAverage(int [] s)
	{
		scores = s;

	}
	// returns the mean (average) of the values in the scores array
	// whose indexes are between first and last (including first and last).  
	//You may assume that first and last are >= 0 and < scores.length
	private double mean(int first, int last){
		//avg=add all numbers then divide by total amount of number added 
		double ts = 0.0;
		for(int i = first; i <= last; i++){
			ts += scores[i];
		}
		double avg = ts/(last-first+1); 
		return avg;  
	}
	
	// returns true if each successive value in scores is greater than
	// or equal to the previous value.  Otherwise returns false
	private boolean showsImprovement(){ 
		for(int i = 1; i < scores.length; i++)
			if(scores[i] < scores[i-1]){
				return false;
		}
		   return true;
	}
	// if the values in the scores array show improvement, returns the average of the elements in scores with indexes greater than or equal to scores.length()/2
	// You must call mean() and showsImprovement() in your code.
	public double finalGrade()
	{
		if(showsImprovement()){ //showsimpro. returns true so you don't have to compare to true 
			return mean(scores.length/2, scores.length-1);
		}
	return mean(0,scores.length-1);   
	}
    public static void main(String[] args) {
		int [] s1 = {50,50,20,80,53};   // not improved, finalGrade is 50.6
		int [] s2 = {20,50,50,53,80};   // improved, final grade is 61.0
		int [] s3 = {20,50,50,85};      // improved, final grade is 67.5
		int [] s4 = {35, 50, 45, 60,62};  // not improved, finalGrade is 50.4
		int [] s5 = {47, 58, 58, 66, 87, 90,90,90};  // improved, final grade is 89.25
		
		GradeAverage sr1 = new GradeAverage(s1);
		System.out.println(sr1.mean(1,3)); //50
		System.out.println(sr1.showsImprovement()); //false
		System.out.println(sr1.finalGrade());
		GradeAverage sr2 = new GradeAverage(s2);
		System.out.println(sr2.mean(2,4)); //61
		System.out.println(sr2.showsImprovement()); //true
		System.out.println(sr2.finalGrade());
		GradeAverage sr3 = new GradeAverage(s3);
		System.out.println(sr3.mean(0,2)); //40
		System.out.println(sr3.showsImprovement()); //true
		System.out.println(sr3.finalGrade());
		GradeAverage sr4 = new GradeAverage(s4);
		System.out.println(sr4.showsImprovement()); //false
		System.out.println(sr4.finalGrade());
		GradeAverage sr5 = new GradeAverage(s5);
		System.out.println(sr5.showsImprovement()); //true
		System.out.println(sr5.finalGrade());		
	}

}