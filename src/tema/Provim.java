package tema;

import java.util.ArrayList;
import java.util.List;

import excelProject.ReadInvoices;
import excelProject1.Exams;

public class Provim {
	String afati;
	String emri;
	String profesori;
	int nrFletparaqitjeve;
	int id;
	int semestri;
	
	
	
	
	
	
	public int getSemestri() {
		return semestri;
	}
	public void setSemestri(int semestri) {
		this.semestri = semestri;
	}
	public String getAfati() {
		return afati;
	}
	public void setAfati(String afati) {
		this.afati = afati;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Provim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Provim(String afati,String emri, String profesori, int nrFletparaqitjeve,int id) {
		super();
		this.afati=afati;
		this.emri = emri;
		this.profesori = profesori;
		this.nrFletparaqitjeve = nrFletparaqitjeve;
		this.id=id;
	}
	public Provim(String afati,String emri, String profesori, int nrFletparaqitjeve,int id,int semestri) {
		super();
		this.afati=afati;
		this.emri = emri;
		this.profesori = profesori;
		this.nrFletparaqitjeve = nrFletparaqitjeve;
		this.id=id;
		this.semestri=semestri;
	}
	public Provim(String emri, String profesori, int nrFletparaqitjeve,int id) {
		super();
		
		this.emri = emri;
		this.profesori = profesori;
		this.nrFletparaqitjeve = nrFletparaqitjeve;
		this.id=id;
	}
	public Provim(String emri, String profesori, int nrFletparaqitjeve) {
		super();
		this.emri = emri;
		this.profesori = profesori;
		this.nrFletparaqitjeve = nrFletparaqitjeve;
		
	}
	public String getEmri() {
		return emri;
	}
	public void setEmri(String emri) {
		this.emri = emri;
	}
	public String getProfesori() {
		return profesori;
	}
	public void setProfesori(String profesori) {
		this.profesori = profesori;
	}
	public int getNrFletparaqitjeve() {
		return nrFletparaqitjeve;
	}
	public void setNrFletparaqitjeve(int nrFletparaqitjeve) {
		this.nrFletparaqitjeve = nrFletparaqitjeve;
	}
	public ArrayList<Provim> ProvimidheFleteparaqitjet() {
		ArrayList<Provim> ListaSems =new ArrayList<Provim>();
		
		ArrayList<excelProject.Provimi> lisat1=ReadInvoices.excel();
		ArrayList<excelProject.Provimi> lisat2=ReadInvoices.excelprim();
		for(int i=0;i<lisat1.size();i++) {
			
			ListaSems.add(new Provim(lisat1.get(i).getAfati(),lisat1.get(i).getName(),lisat1.get(i).getAge(),lisat2.get(i).getNum(),lisat2.get(i).getId(),lisat2.get(i).getSemestri()));
			
		}
		return ListaSems;
	}
	

	
}
