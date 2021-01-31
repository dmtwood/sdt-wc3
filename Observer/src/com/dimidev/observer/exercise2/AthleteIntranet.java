package com.dimidev.observer.exercise2;

public class AthleteIntranet implements Observer{
	private InfoService infoService;
	private String data;
	
	public AthleteIntranet(InfoService infoService) {
		this.infoService = infoService;
		AthleteIntranet.this.infoService.registerObserver(this);
		
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
