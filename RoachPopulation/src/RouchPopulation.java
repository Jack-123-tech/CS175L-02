
public class RouchPopulation {
public double population;
	
public RouchPopulation() {
	this.population=0;
}


public void setRoach(double startsize) {
	this.population=startsize;
}




public RouchPopulation(double startsize){
	this.population= startsize;

}

	
	public double breed(double startsize) {
	population=startsize;
	population= population*2;
	return population;
	}
	
	
	
	
	public double spray(double population,double percent) {
		//double deathpop = population *(1-percent); 
      //  population = population - deathpop; 
		population=population-(population*percent);
		return population;
	
}
	//public double getspray() {
	//	return deathpop;
		
	//}
	public double getRoaches() {
		return population;
	}
	
	
	
	
	
}
