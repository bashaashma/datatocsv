

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DATtoCSVConverter extends MemberFileConverter implements MemberImporter, MemberExporter{
	
	public static void main(String[] args)  {
		//System.out.print("Hello");
		DATtoCSVConverter dc = new DATtoCSVConverter();	
		
		dc.exportMembers(dc.importMembers( new File("Members.dat")), new File("done.csv"));
//		
		
		
	}
	@Override
	public List<Member> importMembers(File inputFile) {

			int[] indexes = {0, 12, 24, 60, 88, 108, 124, 128, 133};
			ArrayList <Member> comp = new ArrayList<Member>();
			try {
				 FileInputStream fis = new FileInputStream(inputFile);
				 InputStreamReader isr = new InputStreamReader(fis);
				 BufferedReader reader = new BufferedReader(isr);
				 String line; 
				 
				 
				 
				 while((line = reader.readLine())!=null)
				 {
					 Member member = new Member();
					 member.setFirstName(line.substring(indexes[0],indexes[1]).trim());
					 
					 member.setLastName(line.substring(indexes[1],indexes[2]).trim());
					 
					 member.setMiddleName(line.substring(indexes[2],indexes[3]).trim());
					 
					 member.setAddress(line.substring(indexes[3],indexes[4]).trim());
					 
					 member.setCity(line.substring(indexes[4],indexes[5]).trim());
					 
					 member.setIdNumber(line.substring(indexes[5],indexes[6]).trim());
					 
					 member.setState(line.substring(indexes[6],indexes[7]).trim());
					 
					 member.setZip(line.substring(indexes[7],line.length()).trim());
					 
					 comp.add(member);
			
					 
				 }
				 System.out.print(comp.size());
				 reader.close();
				
				
			 }

			 catch (FileNotFoundException e){

		         e.printStackTrace();
		     }
		     catch (IOException e){

		         e.printStackTrace();
		     }
				return comp;

	}
	
	@Override
	protected MemberImporter getMemberImporter() {
		return null;
	}
	@Override
	public void exportMembers(List<Member> members, File outputFile) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		System.out.print(members.size());
		try {
			fw = new FileWriter(outputFile);
			for(Member mem: members) {
				
				fw.append(mem.getFirstName());
				fw.append(",");
				fw.append(mem.getLastName());
				fw.append(",");
				fw.append(mem.getMiddleName());
				fw.append(",");
				fw.append(mem.getAddress());
				fw.append(",");
				fw.append(mem.getCity());
				fw.append(",");
				fw.append(mem.getIdNumber());
				fw.append(",");
				fw.append(mem.getState());
				fw.append(",");
				fw.append(mem.getZip());
				fw.append("\n");
				
			}
			
		}
			catch(Exception e) {
				
				e.printStackTrace();
			}
		
		finally {
			try {
				fw.flush();
				fw.close();
				
			}
			catch (IOException e){
				e.printStackTrace();
				
			}
		}
			
		}
		
		
	

	

	@Override
	protected MemberExporter getMemberExporter() {
		// TODO Auto-generated method stub
		return null;
	}



	
}
