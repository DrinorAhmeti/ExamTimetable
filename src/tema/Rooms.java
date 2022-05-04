package tema;

import java.util.ArrayList;
import java.util.List;

public class Rooms {
int numri;
int kapaciteti;
char madhesia;
boolean zene;

public Rooms() {
	
}
public Rooms(int numri, int kapaciteti, char madhesia, boolean zene) {
	super();
	this.numri = numri;
	this.kapaciteti = kapaciteti;
	this.madhesia = madhesia;
	this.zene = zene;
}public Rooms(int numri, int kapaciteti, char madhesia) {
	super();
	this.numri = numri;
	this.kapaciteti = kapaciteti;
	this.madhesia = madhesia;
	
}
public int getNumri() {
	return numri;
}
public void setNumri(int numri) {
	this.numri = numri;
}
public int getKapaciteti() {
	return kapaciteti;
}
public void setKapaciteti(int kapaciteti) {
	this.kapaciteti = kapaciteti;
}
public char getMadhesia() {
	return madhesia;
}
public void setMadhesia(char madhesia) {
	this.madhesia = madhesia;
}
public boolean isZene() {
	return zene;
}
public void setZene(boolean zene) {
	this.zene = zene;
}
public List<Rooms> ListaSalla(){
	List<Rooms> lista=new ArrayList<Rooms>();
	Rooms SR202=new Rooms(202,50,'S');
	Rooms SR1=new Rooms(1,50,'S');
	Rooms SR2=new Rooms(2,50,'S');
	Rooms MR414=new Rooms(414,80,'M');
	Rooms MR415=new Rooms(415,80,'M');
	Rooms MR620=new Rooms(620,80,'M');
	Rooms MR626=new Rooms(626,80,'M');
	Rooms LR411=new Rooms(411,150,'L');
	Rooms LR408=new Rooms(408,150,'L');
	

	

	return lista;
}
}
