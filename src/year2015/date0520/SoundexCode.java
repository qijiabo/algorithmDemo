package year2015.date0520;

public class SoundexCode {

	public static void main(String[] args) {
		
	}

	private int getSoundexCode(String inStr){
		if(inStr==null||"".equals(inStr)){
			return 0;
		}
		/**
		 * 1 represents B, F, P, or V
			2 represents C, G, J, K, Q, S, X, or Z
			3 represents D or T
			4 represents L
			5 represents M or N
			6 represents R
		 */
		String[] scArr={"B", "F", "P", "V","C","G","J","K","Q","S","X","Z","D","T","L","M","N","R"};
		int scInt=99;
		for(int i=0;i<scArr.length;i++){
			if(inStr.equals(scArr[i])){
				scInt=i;
				break;
			}
		}
		if(scInt>=0&&scInt<=3){
			scInt=1;
		}else if(scInt>3&&scInt<=11){
			scInt=2;
		}else if(scInt>11&&scInt<=13){
			scInt=3;
		}else if(scInt>13&&scInt<=14){
			scInt=4;
		}else if(scInt>14&&scInt<=16){
			scInt=5;
		}else if(scInt>16&&scInt<=17){
			scInt=6;
		}else if(scInt==99){
			scInt=0;
		}
		return scInt;
	}
}
