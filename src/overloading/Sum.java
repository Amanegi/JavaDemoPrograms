package overloading;

public class Sum {
	
	public int sum(int a , int b){
		int s = a+b;
		return s;
	}
	public double sum(double a , double b){
		double s = a+b;
		return s;
	}
	public int sum(int a , int b, int c){
		int s = a+b+c;
		return s;
	}

}
