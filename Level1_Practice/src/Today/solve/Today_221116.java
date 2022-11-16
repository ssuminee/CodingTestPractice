package Today.solve;

public class Today_221116 {
	public int solution(int[][] dots) {
        int answer = 0;
        int x = 0;
        int y = 0;
        int xMax = -256;
        int xMin = 256;
        int yMax = -256;
        int yMin = 256;
        
        for (int i = 0; i < dots.length; i ++) {
            if (dots[i][0] > xMax) {
                xMax = dots[i][0];
            } if (dots[i][0] < xMin) {
                xMin = dots[i][0];
            } if (dots[i][1] > yMax) {
                yMax = dots[i][1];
            } if (dots[i][1] < yMin) {
                yMin = dots[i][1];
            }
        }
        answer = (xMax - xMin) * (yMax - yMin);
        return answer;
    }
}
