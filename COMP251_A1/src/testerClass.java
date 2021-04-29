
public class testerClass {

	
	public static void main(String[] args) {
		
		Chaining ch = new Chaining(2, 1, -1);
//		a1_real a1 = new a1_real();
//		int[] positions = new int[100000];
//		for(int i = 0; i < 100000; i++) {
//			positions[i]=i;
//		}
//		System.out.println(a1_real.silence(positions));
//		System.out.println(positions.length);
//	}
		ch.insertKey(34);
		
		Open_Addressing oa = new Open_Addressing(2, 1, -1);
		
		oa.insertKey(34);
		oa.insertKey(34);
	}
		
}
