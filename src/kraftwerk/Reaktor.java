package kraftwerk;

public class Reaktor implements Runnable {

	
	private int temperature = 10;
	
	@Override
	public void run() {
		
		while(true){
			temperature++;
		}
	}
	
	
	
	public int getTemperature(){
		return this.temperature;
	}
	
	private void setTemperature(int temperature){
		this.temperature = temperature;
	}
	
	
}


