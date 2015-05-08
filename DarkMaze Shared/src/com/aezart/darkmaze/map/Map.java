package com.aezart.darkmaze.map;

import java.io.Serializable;

public class Map implements Serializable{

	private static final long serialVersionUID = -7894679395200195501L;
	public boolean[][] mapTiles;
	public boolean[][] enemyLocations;
	public boolean[][] coinLocations;
	public boolean[][] lightLocations;
	public boolean[][] powerupLocations;
	
	public Map(){
		mapTiles = new boolean[15][19];
		enemyLocations = new boolean[30][38];
		coinLocations = new boolean[15][19];
		lightLocations = new boolean[15][19];
		powerupLocations = new boolean[15][19];

	}
}
