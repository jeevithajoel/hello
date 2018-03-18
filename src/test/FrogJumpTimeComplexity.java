package test;


public class FrogJumpTimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumps  = solution1(10,190,30);
		System.out.println("jumps:::" + jumps);
	}

	public static int solution(int X, int Y, int D){
		
		int achievedDistance =X;
		int jumps = 0;
		while(achievedDistance < Y){
			achievedDistance = achievedDistance +D;
			jumps = jumps +1;
		}
		return jumps;
	}
	
	public static int solution1(int X, int Y, int D){
		int remainder =(Y-X)	% D;
		System.out.println("remainder::" +remainder );
		if(remainder == 0){
			return (Y-X)/ D;
		}else{
			return (Y-X)/ D +1;
		}
	}
}
