package demo2;
import java.util.*;
public class TraineeMain {
	
	private Map<Integer,Trainee> map= new HashMap <>();
	 Set<CsTrainee> cStraineeSet = new HashSet<>();
	    Set<EcTrainee> eceTrainees = new HashSet<>();
	
	public static void main(String args[]) {
		TraineeMain trainee=new TraineeMain();
		trainee.runApp();
	}
		
		public void runApp() {
	        Trainee trainee1 = new CsTrainee(10, "sai", 5);
	        Trainee trainee2 = new CsTrainee(2, "hippi", 9);
	        Trainee trainee3 = new EcTrainee(3, "sippi", "resistor");
	        Trainee trainee4 = new EcTrainee(4, "naveen", "multimeter");
	        map.put(trainee1.getId(), trainee1);
	        map.put(trainee2.getId(), trainee2);
	       map.put(trainee3.getId(), trainee3);
	        map.put(trainee4.getId(), trainee4);
	        
	        for(Trainee trainee:map.values()) {
			
				boolean iscs=trainee instanceof CsTrainee;
				if(iscs) {
					cStraineeSet.add((CsTrainee) trainee);
				}
				else {
					eceTrainees.add((EcTrainee) trainee);
				}
				
			}
			System.out.println("displaying cse");
			for(CsTrainee cse:cStraineeSet) {
				int id=cse.getId();
				String name=cse.getName();
				int langauge=cse.getLanguage();
				System.out.println("id is=" + id + "name is=" + name + "languages is=" + langauge);
				
				
			}
			System.out.println("displaying ece");
			for(EcTrainee ece:eceTrainees) {
				int id=ece.getId();
				String name=ece.getName();
				String device=ece.getDevice();
				System.out.println("id is=" + id + "name is=" + name + "device used is=" + device);
			}


			
			


			
			
			
			
			
			
		}
		
		
		
		
		
	}
