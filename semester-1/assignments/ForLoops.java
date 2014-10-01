public class ForLoops {
	
	public void oddInts(){
		for (int i = 1; i < 32; i++){
			if (i % 2 != 0){
			System.out.print(i + " ");
			}
		}
		System.out.println(" ");
	}
	
	public void upperCase() {
		for (int i = 90; i > 64; i--){
			System.out.print((char)i + " ");
		}
		System.out.println(" ");
	}
	
	public void nestedLoop() {
		for (int i = 1; i < 5; i++){
			for (int x = 1; x < 6; x++){
				System.out.print((i*x) + "\t");
			}
			System.out.print("\n");
		}
		
	}
    
    public static void main(String[] args) {
    	
    	ForLoops part_a = new ForLoops();
    	part_a.oddInts();
    	
    	ForLoops part_b = new ForLoops();
    	part_b.upperCase();
    	
    	ForLoops part_c = new ForLoops();
    	part_c.nestedLoop();
    	
    }
}
