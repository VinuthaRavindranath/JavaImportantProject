package OOPSConcepts.MethodOverloading;

public class DefMethodOverloading {


	// Method Overloading: OOP
	// within the same class: we have different methods:
	// 1. with the same name
	// 2. with different number of parameters with different type
	// 3. with different sequence of parameters
	// 4. return type doesnt matter

	// Poly(Many)+Morphism(Forms) -- OOP
	// compile time (static) decision is already taken at compile time

	public void test() {// 0 param
		System.out.println("test - 0 param");
	}

	public void test(int i) { // 1 param
		System.out.println("1 param:" + i);
	}

	public void test(String i) { // 1 param

	}

	public void test(int i, int j) { // 2 params

	}

	public void test(int i, String j) { // 2 params

	}

	public void test(String i, int j) { // 2 params

	}
    public static void main(String[] args) {
        DefMethodOverloading mo = new DefMethodOverloading();
        mo.test("hi");
        mo.test(10);
        mo.test("hi", 10);
        
    }
}
