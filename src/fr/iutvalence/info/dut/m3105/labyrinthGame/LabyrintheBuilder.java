package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LabyrintheBuilder {
	
	private  int width;

	private  int height;

	private  Position exitPosition;

	private  Set<Position> forbiddenCellsPositions;

	public LabyrintheBuilder(){
		this.width = 0;
		this.height = 0;
		this.exitPosition = null;
		this.forbiddenCellsPositions = new HashSet<Position>();
	}
	
	void setWidth(int newWidth) throws IllegalArgumentException{
		if(newWidth <= 0)
			throw new IllegalArgumentException();
		this.width = newWidth;
		
	}
	
	void setHeight(int newHeight)  throws IllegalArgumentException{
		if(newHeight <= 0)
			throw new IllegalArgumentException();
		this.height = newHeight;
	}
	
	void setExitPosition(Position newExitPosition){
		this.exitPosition = newExitPosition;
	}
	
	void setForbiddenCellsPositions(Set<Position> newForbiddenCellsPosition){
		this.forbiddenCellsPositions = newForbiddenCellsPosition;
	}
	
	void addForbiddenCellPosition(Position newForbiddenCellPosition){
		this.forbiddenCellsPositions.add(newForbiddenCellPosition);
	}
	
	Labyrinth getLabyrinthe(){
		return new Labyrinth(this.width, this.height, this.forbiddenCellsPositions, this.exitPosition);
	}

}
