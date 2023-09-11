package java_class_tasks;

public class ArthermaticOperators {
	int firstValue;
	int secondValue;

	ArthermaticOperators(int firstValue,int secondValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}
	int add()
	{
		return firstValue + secondValue;
	}
	int sub() {
		return firstValue-secondValue;
	}
	int mult()
	{
		return firstValue*secondValue;
	}
	double dev()
	{
		return firstValue/secondValue;
	}
	
	void printOut(char operationName , double outputValue) {
		System.out.println("your first value "+firstValue+" second value "+secondValue +" --> "+firstValue  + operationName + secondValue + " = "+ outputValue);
	}
	void printOut(char operationName , int outputValue) {
		System.out.println("your first value "+firstValue+" second value "+secondValue +" --> "+firstValue  + operationName + secondValue + " = "+ outputValue);
	}
}
