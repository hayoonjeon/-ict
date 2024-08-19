package team4_1;

public class Baseball03 {
	
	private int genNum[] ; 
	private int guessNum[] ; 
	private int strikeNum = 0;
	private int ballNum = 0;
	private int outNum ;
    
    public Baseball03(int[] k1,int[] k2) {
    	this.genVsGuess(k1, k2);
    }

    public void genVsGuess(int[] k1, int[] k2) {
    	for (int i = 0; i < k1.length; i++) {
    		for (int j = 0; j < k2.length; j++) {
    			if (k1[i] == k2[j]) {
    				if (i == j) {
    					strikeNum++;
    				} else if (i != j) {
    					ballNum++;
    				}
    			}
    		}
    	}
    	outNum = 3 - (strikeNum + ballNum);
    	
    }
    
    
	public int getStrikeNum() {
		return strikeNum;
	}

	public int getBallNum() {
		return ballNum;
	}

	public int getOutNum() {
		return outNum;
	}

}
