package com.challenge.writer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.challenge.bean.One4All;


public class Writer {
	public static final String teamFile = "teams.txt";
	
	//write
	public static void writeTeams(List<One4All> teamList) {
		try {
			ObjectOutputStream teamOut = new ObjectOutputStream( new FileOutputStream(teamFile));
			teamOut.writeObject(teamList);
			teamOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//read
	@SuppressWarnings("unchecked")
	public static void readTeams() {
		try {
			ObjectInputStream teamIn = new ObjectInputStream(new FileInputStream(teamFile));
			try {
				UAvVill.teamList = (ArrayList<One4All>) teamIn.readObject();
				teamIn.close();
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
