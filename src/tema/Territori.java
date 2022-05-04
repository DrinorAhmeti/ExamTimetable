package tema;

import java.util.ArrayList;
import java.util.List;

public class Territori extends OrariLenda {
protected boolean RedLight;
protected boolean OrangeLight;
protected boolean GreenLight;
boolean okupimi;


public Territori() {
	
	
}
public Territori(int j, int d, int p) {
	super(j, d, p);
	// TODO Auto-generated constructor stub
}
public Territori(int j, int d, int p,boolean o) {
	super(j, d, p);
	o=okupimi;
	// TODO Auto-generated constructor stub
}
public Territori(int i, String l, int j, int d, int p, int s) {
	super(i, l, j, d, p, s);
	// TODO Auto-generated constructor stub
}
public Territori(int j, int d, int p, int s,boolean redLight, boolean orangeLight, boolean greenLight) {
	super(j, d, p); 
	
	semestri=s;
	RedLight = redLight;
	OrangeLight = orangeLight;
	GreenLight = greenLight;
}
public Territori(int j,int d) {
	j=java;
	d=dita;
}
public Territori(boolean redLight, boolean orangeLight, boolean greenLight) {
	
	RedLight = redLight;
	OrangeLight = orangeLight;
	GreenLight = greenLight;
}
public boolean isOkupimi() {
	return okupimi;
}
public void setOkupimi(boolean okupimi) {
	this.okupimi = okupimi;
}
public boolean isRedLight() {
	return RedLight;
}
public void setRedLight(boolean redLight) {
	RedLight = redLight;
}
public boolean isOrangeLight() {
	return OrangeLight;
}
public void setOrangeLight(boolean orangeLight) {
	OrangeLight = orangeLight;
}
public boolean isGreenLight() {
	return GreenLight;
}
public void setGreenLight(boolean greenLight) {
	GreenLight = greenLight;
}
public List SemaforiProfesori(List<OrariLenda> orari,String name,String name2,String name3,String name4) {
	List<Territori> hijet=new ArrayList<>();
	OrariLenda o = new OrariLenda();
	for(int i=0;i<orari.size();i++) {
		if(name != null && name2==null && name3==null && name4==null) {
		if(name.equals(orari.get(i).getProfesori()) ) {
			hijet.add( new Territori(orari.get(i).getJava(),orari.get(i).getDita(),orari.get(i).getPerioda(),orari.get(i).getSemestri(),true,false,false));	
		}}
		else if(name != null && name2 !=null && name3==null && name4==null) {
			if(name.equals(orari.get(i).getProfesori()) || name2.equals(orari.get(i).getProfesori()) ) {
				hijet.add( new Territori(orari.get(i).getJava(),orari.get(i).getDita(),orari.get(i).getPerioda(),orari.get(i).getSemestri(),true,false,false));	
			}}
		else if(name != null && name2 !=null && name3!=null && name4==null) {
			if(name.equals(orari.get(i).getProfesori()) || name2.equals(orari.get(i).getProfesori()) || name3.equals(orari.get(i).getProfesori()) ) {
				hijet.add( new Territori(orari.get(i).getJava(),orari.get(i).getDita(),orari.get(i).getPerioda(),orari.get(i).getSemestri(),true,false,false));	
			}}
		else if(name != null && name2 !=null && name3!=null && name4!=null) {
			if(name.equals(orari.get(i).getProfesori()) || name2.equals(orari.get(i).getProfesori()) || name3.equals(orari.get(i).getProfesori()) || name3.equals(orari.get(i).getProfesori())) {
				hijet.add( new Territori(orari.get(i).getJava(),orari.get(i).getDita(),orari.get(i).getPerioda(),orari.get(i).getSemestri(),true,false,false));	
			}}
	}


	
	return hijet;
}
public List Semafori(int x,List<OrariLenda> orari,int dr1,int dr2,int dr3) {
	List<Territori> hijet=new ArrayList<>();
	List<Territori> Red=new ArrayList<>();
	OrariLenda o = new OrariLenda();
	for(int i=0;i<orari.size();i++) {
		if(orari.get(i).getSemestri()==x && orari.get(i).getDrejtimi1()==dr1 && orari.get(i).getDrejtimi2()==dr2 && orari.get(i).getDrejtimi3()==dr3) {
			hijet.add( new Territori(orari.get(i).getJava(),orari.get(i).getDita(),orari.get(i).getPerioda(),x,true,false,false));	
		}	
	}
	
	
   
    
	for(int k=0;k<hijet.size();k++) {
	
		
			
				if(hijet.get(k).isRedLight()==true) 
				{
					Red.add(new Territori(orari.get(k).getJava(),orari.get(k).getDita(),orari.get(k).getPerioda()));
				}
				
	
			
		
	}
	
	
	return hijet;
}public List Space() {
	Territori t = new Territori();
	List<Territori> kordinatat=new ArrayList<>();

	kordinatat.add(new Territori(1,1,1,false));
	kordinatat.add(new Territori(1,2,1,false));
	kordinatat.add(new Territori(1,3,1,false));
	kordinatat.add(new Territori(1,4,1,false));
	kordinatat.add(new Territori(1,5,1,false));
	kordinatat.add(new Territori(2,1,1,false));
	kordinatat.add(new Territori(2,2,1,false));
	kordinatat.add(new Territori(2,3,1,false));
	kordinatat.add(new Territori(2,4,1,false));
	kordinatat.add(new Territori(2,5,1,false));
	kordinatat.add(new Territori(3,1,1,false));
	kordinatat.add(new Territori(3,2,1,false));
	kordinatat.add(new Territori(3,3,1,false));
	kordinatat.add(new Territori(3,4,1,false));
	kordinatat.add(new Territori(3,5,1,false));
	kordinatat.add(new Territori(4,1,1,false));
	kordinatat.add(new Territori(4,2,1,false));
	kordinatat.add(new Territori(4,3,1,false));
	kordinatat.add(new Territori(4,4,1,false));
	kordinatat.add(new Territori(4,5,1,false));
	kordinatat.add(new Territori(1,1,2,false));
	kordinatat.add(new Territori(1,2,2,false));
	kordinatat.add(new Territori(1,3,2,false));
	kordinatat.add(new Territori(1,4,2,false));
	kordinatat.add(new Territori(1,5,2,false));
	
	return kordinatat;
}
public List Dielli(List<Territori> x,List<Territori> y) {
	Territori t = new Territori();
	List<Territori> kordinatat=new ArrayList<>();
	List<Territori> green=new ArrayList<>();
	kordinatat.add(new Territori(1,1,1,false));
	kordinatat.add(new Territori(1,2,1,false));
	kordinatat.add(new Territori(1,3,1,false));
	kordinatat.add(new Territori(1,4,1,false));
	kordinatat.add(new Territori(1,5,1,false));
	kordinatat.add(new Territori(2,1,1,false));
	 kordinatat.add(new Territori(2,2,1,false));
	kordinatat.add(new Territori(2,3,1,false));
	kordinatat.add(new Territori(2,4,1,false));
	kordinatat.add(new Territori(2,5,1,false));
	kordinatat.add(new Territori(3,1,1,false));
	kordinatat.add(new Territori(3,2,1,false));
	kordinatat.add(new Territori(3,3,1,false));
	 kordinatat.add(new Territori(3,4,1,false));
	kordinatat.add(new Territori(3,5,1,false));
	kordinatat.add(new Territori(4,1,1,false));
	kordinatat.add(new Territori(4,2,1,false));
	kordinatat.add(new Territori(4,3,1,false));
	kordinatat.add(new Territori(4,4,1,false));
	kordinatat.add(new Territori(4,5,1,false));
	
	kordinatat.add(new Territori(1,1,2,false));
	kordinatat.add(new Territori(1,2,2,false));
	kordinatat.add(new Territori(1,3,2,false));
	kordinatat.add(new Territori(1,4,2,false));
	kordinatat.add(new Territori(1,5,2,false));
	
	kordinatat.add(new Territori(2,1,2,false));
	kordinatat.add(new Territori(2,2,2,false));
	kordinatat.add(new Territori(2,3,2,false));
	kordinatat.add(new Territori(2,4,2,false));
	kordinatat.add(new Territori(2,5,2,false));
	
	kordinatat.add(new Territori(3,1,2,false));
	kordinatat.add(new Territori(3,2,2,false));
	kordinatat.add(new Territori(3,3,2,false));
	kordinatat.add(new Territori(3,4,2,false));
	kordinatat.add(new Territori(3,5,2,false));
	
	kordinatat.add(new Territori(4,1,2,false));
	kordinatat.add(new Territori(4,2,2,false));
	kordinatat.add(new Territori(4,3,2,false));
	kordinatat.add(new Territori(4,4,2,false));
	kordinatat.add(new Territori(4,5,2,false));
	
	
	for(int i=0;i<kordinatat.size();i++) {
		for(int j=0;j<x.size();j++) {
			
			if(kordinatat.get(i).getJava()==x.get(j).getJava()&&kordinatat.get(i).getDita()==x.get(j).getDita()&& kordinatat.get(i).getPerioda()==x.get(j).getPerioda()) {
				kordinatat.get(i).setOkupimi(true);
				//green.add(new Territori(kordinatat.get(i).getJava(),kordinatat.get(i).getDita(),kordinatat.get(i).getPerioda()));
			}
			    
		}
		
	}
	for(int i=0;i<kordinatat.size();i++) {
		for(int j=0;j<y.size();j++) {
			
			if(kordinatat.get(i).getJava()==y.get(j).getJava()&&kordinatat.get(i).getDita()==y.get(j).getDita()&& kordinatat.get(i).getPerioda()==y.get(j).getPerioda()) {
				kordinatat.get(i).setOkupimi(true);
				//green.add(new Territori(kordinatat.get(i).getJava(),kordinatat.get(i).getDita(),kordinatat.get(i).getPerioda()));
			}
			    
		}
		
	}
	for(int i=0;i<kordinatat.size();i++) {
		if(kordinatat.get(i).isOkupimi()==false) {
			green.add(new Territori(kordinatat.get(i).getJava(),kordinatat.get(i).getDita(),kordinatat.get(i).getPerioda()));
			
		}
	}
	return green;
	
	
	
}
public List DielliEklipsi(List<Territori> x,List<Territori> y,List<Territori> z) {
	Territori t = new Territori();
	List<Territori> kordinatat=new ArrayList<>();
	List<Territori> green=new ArrayList<>();
	kordinatat.add(new Territori(1,1,1,false));
	kordinatat.add(new Territori(1,2,1,false));
	kordinatat.add(new Territori(1,3,1,false));
	kordinatat.add(new Territori(1,4,1,false));
	kordinatat.add(new Territori(1,5,1,false));
	kordinatat.add(new Territori(2,1,1,false));
	kordinatat.add(new Territori(2,2,1,false));
	kordinatat.add(new Territori(2,3,1,false));
	kordinatat.add(new Territori(2,4,1,false));
	kordinatat.add(new Territori(2,5,1,false));
	kordinatat.add(new Territori(3,1,1,false));
	kordinatat.add(new Territori(3,2,1,false));
	kordinatat.add(new Territori(3,3,1,false));
	kordinatat.add(new Territori(3,4,1,false));
	kordinatat.add(new Territori(3,5,1,false));
	kordinatat.add(new Territori(4,1,1,false));
	kordinatat.add(new Territori(4,2,1,false));
	kordinatat.add(new Territori(4,3,1,false));
	kordinatat.add(new Territori(4,4,1,false));
	kordinatat.add(new Territori(4,5,1,false));
	
	kordinatat.add(new Territori(1,1,2,false));
	kordinatat.add(new Territori(1,2,2,false));
	kordinatat.add(new Territori(1,3,2,false));
	kordinatat.add(new Territori(1,4,2,false));
	kordinatat.add(new Territori(1,5,2,false));
	
	kordinatat.add(new Territori(2,1,2,false));
	kordinatat.add(new Territori(2,2,2,false));
	kordinatat.add(new Territori(2,3,2,false));
	kordinatat.add(new Territori(2,4,2,false));
	kordinatat.add(new Territori(2,5,2,false));
	
	kordinatat.add(new Territori(3,1,2,false));
	kordinatat.add(new Territori(3,2,2,false));
	kordinatat.add(new Territori(3,3,2,false));
	kordinatat.add(new Territori(3,4,2,false));
	kordinatat.add(new Territori(3,5,2,false));
	
	kordinatat.add(new Territori(4,1,2,false));
	kordinatat.add(new Territori(4,2,2,false));
	kordinatat.add(new Territori(4,3,2,false));
	kordinatat.add(new Territori(4,4,2,false));
	kordinatat.add(new Territori(4,5,2,false));
	
	
	for(int i=0;i<kordinatat.size();i++) {
		for(int j=0;j<x.size();j++) {
			
			if(kordinatat.get(i).getJava()==x.get(j).getJava()&&kordinatat.get(i).getDita()==x.get(j).getDita()&&kordinatat.get(i).getPerioda()==x.get(j).getPerioda()) {
				kordinatat.get(i).setOkupimi(true);
				//green.add(new Territori(kordinatat.get(i).getJava(),kordinatat.get(i).getDita(),kordinatat.get(i).getPerioda()));
			}
			    
		}
		
	}
	for(int i=0;i<kordinatat.size();i++) {
		for(int j=0;j<y.size();j++) {
			
			if(kordinatat.get(i).getJava()==y.get(j).getJava()&&kordinatat.get(i).getDita()==y.get(j).getDita()&&kordinatat.get(i).getPerioda()==y.get(j).getPerioda()) {
				kordinatat.get(i).setOkupimi(true);
				//green.add(new Territori(kordinatat.get(i).getJava(),kordinatat.get(i).getDita(),kordinatat.get(i).getPerioda()));
			}
			    
		}
		
	}
	
	for(int i=0;i<kordinatat.size();i++) {
		for(int j=0;j<z.size();j++) {
			
			if(kordinatat.get(i).getJava()==z.get(j).getJava()&&kordinatat.get(i).getDita()==z.get(j).getDita()&&kordinatat.get(i).getPerioda()==z.get(j).getPerioda()) {
				kordinatat.get(i).setOkupimi(true);
				//green.add(new Territori(kordinatat.get(i).getJava(),kordinatat.get(i).getDita(),kordinatat.get(i).getPerioda()));
			}
			    
		}
		
	}
	for(int i=0;i<kordinatat.size();i++) {
		if(kordinatat.get(i).isOkupimi()==false) {
			green.add(new Territori(kordinatat.get(i).getJava(),kordinatat.get(i).getDita(),kordinatat.get(i).getPerioda()));
			
		}
	}
	return green;
	
	
	
}
public void Rooms(List<Territori> x) {}
}

