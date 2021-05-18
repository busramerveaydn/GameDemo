package gameDemo.Entities;

import gameDemo.Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String gameNameString;
	private double gameUnitPrice;
	
	public Game() {
		
	}

	public Game(int id, String gameNameString, double gameUnitPrice) {
		super();
		this.id = id;
		this.gameNameString = gameNameString;
		this.gameUnitPrice = gameUnitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameNameString() {
		return gameNameString;
	}

	public void setGameNameString(String gameNameString) {
		this.gameNameString = gameNameString;
	}

	public double getGameUnitPrice() {
		return gameUnitPrice;
	}

	public void setGameUnitPrice(double gameUnitPrice) {
		this.gameUnitPrice = gameUnitPrice;
	}
	
}
