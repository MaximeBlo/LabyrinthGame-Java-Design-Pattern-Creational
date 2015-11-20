package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;


/**
 * Test application for labyrinth game
 * 
 */
public class TestLabyrinthGame
{
	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (none expected here)
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		
		
		/*Set<Position> blockPositions = new HashSet<Position>();
		blockPositions.add(new Position(2,0));
		blockPositions.add(new Position(3,0));
		blockPositions.add(new Position(0,1));
		blockPositions.add(new Position(0,2));
		blockPositions.add(new Position(1,2));
		blockPositions.add(new Position(3,2));
		blockPositions.add(new Position(3,3));
		
		new LabyrinthGame(new Labyrinth(4, 4, blockPositions, new Position(3,1)), RobotArtificialIntelligence.createRobot("debile")).play();*/
		/*LabyrintheBuilder labBuilder = new LabyrintheBuilder();
		String nomRobot = "moinsDebile";
		labBuilder.setWidth(4);
		labBuilder.setHeight(4);
		labBuilder.setExitPosition(new Position(3, 1));
		labBuilder.addForbiddenCellPosition(new Position(2, 0));
		labBuilder.addForbiddenCellPosition(new Position(3, 0));
		labBuilder.addForbiddenCellPosition(new Position(0, 1));
		labBuilder.addForbiddenCellPosition(new Position(0, 2));
		labBuilder.addForbiddenCellPosition(new Position(1, 2));
		labBuilder.addForbiddenCellPosition(new Position(3, 2));
		labBuilder.addForbiddenCellPosition(new Position(3, 3));
		Labyrinth lab = labBuilder.getLabyrinthe();
		RobotArtificialIntelligence rbt = RobotArtificialIntelligence.createRobot(nomRobot); 
		new LabyrinthGame(lab, rbt).play();
		*/
		
		File file = new File("labyrinthe.txt");
		FileReader fr = new FileReader(file);
		
	
	
	}
	
}
