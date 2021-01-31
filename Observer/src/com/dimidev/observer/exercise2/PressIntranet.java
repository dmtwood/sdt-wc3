package com.dimidev.observer.exercise2;

public class PressIntranet implements Observer{
	private InfoService informationService;
	private String data;
	
	public PressIntranet(InfoService informationService) {
		this.informationService = informationService;
		informationService.registerObserver(this);
	}
	
	@Override
	public void update() {
		if (!informationService.getResults().equals(data))
		{
			data = informationService.getResults();
			System.out.println(this.getClass().getSimpleName() + " " + data);
			
		}
		
	}
}
