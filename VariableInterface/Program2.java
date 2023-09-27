package VariableInterface;

class Program2 {
	public static void main(String[]arg) {
		MyClass my=new MyClass();
		my.accessVariables();
		
		
	}

	}

// Create a class that accesses the interface variables
class MyClass extends Program1 {
    public void accessVariables() {
        // Access instance variable from the interface
        System.out.println("Instance Variable: " + Program1.instanceVariable);

        // Access static variable from the interface
        System.out.println("Static Variable: " + Program1.staticVariable);

        // Access final variable from the interface
        System.out.println("Final Variable: " + Program1.finalVariable);
    }
}

	