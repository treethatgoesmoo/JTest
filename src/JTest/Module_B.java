package JTest;

public class Module_B {

	public Module_B(){
		
	}
	
	public int return_two(){
		int result;
		Module_A module_A = new Module_A();
		
		result = module_A.return_num() + module_A.return_num();
		
		return result;
	}
}
