package com.dimidev.observer.exercise2;

public class EventWebsite implements Observer{
	private InfoService infoService;
	private String data;
	
	public EventWebsite(InfoService infoService) {
		this.infoService = infoService;
		EventWebsite.this.infoService.registerObserver(this);
	}
	
	@Override
	public void update() {
		if (!infoService.getSchedulingData().equals(data))
		{
			data = infoService.getSchedulingData();
			System.out.println(this.getClass().getSimpleName() + " " + data);
			
		}
		
		
	}
}
