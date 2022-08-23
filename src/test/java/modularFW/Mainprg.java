package modularFW;


public class Mainprg {

	public static void main(String[] args) {
		//create object for &quot;General&quot; class
		Genprg gl= new Genprg();
		//test case steps
		gl.setUp();
		gl.tearDown();
		gl.adminLogin();
		gl.adminLogout();
		gl.addEmp();
		gl.delEmp();
		

	}

}
