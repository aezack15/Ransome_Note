//Grind 75
//Week 2 problem 3
//Alternate solution could use Collections.frequency
// while you iterate through the note list, if any frequency is < 1 return false
// if you make it all the way t the end of the letter, return true

import java.util.*;

class Ransom_Note{
	
	public String note;
	public String magazine;
	
	public static void main(String[] args){
		Ransom_Note rn = new Ransom_Note();
		rn.getInput();
		rn.compare();
	}
	
	private void getInput(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter note > ");
		note = in.nextLine();
		System.out.print("Enter magazine > ");
		magazine = in.nextLine();
	}
	
	private void compare(){
		ArrayList<String> noteList = new ArrayList<String>();
		ArrayList<String> magazineList = new ArrayList<String>();
		String[] a = note.split("");
		String[] b = magazine.split("");
		
		//make list for note
		for(int i =0; i<a.length; i++){
			noteList.add(a[i]);
		}
		
		//make list for magazine
		for(int i=0; i<b.length; i++){
			magazineList.add(b[i]);
		}
		
		//if ransom note can be generated from letters in magazine - only used once
		System.out.println(compareLists(noteList, magazineList));
	}
	
	private boolean compareLists(ArrayList<String> nList, ArrayList<String> mList){
		int i = 0;
		while(i < mList.size()){
			if(nList.contains(mList.get(i))){
				nList.remove(nList.indexOf(mList.get(i)));
			}
			i++;
		}
		if(nList.size() == 0){
				return true;
		}
		return false;	
	}
}
