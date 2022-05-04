package tema;

import java.util.ArrayList;
import java.util.List;

public class Room extends OrariLenda {
	int roomNr;
	int roomCapacity;
	char Type;
	boolean availability;
	int diferenca;
	
	
	
	public int getDiferenca() {
		return diferenca;
	}
	public void setDiferenca(int diferenca) {
		this.diferenca = diferenca;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public char getType() {
		return Type;
	}
	public void setType(char type) {
		Type = type;
	}
	Room(){}
	Room(int r,int c){
		roomNr=r;
		roomCapacity=c;
		
	}
	
	public int getRoomNr() {
		return roomNr;
	}
	public void setRoomNr(int roomNr) {
		this.roomNr = roomNr;
	}
	public int getRoomCapacity() {
		return roomCapacity;
	}
	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}
	
	public Room(int roomNr, int roomCapacity, char type) {
		
		this.roomNr = roomNr;
		this.roomCapacity = roomCapacity;
		Type = type;
	}
public Room(int roomNr, int roomCapacity, char type,int diferenca) {
		
		this.roomNr = roomNr;
		this.roomCapacity = roomCapacity;
		Type = type;
		this.diferenca=diferenca;
	}
	public Room(int i, String l, int j, int d, int p, int s, int roomNr, int roomCapacity, char type) {
		super(i, l, j, d, p, s);
		this.roomNr = roomNr;
		this.roomCapacity = roomCapacity;
		Type = type;
	}
	
	

	public void RoomCapacity(int java,int dita,int perioda)
	{
		OrariLenda o=new OrariLenda();
		Provim p     =new Provim();
		ArrayList<Room> SmallRooms=new ArrayList<Room>();
		ArrayList<Room> MediumRooms=new ArrayList<Room>();
		ArrayList<Room> LargeRooms=new ArrayList<Room>();
		
		
		List<Room> alokimi=new ArrayList<Room>();
		
		 
		List<OrariLenda> listaOrareve= o.OrariFillestarV1();
		List<OrariLenda> bufferlista=new ArrayList<OrariLenda>();
		List<Integer> listaId=new ArrayList<Integer>();
		List<Provim> listaProvimeve=p.ProvimidheFleteparaqitjet();
		List<Provim> orariAllRight=new ArrayList<Provim>();
		for(int i=0;i<listaOrareve.size();i++) {
			if(listaOrareve.get(i).getJava()==java && listaOrareve.get(i).getDita()==dita && listaOrareve.get(i).getPerioda()==perioda) {
				bufferlista.add(listaOrareve.get(i));
				listaId.add(listaOrareve.get(i).getId());
				
				
			}
		}
		
	
		
		
		
		
		
		
		}
		
		
	}


	


