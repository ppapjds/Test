package YJ.TEST.MAIN;

public class PPA {
	
	public PPA() {
		
	}

	public int as(String a, int...d) {
		int result = 0;
		if(d.length == 1) {
			System.out.println("숫자를 두개 이상 적어주세요.");
			return result;
		};
		
		switch (a) {
		
		case "+":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result += d[i];
				}
			}
			break;
			
		case "-":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result -= d[i];
				}
			}
			break;
			
		case "*":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result *= d[i];
				}
			}
			break;
			
		case "/":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[0];
				}else {
					result /= d[i];
				}
			}
			break;
			

		default:
			System.out.println("+,-,*,/ 중 1택");
			System.out.println("연산할 숫자는 2개 이상 적어주세요.");
			break;
		}
		
		
		return result;
		
	};
	
	public long as(String a, long...d) {
		long result = 0;
		
		switch (a) {
		
		case "+":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result += d[i];
				}
			}
			break;
			
		case "-":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result -= d[i];
				}
			}
			break;
			
		case "*":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result *= d[i];
				}
			}
			break;
			
		case "/":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[0];
				}else {
					result /= d[i];
				}
			}
			break;
			
		default:
			System.out.println("+,-,*,/ 중 1택");
			System.out.println("연산할 숫자는 2개 이상 적어주세요.");
			break;
		}
		
		return result;
		
	};
	
	public float as(String a, float...d) {
		float result = 0;
		
		switch (a) {
		
		case "+":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result += d[i];
				}
			}
			break;
			
		case "-":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result -= d[i];
				}
			}
			break;
			
		case "*":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result *= d[i];
				}
			}
			break;
			
		case "/":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[0];
				}else {
					result /= d[i];
				}
			}
			break;
			
		default:
			System.out.println("+,-,*,/ 중 1택");
			System.out.println("연산할 숫자는 2개 이상 적어주세요.");
			break;
		}
		
		
		return result;
		
	};
	
	public Double as(String a, double...d) {
		double result = 0;
		
		switch (a) {
		
		case "+":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result += d[i];
				}
			}
			break;
			
		case "-":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result -= d[i];
				}
			}
			break;
			
		case "*":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[i];
				}else {
					result *= d[i];
				}
			}
			break;
			
		case "/":
			for(int i = 0; i<d.length;i++) {
				if(i == 0) {
					result = d[0];
				}else {
					result /= d[i];
				}
			}
			break;
			
		default:
			System.out.println("+,-,*,/ 중 1택");
			System.out.println("연산할 숫자는 2개 이상 적어주세요.");
			break;
		}
		
		
		return result;
		
	};
	
}
