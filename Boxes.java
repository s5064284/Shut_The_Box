
public class Boxes {

	int [] boxes = {1,2,3,4,5,6,7,8,9};

	/*
	 * Method displays current open boxes
	 */
	
	public void getBox()
	{
		for (int i=0; i<boxes.length; i++) {				
			System.out.print(boxes[i]+" ");		
		}
	}

	/*
	 * Method sets box based on user selection
	 */
	
	public void setBox(int num1, int num2)
	{
		for (int i=0; i<boxes.length; i++) {
			if((num1 == boxes[i]) || (num2 == boxes[i])) {
				boxes[i] = 0;
			}
		}
	}

	/*
	 * Method checks if all boxes have been shut for a win
	 */
	
	public int checkWin()
	{
		int count =0;
		for (int i=0; i<boxes.length; i++) {
			if (boxes[i] == 0) {
				count++;
			}
		}
		return count;

	}


}