package tema;
import excelProject.ReadInvoices;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class OrariLenda {
		private int id;
		private int drejtimi1;
		private int drejtimi2;
		private int drejtimi3;
		protected String lenda;
		int java;
	    int dita;
		private int perioda;
		int semestri;
		boolean avalaible;
		String profesori;
		String profesori2;
		String profesori3;
		String profesori4;
		boolean oralexam;
		
		
		
		
		public int getDrejtimi1() {
			return drejtimi1;
		}
		public void setDrejtimi1(int drejtimi1) {
			this.drejtimi1 = drejtimi1;
		}
		public int getDrejtimi2() {
			return drejtimi2;
		}
		public void setDrejtimi2(int drejtimi2) {
			this.drejtimi2 = drejtimi2;
		}
		public int getDrejtimi3() {
			return drejtimi3;
		}
		public void setDrejtimi3(int drejtimi3) {
			this.drejtimi3 = drejtimi3;
		}
		public String getProfesori2() {
			return profesori2;
		}
		public void setProfesori2(String profesori2) {
			this.profesori2 = profesori2;
		}
		public String getProfesori3() {
			return profesori3;
		}
		public void setProfesori3(String profesori3) {
			this.profesori3 = profesori3;
		}
		public String getProfesori4() {
			return profesori4;
		}
		public void setProfesori4(String profesori4) {
			this.profesori4 = profesori4;
		}
		public boolean isOralexam() {
			return oralexam;
		}
		public void setOralexam(boolean oralexam) {
			this.oralexam = oralexam;
		}
		public String getProfesori() {
			return profesori;
		}
		public void setProfesori(String profesori) {
			this.profesori = profesori;
		}
		OrariLenda(){}
		OrariLenda(int i,String l,int j,int d,int p,int s){
			id=i;
			lenda=l;
			java=j;
			dita=d;
			perioda=p;
			semestri=s;
			
			
		}
		OrariLenda(int i,int d1,int d2,int d3,String l,int j,int d,int p,int s,String prof){
			id=i;
			drejtimi1=d1;
			drejtimi2=d2;
			drejtimi3=d3;
			lenda=l;
			java=j;
			dita=d;
			perioda=p;
			semestri=s;
			profesori=prof;
			
			
		}
		OrariLenda(int i,int d1,int d2,int d3,String l,int j,int d,int p,int s,String prof,String prof2,boolean o){
			id=i;
			drejtimi1=d1;
			drejtimi2=d2;
			drejtimi3=d3;
			lenda=l;
			java=j;
			dita=d;
			perioda=p;
			semestri=s;
			profesori=prof;
			profesori2=prof2;
			oralexam=o;
			
			
			
		}
		OrariLenda(int i,int d1,int d2,int d3,String l,int j,int d,int p,int s,String prof,String prof2,String prof3,boolean o){
			id=i;
			drejtimi1=d1;
			drejtimi2=d2;
			drejtimi3=d3;
			lenda=l;
			java=j;
			dita=d;
			perioda=p;
			semestri=s;
			profesori=prof;
			profesori2=prof2;
			profesori3=prof3;
			oralexam=o;
			
			
		}
		OrariLenda(int i,int d1,int d2,int d3,String l,int j,int d,int p,int s,String prof,String prof2,String prof3,String prof4,boolean o){
			id=i;
			drejtimi1=d1;
			drejtimi2=d2;
			drejtimi3=d3;
			lenda=l;
			java=j;
			dita=d;
			perioda=p;
			semestri=s;
			profesori=prof;
			profesori2=prof2;
			profesori3=prof3;
			profesori4=prof4;
			oralexam=o;
			
			
		}
		OrariLenda(int i,int d1,int d2,int d3,String l,int j,int d,int p,int s,String prof,boolean o){
			id=i;
			drejtimi1=d1;
			drejtimi2=d2;
			drejtimi3=d3;
			lenda=l;
			java=j;
			dita=d;
			perioda=p;
			semestri=s;
			profesori=prof;
			oralexam=o;
			
			
		}
		OrariLenda(int j,int d,int p){
			java=j;
			dita=d;
			perioda=p;
		}
		OrariLenda(int i,String l,int j,int d,int p){
			id=i;
			lenda=l;
			java=j;
			dita=d;
			perioda=p;
		}
		
		public String getLenda() {
			return lenda;
		}
		public void setLenda(String lenda) {
			this.lenda = lenda;
		}
		public int getJava() {
			return java;
		}
		public void setJava(int java) {
			this.java = java;
		}
		public int getDita() {
			return dita;
		}
		public void setDita(int dita) {
			this.dita = dita;
		}
		public int getPerioda() {
			return perioda;
		}
		public void setPerioda(int perioda) {
			this.perioda = perioda;
		}
		
		public int getSemestri() {
			return semestri;
		}
		public void setSemestri(int semestri) {
			this.semestri = semestri;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public boolean isAvalaible() {
			return avalaible;
		}
		public void setAvalaible(boolean avalaible) {
			this.avalaible = avalaible;
		}
		
		public List OrariFillestarV1() {
			
		List<OrariLenda> l = new ArrayList<OrariLenda>();
		l.add(new OrariLenda(0,"Matematika 1",1,1,1,1));
		l.add(new OrariLenda(1,"Fizika 1",2,1,1,1));
		l.add(new OrariLenda(2,"Gjuhe Programuese",2,2,1,1));
		l.add(new OrariLenda(3,"Bazat e Elektroteknikes",4,1,1,1));
		l.add(new OrariLenda(4,"Anglisht",3,2,1,1));
		l.add(new OrariLenda(5,"Matematika 2",1,2,1,2));
		l.add(new OrariLenda(6,"Fizika 2",1,3,1,2));
		l.add(new OrariLenda(7,"Algoritmet dhe strukturat e te dhenave",4,3,1,2));
		l.add(new OrariLenda(8,"Qarqet Elektrike",3,1,1,2));
		l.add(new OrariLenda(9,"Qarqet Digjitale",2,2,1,2));
		l.add(new OrariLenda(10,"Matematika 3",3,2,1,3));
		l.add(new OrariLenda(11,"Elektronika",1,1,1,3));
		l.add(new OrariLenda(12,"Sinjale dhe Sisteme",3,1,1,3));
		l.add(new OrariLenda(13,"Programimi i Orientuar ne Objekte",4,2,1,3));
		l.add(new OrariLenda(14,"Interneti",2,2,1,3));
		l.add(new OrariLenda(15,"Databaza",1,1,1,3));
		l.add(new OrariLenda(16,"Komunikimi i Njeri Kompjuter",4,3,1,4));
		l.add(new OrariLenda(17,"Programimi ne Internet",2,1,1,4));
		l.add(new OrariLenda(18,"Siguria",2,3,1,4));
		l.add(new OrariLenda(19,"Rrjetat Kompjuterike",3,5,1,4));
		l.add(new OrariLenda(20,"Arkitektura e Kompjutereve",4,1,1,4));
		l.add(new OrariLenda(21,"Menaxhimi i Projekteve",4,5,1,4));
		
		

		return l;
		
		}
		public List OrariFillestarV2() {
			
			List<OrariLenda> l = new ArrayList<OrariLenda>();
			l.add(new OrariLenda(0,1,1,1,"Matematika 1",2,2,1,1,"Qefsere Gjonbalaj","Shqipe Lohaj",true));
			l.add(new OrariLenda(43,1,1,1,"Matematika 1",2,3,1,1,"Valdete Rexhëbeqaj-Hamiti","Marjan Dema",true));
			l.add(new OrariLenda(1,1,1,1,"Fizika 1",3,4,1,1,"Skender Ahmetaj",true));
			l.add(new OrariLenda(2,1,1,1,"Gjuhe Programuese",1,1,2,1,"Kadri Sylejmani",false));
			l.add(new OrariLenda(46,1,1,1,"Gjuhe Programuese",1,5,2,1,"Avni Rexhepi",false));
			l.add(new OrariLenda(3,1,1,1,"Bazat e Elektroteknikes",2,3,2,1,"Luan Ahma","Enver Hamiti",true));
			l.add(new OrariLenda(45,1,1,1,"Bazat e Elektroteknikes",3,2,2,1,"Vjosa Shatri","Mimoza Ibrani",true));
			l.add(new OrariLenda(4,1,1,1,"Gjuhë Angleze",3,5,2,1,"Vjollca Belegu","Gazmend Pula",true));
			l.add(new OrariLenda(72,1,1,1,"Shkathtësi Komunikuse",4,3,2,1,"Blerim Rexha",false));
			l.add(new OrariLenda(97,1,1,1,"Shkathtësi Komunikuse",4,3,2,1,"Sabrije Osmanaj",false));
			
			l.add(new OrariLenda(5,1,1,1,"Matematika 2",1,1,1,2,"Qefsere Gjonbalaj","Shqipe Lohaj",true));
			l.add(new OrariLenda(44,1,1,1,"Matematika 2",1,2,1,2,"Valdete Rexhëbeqaj-Hamiti","Marjan Dema",true));
			l.add(new OrariLenda(6,1,1,1,"Fizika 2",1,5,1,2,"Skender Ahmetaj",true));
			l.add(new OrariLenda(7,1,1,1,"Algoritmet dhe strukturat e te dhenave",2,5,1,2,"Kadri Sylejmani","Avni Rexhepi",false));
			l.add(new OrariLenda(8,1,1,1,"Qarqet Elektrike",3,5,1,2,"Enver  Hamiti","Vjosa Shatri",true));
			l.add(new OrariLenda(9,1,1,1,"Qarqet Digjitale",4,5,1,2,"Sabrije Osmanaj",false));
			
			l.add(new OrariLenda(10,1,0,0,"Matematika 3K",3,1,1,3,"Qefsere Gjonbalaj",true));
			l.add(new OrariLenda(11,1,1,1,"Elektronika",1,2,2,3,"Myzafere Limani","Milaim Zabeli",true));
			l.add(new OrariLenda(12,1,1,1,"Sinjale dhe Sisteme",3,3,2,3,"Vjosa Shatri",true));
			l.add(new OrariLenda(13,1,0,0,"Programimi i Orientuar ne Objekte",3,3,1,3,"Isak Shabani",false));
			l.add(new OrariLenda(14,1,0,0,"Interneti",2,1,2,3,"Lule Ahmedi",false));
			l.add(new OrariLenda(15,1,0,0,"Bazat e të dhënave",4,4,2,3,"Lule Ahmedi",false));
			
			l.add(new OrariLenda(16,1,0,0,"Komunikimi i Njeri Kompjuter",4,2,1,4,"Isak Shabani",false));
			l.add(new OrariLenda(17,1,0,0,"Programimi ne Internet",0,2,1,4,"Lule Ahmedi","Valon Raça",false));
			l.add(new OrariLenda(18,1,0,0,"Siguria e te dhenave",4,4,1,4,"Blerim Rexha",false));
			l.add(new OrariLenda(19,1,0,0,"Rrjetat Kompjuterike",1,3,2,4,"Blerim Rexha",false));
			l.add(new OrariLenda(20,1,1,1,"Arkitektura e Kompjutereve",2,4,2,4,"Valon Raça","Qamil  Kabashi",false));
			l.add(new OrariLenda(21,1,1,1,"Menaxhimi i Projekteve",3,1,2,4,"Sevdie Alshiqi",false));
			
			
			
			
			l.add(new OrariLenda(32,0,1,1,"Automatika",1,4,1,3,"Avni Skeja",true));
			l.add(new OrariLenda(33,0,1,1,"Matematika 3E",4,1,1,3,"Shqipe Lohaj",true));
			l.add(new OrariLenda(34,0,1,1,"Materialet Elektroteknike",3,4,2,3,"Bahri Prebreza",true));
			l.add(new OrariLenda(35,0,1,1,"Matjet Elektrike",4,2,2,3,"Bahri Prebreza",true));
			
			l.add(new OrariLenda(36,0,1,1,"Fushat dhe valet elektromagnetike",4,3,2,4,"Luan Ahma","Mimoza Ibrani",true));
			l.add(new OrariLenda(37,0,1,1,"Telekomunikacionet",4,5,1,4,"Enver Hamiti",true));
			l.add(new OrariLenda(83,0,1,1,"Komunikimet në automatikë",0,5,1,4,"Lavdim Kurtaj",false));
			l.add(new OrariLenda(38,0,1,1,"Elektroenergjetika",0,5,2,4,"Vjollca Komoni","Gani Latifi",true));
			
			l.add(new OrariLenda(40,0,1,1,"Instrumentacioni mates",3,1,1,4,"Milaim Zabeli",true));
			l.add(new OrariLenda(41,0,1,1,"Centralet Elektrike",0,5,1,4,"Nysret Avdiu",true));
			l.add(new OrariLenda(42,0,1,1,"Makinat Elektrike 1",0,5,1,4,"Vjollca Komoni",true));
			
			l.add(new OrariLenda(22,1,0,0,"Siguria ne Internet",1,3,1,5,"Blerim Rexha",false));
			l.add(new OrariLenda(23,1,1,1,"Mikroprocesorët dhe Mikrokontrollerët",2,1,1,5,"Lavdim Kurtaj",true));
			l.add(new OrariLenda(24,1,0,0,"Sistemet Operative",2,4,1,5,"Isak Shabani",false));
			l.add(new OrariLenda(25,1,0,0,"Inxhenieria Softuerike",3,2,1,5,"Isak Shabani",false));
			l.add(new OrariLenda(26,1,1,1,"Ndërmarrësi",4,3,1,5,"Sevdie Alshiqi",false));	
			l.add(new OrariLenda(55,1,0,0,"Data Mining",0,5,1,5,"Lule Ahmedi",false));
			
			l.add(new OrariLenda(27,1,0,0,"Programimi i Paisjeve Mobile",1,4,2,6,"Blerim Rexha",false));
			l.add(new OrariLenda(28,1,1,0,"Sistemet e Shperndara",2,2,2,6,"Isak Shabani",false));
			l.add(new OrariLenda(29,1,0,0,"Praktika e Rrjetave Kompjuterike",2,5,2,6,"Blerim Rexha",false));
			l.add(new OrariLenda(30,1,0,0,"Praktika Profesionale",4,1,2,6,"Kadri Sylejmani",false));
			l.add(new OrariLenda(54,1,0,0,"Bazat e Inteligjencës Artificiale",0,5,1,6,"Nysret Musliu",false));
			l.add(new OrariLenda(56,1,0,0,"Dizajni dhe Analiza e Algortimeve",0,5,1,6,"Avni Rexhepi",false));
			l.add(new OrariLenda(57,1,0,0,"ECommerce",0,5,1,6,"Kadri Sylejmani",false));
			l.add(new OrariLenda(62,1,0,0,"Modeli i te dhënave dhe gjuhete pyetesoreve",0,5,1,6,"Lule Ahmedi",false));
			l.add(new OrariLenda(85,1,0,0,"Information retrieval",0,5,1,6,"Lule Ahmedi",false));
			
			
			
		
			
			l.add(new OrariLenda(47,0,1,0,"Teoria e informacionit",0,5,1,5,"Zana Limani-Fazliu",false));
			l.add(new OrariLenda(48,0,1,0,"Transmetimi i të dhënave",0,5,2,5,"Bujar Krasniqi",false));
			l.add(new OrariLenda(50,0,1,0,"Teknologjia e Komunikimeve optike",0,5,1,5,"Milaim Zabeli",false));
			l.add(new OrariLenda(61,0,1,0,"Mbrojte rele",0,5,1,5,"Vezir Rexhepi",false));
			l.add(new OrariLenda(69,0,1,0,"Sistemet e Rregullimit Automatik",0,5,1,5,"Arben Mashkulli","Avni Skeja",false));
			l.add(new OrariLenda(75,0,1,0,"Protokolet komunikuese",0,5,1,5,"Salem Lepaja",false));
			l.add(new OrariLenda(63,0,1,0,"Përpunimi digjital i sinjaleve",0,5,1,5,"Hëna Maloku Berzati",false));
			
			l.add(new OrariLenda(66,0,1,0,"Sisteme transmetuese",0,5,1,6,"Hëna Maloku Berzati",false));
			l.add(new OrariLenda(67,0,1,0,"Sistemet digjitale të rregullimit",0,5,1,6,"Lavdim Kurtaj",false));
			l.add(new OrariLenda(68,0,1,0,"Sistemet e ndërfutura",0,5,1,6,"Astrit Ademaj",false));
			l.add(new OrariLenda(73,0,1,0,"Rrjete komunikuse",0,5,1,6,"Mimoza Ibrani",false));
			l.add(new OrariLenda(78,0,1,0,"Mikrovalët dhe antenat",0,5,1,6,"Enver  Hamiti",false));
			l.add(new OrariLenda(82,0,1,0,"Komunikime mobile",0,5,1,6,"Salem Lepaja",false));
			l.add(new OrariLenda(84,0,1,0,"Hyrje në bioelektromagnetikë",0,5,1,6,"Mimoza Ibrani",false));
			l.add(new OrariLenda(96,0,1,0,"Qarqet analoge komunikuese",0,5,1,6,"Enver  Hamiti",false));
			
			
			l.add(new OrariLenda(51,0,0,1,"Stabilimentet elektroenergjetike",0,5,1,5,"Gazmend Pula",false));
			l.add(new OrariLenda(53,0,0,1,"Bartja dhe shpërndarja e energjisë elektrike",0,5,1,5,"Gazmend Pula",false));
			l.add(new OrariLenda(58,0,0,1,"Elektronika energjetike",0,5,1,5,"Sabrije Osmanaj",false));
			l.add(new OrariLenda(59,0,0,1,"Elektronika digjitale",0,5,1,5,"Sabrije Osmanaj",false));
			l.add(new OrariLenda(70,0,0,1,"Sensorët dhe aktuatorët",0,5,1,5,"Qamil  Kabashi",false));
			l.add(new OrariLenda(77,0,0,1,"Optoelektronika",0,5,1,5,"Milaim Zabeli","Nebi Caka",false));
			l.add(new OrariLenda(80,0,0,1,"Modelimi dhe simulimi",0,5,1,5,"Milaim Zabeli",false));
			l.add(new OrariLenda(87,0,0,1,"Instrumentacioni matës dhe DAQ.",0,5,1,5,"Qamil Kabashi",false));
			l.add(new OrariLenda(89,0,0,1,"Aplikacionet softuerike ne elektroenergjetike",0,5,1,5,"Vezir Rexhepi",false));
			l.add(new OrariLenda(91,0,0,1,"Bazat e robotikës",0,5,1,5,"Lavdim Kurtaj",false));
			l.add(new OrariLenda(94,0,0,1,"Mikroelektronika",0,5,1,5,"Milaim Zabeli",false));
			
			
			l.add(new OrariLenda(60,0,0,1,"Makinat elektrike speciale",0,5,1,6,"Bahri Prebreza",false));
			l.add(new OrariLenda(64,0,0,1,"Tregu i energjisë elektrike",0,5,1,6,"Bahri Prebreza",false));
			l.add(new OrariLenda(65,0,0,1,"Sisteme komutuese",0,5,1,6,"Bujar Krasniqi",false));
			l.add(new OrariLenda(71,0,0,1,"Sensorët e mençur",0,5,1,6,"Qamil  Kabashi",false));
			l.add(new OrariLenda(74,0,0,1,"Projektimi i sistemeve elektronike me kompjutere",0,5,1,6,"Milaim Zabeli",false));
			l.add(new OrariLenda(76,0,0,1,"Ngasje elektrike",0,5,1,6,"Nysret Avdiu",false));
			l.add(new OrariLenda(81,0,0,1,"Komponentet Elektronike",0,5,1,6,"Milaim Zabeli",false));
			l.add(new OrariLenda(86,0,0,1,"Instalimet elektrike dhe rrjetet e tensionit të ulët",0,5,1,6,"Arben Gjukaj",false));
			l.add(new OrariLenda(88,0,0,1,"Aktuatorët e mençur dhe ngasjet",0,5,1,6,"Lavdim Kurtaj",false));
			l.add(new OrariLenda(90,0,0,1,"Automatizimi i objekteve të banimit",0,5,1,6,"Lavdim Kurtaj",false));
			l.add(new OrariLenda(92,0,0,1,"Burimet e energjisë së ripërtëritshme",0,5,1,6,"Nysret Avdiu",false));
			l.add(new OrariLenda(93,0,0,1,"Dirigjuesit e programueshëm logjik",0,5,1,6,"Qamil  Kabashi",false));
			
			
			
	
			
			
		
			
			
			
			
			
			

			return l;
			
			}public void PrimeOrari() {
				
				OrariLenda o=new OrariLenda();
				Territori t=new Territori();
			    List<OrariLenda> orariInicial=o.OrariFillestarV2();
			    List<OrariLenda> primeorari=new ArrayList<OrariLenda>();

			    List<Territori> diell=t.Space();
			    int size = 20;
			    ArrayList<Integer> list = new ArrayList<Integer>(size);
		        for(int i = 0; i < size; i++) {
		            list.add(i);
		        }
		        for(int i=0;i<orariInicial.size();i++) {
			    	
		        if(orariInicial.get(i).getSemestri()==1) {
	    			
		    		for(int j=0;j<diell.size();j++) {
		    			Random rng = new Random(); // Ideally just create one instance globally
		    			// Note: use LinkedHashSet to maintain insertion order
		    			Set<Integer> generated = new LinkedHashSet<Integer>();
		    			while (generated.size() < 5)
		    			{
		    			    Integer next = rng.nextInt(20) + 1;
		    			    // As we're adding to a set, this will automatically do a containment check 
		    			    generated.add(next);
		    			}
				    	}
		    		 
				    }
	    		}
			    	
			    
			       
			   for(int k=0;k<orariInicial.size();k++) {
				   System.out.println(orariInicial.get(k).getLenda()+" "+orariInicial.get(k).getJava()+" "+orariInicial.get(k).getDita()+" "+orariInicial.get(k).getPerioda());
			   }
			    
			    }
			public void primare(List<Territori> diell) {
				Provim p=new Provim();
				ArrayList<Provim> provimet =p.ProvimidheFleteparaqitjet();
				if(provimet.get(0).getAfati().equals("Afati i janarit")) {
					for(int i=0;i<diell.size();i++) {
						if(diell.get(i).getJava()==3 && diell.get(i).getDita()==4 && diell.get(i).getPerioda()==1) {
							diell.remove(i);
						}
						if(diell.get(i).getJava()==1 && diell.get(i).getDita()==2 && diell.get(i).getPerioda()==2) {
							diell.remove(i);
						}
						if(diell.get(i).getJava()==3 && diell.get(i).getDita()==3 && diell.get(i).getPerioda()==2) {
							diell.remove(i);
						}
						if(diell.get(i).getJava()==3 && diell.get(i).getDita()==5 && diell.get(i).getPerioda()==2) {
							diell.remove(i);
						}if(diell.get(i).getJava()==1 && diell.get(i).getDita()==1 && diell.get(i).getPerioda()==2) {
							diell.remove(i);
						}
					}
					//diell.remove(13);
					//diell.remove(21);
					//diell.remove(32);
					
				}else if(provimet.get(0).getAfati().equals("Afati i qershorit")) {
					for(int i=0;i<diell.size();i++) {
						if(diell.get(i).getJava()==1 && diell.get(i).getDita()==5 && diell.get(i).getPerioda()==1) {
							diell.remove(i);
						}
						if(diell.get(i).getJava()==1 && diell.get(i).getDita()==2 && diell.get(i).getPerioda()==2) {
							diell.remove(i);
						}
						if(diell.get(i).getJava()==3 && diell.get(i).getDita()==3 && diell.get(i).getPerioda()==2) {
							diell.remove(i);
						}
					}
					//diell.remove(13);
					//diell.remove(21);
					//diell.remove(32);
					
				}
			}
			
			    
			
		public List<OrariLenda> OrariPerfundumtar() {
			OrariLenda o=new OrariLenda();
			Territori t=new Territori();
		    List<OrariLenda> orariInicial=o.OrariFillestarV2();
		    
		    for(int i=0;i<orariInicial.size();i++) {
		    	if(orariInicial.get(i).getJava()==0) {
		    		List<Territori> hijetProf=t.SemaforiProfesori(orariInicial,orariInicial.get(i).getProfesori(),orariInicial.get(i).getProfesori2(),orariInicial.get(i).getProfesori3(),orariInicial.get(i).getProfesori4());
		    		if(orariInicial.get(i).getSemestri()==1) {
		    		List<Territori> hijet=t.Semafori(1, orariInicial,1,1,1);
		    		List<Territori> diell = t.Dielli(hijet,hijetProf);
		    		for(int j=0;j<diell.size();j++) {
				    	if(diell.get(j).isOkupimi()==false) {
				    	Random rand = new Random();
					    int n=rand.nextInt(diell.size());
					   
				    	orariInicial.get(i).setJava(diell.get(n).getJava());
				    	orariInicial.get(i).setDita(diell.get(n).getDita());
				    	orariInicial.get(i).setPerioda(diell.get(n).getPerioda());
				    	diell.get(j).setOkupimi(true);
					   	
				    
				    	}
				    }
		    		}else if(orariInicial.get(i).getSemestri()==2) {
		    			List<Territori> hijet=t.Semafori(2, orariInicial,1,1,1);
			    		List<Territori> diell2 = t.Dielli(hijet,hijetProf);
			    		for(int j=0;j<diell2.size();j++) {
					    	if(diell2.get(j).isOkupimi()==false) {
					    	Random rand = new Random();
						    int n=rand.nextInt(diell2.size());
					    	orariInicial.get(i).setJava(diell2.get(n).getJava());
					    	orariInicial.get(i).setDita(diell2.get(n).getDita());
					    	orariInicial.get(i).setPerioda(diell2.get(n).getPerioda());
					    	diell2.get(j).setOkupimi(true);
					    
					    	}
					    }
		    		}else if(orariInicial.get(i).getSemestri()==3) {
		    			if(orariInicial.get(i).getDrejtimi1()==1 && orariInicial.get(i).getDrejtimi2()==1&& orariInicial.get(i).getDrejtimi3()==1) {
		    			List<Territori> hijet=t.Semafori(3, orariInicial,1,1,1);
			    		List<Territori> diell3 = t.Dielli(hijet,hijetProf);
			    		for(int j=0;j<diell3.size();j++) {
					    	if(diell3.get(j).isOkupimi()==false) {
					    	Random rand = new Random();
						    int n=rand.nextInt(diell3.size());
						    
					    	orariInicial.get(i).setJava(diell3.get(n).getJava());
					    	orariInicial.get(i).setDita(diell3.get(n).getDita());
					    	orariInicial.get(i).setPerioda(diell3.get(n).getPerioda());
					    	diell3.get(j).setOkupimi(true);
						    
					    
					    	}
					    }
		    		} else if(orariInicial.get(i).getDrejtimi1()==1 && orariInicial.get(i).getDrejtimi2()==0&& orariInicial.get(i).getDrejtimi3()==0) {
		    			List<Territori> hijet=t.Semafori(3, orariInicial,1,1,1);
		    			List<Territori> hijet1=t.Semafori(3, orariInicial,1,0,0);
			    		List<Territori> diell3 = t.DielliEklipsi(hijet,hijetProf,hijet1);
			    		for(int j=0;j<diell3.size();j++) {
					    	if(diell3.get(j).isOkupimi()==false) {
					    	Random rand = new Random();
						    int n=rand.nextInt(diell3.size());
						    
					    	orariInicial.get(i).setJava(diell3.get(n).getJava());
					    	orariInicial.get(i).setDita(diell3.get(n).getDita());
					    	orariInicial.get(i).setPerioda(diell3.get(n).getPerioda());
					    	diell3.get(j).setOkupimi(true);
						    
					    
					    	}
					    }
		    		}else if(orariInicial.get(i).getDrejtimi1()==0 && orariInicial.get(i).getDrejtimi2()==1&& orariInicial.get(i).getDrejtimi3()==1) {
		    			List<Territori> hijet=t.Semafori(3, orariInicial,1,1,1);
		    			List<Territori> hijet1=t.Semafori(3, orariInicial,0,1,1);
			    		List<Territori> diell3 = t.DielliEklipsi(hijet,hijetProf,hijet1);
			    		for(int j=0;j<diell3.size();j++) {
					    	if(diell3.get(j).isOkupimi()==false) {
					    	Random rand = new Random();
						    int n=rand.nextInt(diell3.size());
						    
					    	orariInicial.get(i).setJava(diell3.get(n).getJava());
					    	orariInicial.get(i).setDita(diell3.get(n).getDita());
					    	orariInicial.get(i).setPerioda(diell3.get(n).getPerioda());
					    	diell3.get(j).setOkupimi(true);
						    
					    
					    	}
					    }
		    		}
		    		}else if(orariInicial.get(i).getSemestri()==4) {
		    			if(orariInicial.get(i).getDrejtimi1()==1 && orariInicial.get(i).getDrejtimi2()==1&& orariInicial.get(i).getDrejtimi3()==1) {
		    				
		    			List<Territori> hijet=t.Semafori(4, orariInicial,1,1,1);
			    		List<Territori> diell4 = t.Dielli(hijet,hijetProf);
			    		for(int j=0;j<diell4.size();j++) {
					    	if(diell4.get(j).isOkupimi()==false) {
					    	Random rand = new Random();
						    int n=rand.nextInt(diell4.size());
					    	orariInicial.get(i).setJava(diell4.get(n).getJava());
					    	orariInicial.get(i).setDita(diell4.get(n).getDita());
					    	orariInicial.get(i).setPerioda(diell4.get(n).getPerioda());
					    	diell4.get(j).setOkupimi(true);
					    
					    	}
					    }
		    		} else if(orariInicial.get(i).getDrejtimi1()==1 && orariInicial.get(i).getDrejtimi2()==0&& orariInicial.get(i).getDrejtimi3()==0) {
		    			List<Territori> hijet=t.Semafori(4, orariInicial,1,1,1);
		    			List<Territori> hijet1=t.Semafori(4, orariInicial,1,0,0);
			    		List<Territori> diell4 = t.DielliEklipsi(hijet,hijetProf,hijet1);
			    		for(int j=0;j<diell4.size();j++) {
					    	if(diell4.get(j).isOkupimi()==false) {
					    	Random rand = new Random();
						    int n=rand.nextInt(diell4.size());
					    	orariInicial.get(i).setJava(diell4.get(n).getJava());
					    	orariInicial.get(i).setDita(diell4.get(n).getDita());
					    	orariInicial.get(i).setPerioda(diell4.get(n).getPerioda());
					    	diell4.get(j).setOkupimi(true);
					    
					    	}
					    }
		    		} else if(orariInicial.get(i).getDrejtimi1()==0 && orariInicial.get(i).getDrejtimi2()==1&& orariInicial.get(i).getDrejtimi3()==1) {
		    			List<Territori> hijet=t.Semafori(4, orariInicial,1,1,1);
		    			List<Territori> hijet1=t.Semafori(4, orariInicial,0,1,1);
			    		List<Territori> diell4 = t.DielliEklipsi(hijet,hijetProf,hijet1);
			    		
			    		for(int j=0;j<diell4.size();j++) {
					    	if(diell4.get(j).isOkupimi()==false) {
					    	Random rand = new Random();
						    int n=rand.nextInt(diell4.size());
					    	orariInicial.get(i).setJava(diell4.get(n).getJava());
					    	orariInicial.get(i).setDita(diell4.get(n).getDita());
					    	orariInicial.get(i).setPerioda(diell4.get(n).getPerioda());
					    	diell4.get(j).setOkupimi(true);
					    
					    	}
					    }
		    		} 
		    		}
		    		else if(orariInicial.get(i).getSemestri()==5) {
		    			if(orariInicial.get(i).getDrejtimi1()==1 && orariInicial.get(i).getDrejtimi2()==1&& orariInicial.get(i).getDrejtimi3()==1) {
		    			List<Territori> hijet=t.Semafori(5, orariInicial,1,1,1);
			    		List<Territori> diell5 = t.Dielli(hijet,hijetProf);
			    		primare(diell5);
			    		
			    		for(int j=0;j<diell5.size();j++) {
					    	if(diell5.get(j).isOkupimi()==false) {
					    	Random rand = new Random();
						    int n=rand.nextInt(diell5.size());
						    
					    	orariInicial.get(i).setJava(diell5.get(n).getJava());
					    	orariInicial.get(i).setDita(diell5.get(n).getDita());
					    	orariInicial.get(i).setPerioda(diell5.get(n).getPerioda());
					    	diell5.get(j).setOkupimi(true);
						    
					    	}
			    		}
					    }else if(orariInicial.get(i).getDrejtimi1()==1 && orariInicial.get(i).getDrejtimi2()==0&& orariInicial.get(i).getDrejtimi3()==0) {
					    	List<Territori> hijet=t.Semafori(5, orariInicial,1,1,1);
			    			List<Territori> hijet1=t.Semafori(5, orariInicial,1,0,0);
				    		List<Territori> diell5 = t.DielliEklipsi(hijet,hijetProf,hijet1);
				    	//	primare(diell5);
				    		primare(diell5);
				    		
				    		
				    		for(int j=0;j<diell5.size();j++) {
						    	if(diell5.get(j).isOkupimi()==false) {
						    	Random rand = new Random();
							    int n=rand.nextInt(diell5.size());
							    
						    	orariInicial.get(i).setJava(diell5.get(n).getJava());
						    	orariInicial.get(i).setDita(diell5.get(n).getDita());
						    	orariInicial.get(i).setPerioda(diell5.get(n).getPerioda());
						    	diell5.get(j).setOkupimi(true);
							    
						    	}
				    		}
						    }else if(orariInicial.get(i).getDrejtimi1()==0 && orariInicial.get(i).getDrejtimi2()==1&& orariInicial.get(i).getDrejtimi3()==0) {
				    			List<Territori> hijet=t.Semafori(5, orariInicial,0,1,0);
					    		List<Territori> diell5 = t.Dielli(hijet,hijetProf);
					    		primare(diell5);
					    		
					    		
					    		for(int j=0;j<diell5.size();j++) {
							    	if(diell5.get(j).isOkupimi()==false) {
							    	Random rand = new Random();
								    int n=rand.nextInt(diell5.size());
								    
							    	orariInicial.get(i).setJava(diell5.get(n).getJava());
							    	orariInicial.get(i).setDita(diell5.get(n).getDita());
							    	orariInicial.get(i).setPerioda(diell5.get(n).getPerioda());
							    	diell5.get(j).setOkupimi(true);
								    
							    	}
					    		}
							    }
						    else if(orariInicial.get(i).getDrejtimi1()==0 && orariInicial.get(i).getDrejtimi2()==0&& orariInicial.get(i).getDrejtimi3()==1) {
				    			List<Territori> hijet=t.Semafori(5, orariInicial,0,0,1);
					    		List<Territori> diell5 = t.Dielli(hijet,hijetProf);
					    		primare(diell5);
					    		for(int j=0;j<diell5.size();j++) {
							    	if(diell5.get(j).isOkupimi()==false) {
							    	Random rand = new Random();
								    int n=rand.nextInt(diell5.size());
								    
							    	orariInicial.get(i).setJava(diell5.get(n).getJava());
							    	orariInicial.get(i).setDita(diell5.get(n).getDita());
							    	orariInicial.get(i).setPerioda(diell5.get(n).getPerioda());
							    	diell5.get(j).setOkupimi(true);
								    
							    	}
					    		}
							    }
		    		}else if(orariInicial.get(i).getSemestri()==6) {
		    			if(orariInicial.get(i).getDrejtimi1()==1 && orariInicial.get(i).getDrejtimi2()==0&& orariInicial.get(i).getDrejtimi3()==0) {
		    			List<Territori> hijet=t.Semafori(6, orariInicial,1,0,0);
			    		List<Territori> diell6 = t.Dielli(hijet,hijetProf);
			    		primare(diell6);
			    		for(int j=0;j<diell6.size();j++) {
					    	if(diell6.get(j).isOkupimi()==false) {
					    	Random rand = new Random();
						    int n=rand.nextInt(diell6.size());
					    	orariInicial.get(i).setJava(diell6.get(n).getJava());
					    	orariInicial.get(i).setDita(diell6.get(n).getDita());
					    	orariInicial.get(i).setPerioda(diell6.get(n).getPerioda());
					    	diell6.get(j).setOkupimi(true);
					    
					    	}
					    }
		    			}else if(orariInicial.get(i).getDrejtimi1()==0 && orariInicial.get(i).getDrejtimi2()==1&& orariInicial.get(i).getDrejtimi3()==0) {
			    			List<Territori> hijet=t.Semafori(6, orariInicial,0,1,0);
				    		List<Territori> diell6 = t.Dielli(hijet,hijetProf);
				    		primare(diell6);
				    		for(int j=0;j<diell6.size();j++) {
						    	if(diell6.get(j).isOkupimi()==false) {
						    	Random rand = new Random();
							    int n=rand.nextInt(diell6.size());
						    	orariInicial.get(i).setJava(diell6.get(n).getJava());
						    	orariInicial.get(i).setDita(diell6.get(n).getDita());
						    	orariInicial.get(i).setPerioda(diell6.get(n).getPerioda());
						    	diell6.get(j).setOkupimi(true);
						    
						    	}
						    }
			    			}else if(orariInicial.get(i).getDrejtimi1()==0 && orariInicial.get(i).getDrejtimi2()==0&& orariInicial.get(i).getDrejtimi3()==1) {
				    			List<Territori> hijet=t.Semafori(6, orariInicial,0,0,1);
					    		List<Territori> diell6 = t.Dielli(hijet,hijetProf);
					    		primare(diell6);
					    		for(int j=0;j<diell6.size();j++) {
							    	if(diell6.get(j).isOkupimi()==false) {
							    	Random rand = new Random();
								    int n=rand.nextInt(diell6.size());
							    	orariInicial.get(i).setJava(diell6.get(n).getJava());
							    	orariInicial.get(i).setDita(diell6.get(n).getDita());
							    	orariInicial.get(i).setPerioda(diell6.get(n).getPerioda());
							    	diell6.get(j).setOkupimi(true);
							    
							    	}
							    }
				    			}
		    		}
		    		/*List<Territori> hijetProf=t.SemaforiProfesori(orariInicial,orariInicial.get(i).getProfesori());
				    List<Territori> diell = t.Dielli(hijet,hijetProf);
				    
				    for(int j=0;j<diell.size();j++) {
				    	if(diell.get(j).isOkupimi()==false) {
				    	Random rand = new Random();
					    int n=rand.nextInt(diell.size());
				    	orariInicial.get(i).setJava(diell.get(n).getJava());
				    	orariInicial.get(i).setDita(diell.get(n).getDita());
				    	orariInicial.get(i).setPerioda(diell.get(n).getPerioda());
				    	diell.get(j).setOkupimi(true);
				    
				    	}
				    }
				    */
				    
		    		
		    	}
		    }
		    
			return orariInicial;
			
			/*for(int i=0;i<orariInicial.size();i++) {
				System.out.println(orariInicial.get(i).getLenda()+" "+orariInicial.get(i).getJava()+" "+orariInicial.get(i).getDita()+" "+orariInicial.get(i).getPerioda());
			}*/	
		}
		
		public List BufferOrari() {
			List<OrariLenda> bl = new ArrayList<OrariLenda>();
			return bl;
		}
		
		
			
		
			
			
			
		
		
}
		

	

