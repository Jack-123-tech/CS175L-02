
public class RouchPopulation {
public double population;
	
//public RouchPopulation() {
//	this.population=0;
//}


public void setRoach(double startsize) {
	this.population=startsize;
}




public RouchPopulation(double startsize){
	this.population= startsize;

}

	
	public void breed() {
	
	population= population*2;
	
	}
	
	
	
	
	public void spray(double percent) {
		//double deathpop = population *(1-percent); 
      //  population = population - deathpop; 
		population=population-(population*percent);
		
	
}
	//public double getspray() {
	//	return deathpop;
		
	//}
	public double getRoaches() {
		return population;
	}
	
	
	
	
	
}
