package com.dimidev.observer.exercise2;

public class JudgesIntranet implements Observer{
	private InfoService informationService;
	private String data;
	
	public JudgesIntranet(InfoService informationService) {
		this.informationService = informationService;
		informationService.registerObserver(this);
	}
	
	@Override
	public void update() {
		if (!informationService.getParticipantprofiles().equals(data))
		{
			data = informationService.getParticipantprofiles();
			System.out.println(this.getClass().getSimpleName() + " " + data);
			
		}
	}
}
