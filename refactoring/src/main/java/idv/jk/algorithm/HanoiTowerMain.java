package idv.jk.algorithm;

public class HanoiTowerMain {
	public static void move(int numberOfTowers, char from, char inter, char to) {
		if (numberOfTowers == 1){
			System.out.printf("Disk from %c to %c%n", from, to);
		}else {
			move(numberOfTowers - 1, from, to, inter);
			move(1, from, inter, to);
			move(numberOfTowers - 1, inter, from, to);
		}
		
	}
	
	public static void main(String[] args){
		move(3, 'A', 'B', 'C');
	}
	
}
