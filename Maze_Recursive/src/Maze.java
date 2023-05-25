/*3 (TRIED): Bu değer, labirentte denenmiş ve geçilemeyen bir hücreyi temsil eder. Yani, bir yol denendi ancak sonuç başarılı olmadı.

	7 (PATH): Bu değer, labirentin çözümünde kullanılan geçerli bir yolun bir parçasını temsil eder. Labirentin çözümünde,
	 geçilebilen bir yolun izlendiği hücreler bu değeri alır.

	1: Bu değer, labirentte geçilebilen bir hücreyi temsil eder. Yani, bir yolun izlenebileceği ve hareket edilebileceği bir hücreyi gösterir.

	0: Bu değer, labirentte engel oluşturan bir hücreyi temsil eder. Yani, bu hücreler labirentin geçilemeyen veya bloke edilmiş alanlarını gösterir.*/

public class Maze {

	private final int TRIED = 3;
	private final int PATH =7;
	private int[][] grid = { {1,1,1,0,1,1,0,0,0,1,1,1,1},    //bu benim labirentimi temsil ediyor
			{1,0,1,1,1,0,1,1,1,1,0,0,1},
			{0,0,0,0,1,0,1,0,1,0,1,0,0},
			{1,1,1,0,1,1,1,0,1,0,1,1,1},
			{1,0,1,0,0,0,0,1,1,1,0,0,1},
			{1,0,1,1,1,1,1,1,0,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1,1,1,1} };
	
	//konum geçerli mi benim matrisimdde var mı onu kontrol eder.
	private boolean valid(int row, int column) {
		boolean result = false;
		if(row>=0 && row<grid.length && column>=0 && column<grid[row].length) {
			if(grid[row][column]==1) {
				result=true;            //1--> labirentten geçilebileceğini söylüyodu o yüzden true.
			}
		}
		return result;
	}
	
	public boolean traverse(int row, int column) {  //row=satır column=sütun
		boolean done=false;       //lairent bitmedi
		if(valid(row,column)) {
			grid[row][column]=TRIED;
			if(row==grid.length-1 && column==grid[0].length-1) {  // en alt köşedeki çıkışı temsil ediyor
				done=true;     //labirent çözüldü.
			}
			else {
				done=traverse(row+1,column); //aşağı satır            //burda traverse metodu kendini tekrar açğrıyor
				if(!done)
					done=traverse(row,column+1); //Sağ sütun
				if(!done)
					done=traverse(row-1,column); //yukarı satır
				if(!done)
					done=traverse(row,column-1);  //sol sütun
				}
			if(done) {
				grid[row][column]=PATH;	
			}
		}
		return done;
	}
	public String toString() {
		String result="\n";
		for(int row=0; row<grid.length;row++) {
			for(int column=0 ; column<grid[row].length;column++) {      //burası tüm kutuları gezmeye yarar
				result += grid[row][column] + "";
			}
			result+="\n";
		}
		return result;
	}

	


}
