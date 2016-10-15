/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.peramtakehomeexam;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Vinod Kumar Reddy Peram
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*
        creating object of ReadfromExcel class
        */
         InputFile inf = new InputFile();
         List songList = inf.getSongsListFromExcel();
         System.out.println(songList);
         
         
       /*
         Sorting the list
         */
        Collections.sort(songList,new Comparator<Song>(){
        
        
        /*
            Sorting by Genre
            */
	@Override
	public int compare(Song arg0, Song arg1) {
		
		return arg0.getGenre().compareTo(arg1.getGenre());
	}
        });
         Collections.sort(songList, new Comparator<Song>(){

        
        
        /*
             Sorting  by Critic score
             */
	@Override
	public int compare(Song o1, Song o2) {
		
		if(o1.getGenre().equals(o2.getGenre())){
			
			if(o2.getCriticscore()-o1.getCriticscore()<0)
				return -1;
			else if(o2.getCriticscore()-o1.getCriticscore()>0)
				return 1;
			else return 0;
		}
		else{
			
			return 1;
		}
	}
          });
            
         
         
         /*
         Writing to excel
         */
         OutputFile of = new OutputFile();
         
         of.writeSongsListToExcel(songList);
     }
    }
    

