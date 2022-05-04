package tema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableScore extends Territori{
	private int PrimaryScore;

	public int getPrimaryScore() {
		return PrimaryScore;
	}

	public void setPrimaryScore(int primaryScore) {
		PrimaryScore = primaryScore;
	}

	public TableScore(int primaryScore) {
		
		PrimaryScore = primaryScore;
	}

	public TableScore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TableScore(int j, int d, int p, int s,boolean redLight, boolean orangeLight, boolean greenLight,int sc) {
		super(j, d, p); 
		
		semestri=s;
		RedLight = redLight;
		OrangeLight = orangeLight;
		GreenLight = greenLight;
		PrimaryScore=sc;
	}

	public TableScore(boolean redLight, boolean orangeLight, boolean greenLight) {
		super(redLight, orangeLight, greenLight);
		// TODO Auto-generated constructor stub
	}

	public TableScore(int j, int d, int p, boolean o) {
		super(j, d, p, o);
		// TODO Auto-generated constructor stub
	}
	public TableScore(int j, int d, int p, int score) {
		super(j, d, p);
		PrimaryScore=score;
		// TODO Auto-generated constructor stub
	}
	public TableScore(int j, int d, int p, int s, boolean redLight, boolean orangeLight, boolean greenLight) {
		super(j, d, p, s, redLight, orangeLight, greenLight);
		// TODO Auto-generated constructor stub
	}

	public TableScore(int j, int d, int p) {
		super(j, d, p);
		// TODO Auto-generated constructor stub
	}

	public TableScore(int j, int d) {
		super(j, d);
		// TODO Auto-generated constructor stub
	}

	public TableScore(int i, String l, int j, int d, int p, int s) {
		super(i, l, j, d, p, s);
		// TODO Auto-generated constructor stub
	}
	
	public List<TableScore> scoretable(int java,int dita,int perioda,List<OrariLenda> x) {
		int score = 0;
		OrariLenda o=new OrariLenda();
		List<OrariLenda> orari =x;
		List<OrariLenda> orarimesem =new ArrayList<OrariLenda>();
		List<TableScore> table = new ArrayList<TableScore>();
	//	Provim p = new Provim();
	//	ArrayList<Provim> provimet =p.ProvimidheFleteparaqitjet();
		for(int i=0;i<orari.size();i++) {
			if(orari.get(i).getJava()==java&& orari.get(i).getDita()==dita && orari.get(i).getPerioda()==perioda) {
				
				if(orari.get(i).getSemestri()==1||orari.get(i).getSemestri()==3||orari.get(i).getSemestri()==5)
				{
					score++;
				}
				
				
			
				
			}
			
		}
		table.add(new TableScore(java,dita,perioda,score));
		
			return table;
		
	}
	public List<TableScore> WholeScoreTable(List<OrariLenda> x) {
		
		List<TableScore> wholetable = new ArrayList<TableScore>();
		
		wholetable.addAll(scoretable(1,1,1,x));
		wholetable.addAll(scoretable(1,2,1,x));
		wholetable.addAll(scoretable(1,3,1,x));
		wholetable.addAll(scoretable(1,4,1,x));
		wholetable.addAll(scoretable(1,5,1,x));
		wholetable.addAll(scoretable(2,1,1,x));
		wholetable.addAll(scoretable(2,2,1,x));
		wholetable.addAll(scoretable(2,3,1,x));
		wholetable.addAll(scoretable(2,4,1,x));
		wholetable.addAll(scoretable(2,5,1,x));
		wholetable.addAll(scoretable(3,1,1,x));
		wholetable.addAll(scoretable(3,2,1,x));
		wholetable.addAll(scoretable(3,3,1,x));
		wholetable.addAll(scoretable(3,4,1,x));
		wholetable.addAll(scoretable(3,5,1,x));
		wholetable.addAll(scoretable(4,1,1,x));
		wholetable.addAll(scoretable(4,2,1,x));
		wholetable.addAll(scoretable(4,3,1,x));
		wholetable.addAll(scoretable(4,4,1,x));
		wholetable.addAll(scoretable(4,5,1,x));
		
		
		return wholetable;
	}
	public List<TableScore> ExtractfromTable(List<OrariLenda> x) {
		OrariLenda o=new OrariLenda();
		Territori t=new Territori();
		TableScore tb=new TableScore();
		List<TableScore> scoretable = tb.WholeScoreTable(x);
		List<TableScore> filtertable=new ArrayList<TableScore>();
		for(int i=0;i<scoretable.size();i++) {
			if(scoretable.get(i).getPrimaryScore()>2) {
				filtertable.add(new TableScore(scoretable.get(i).getJava(),scoretable.get(i).getDita(),scoretable.get(i).getPerioda(),scoretable.get(i).getPrimaryScore()));
			}
		}
		 return filtertable;
	
		
		
	}
	public List MakeZero(List<OrariLenda> orari,List<TableScore> TableFilter) {
		
		List<OrariLenda> oraret=orari;
		List<TableScore> filtertable = TableFilter;
		List<OrariLenda> orarizero=new ArrayList<OrariLenda>();
		
		int start=oraret.size()-1;
		for(int i=0;i<filtertable.size();i++) {
			for(int j=start;j>=0;j--) {
				if(filtertable.get(i).getJava()==oraret.get(j).getJava()&&filtertable.get(i).getDita()==oraret.get(j).getDita()) 
				{
					if(oraret.get(j).getSemestri()==1||oraret.get(j).getSemestri()==3||oraret.get(j).getSemestri()==5)
					{
						orarizero.add(oraret.get(j));
					//System.out.println(oraret.get(j).getLenda());
					break;
					}
					
					
				}	
					
				
			}
		}
		return orarizero;
		
	}
	public List<OrariLenda> finalTable(List<OrariLenda> ExtractOrari,List<OrariLenda> Orari) {
		OrariLenda o=new OrariLenda();
		Territori t=new Territori();
		TableScore tb=new TableScore();
		List<OrariLenda> orariExtract=ExtractOrari;
		List<OrariLenda> orari=Orari;
		List<TableScore> wholescore=tb.WholeScoreTable(Orari);
		List<OrariLenda> returnorari=new ArrayList<OrariLenda>();
		List<OrariLenda> reminderorari=new ArrayList<OrariLenda>();
		for(int i=0;i<orariExtract.size();i++) {
			for(int j=0;j<orari.size();j++) { 
				if(orariExtract.get(i).getId()==orari.get(j).getId())
				{   reminderorari.add(new OrariLenda(orari.get(j).getId(),orari.get(j).getLenda(),orari.get(j).getJava(),orari.get(j).getDita(),orari.get(j).getPerioda()));
					
					
				}
			}
		}
		
		for(int i=0;i<orariExtract.size();i++) {
			for(int j=0;j<orari.size();j++) { 
				if(orariExtract.get(i).getId()==orari.get(j).getId())
				{   //reminderorari.add(orari.get(j));
					orari.get(j).setDita(0);
					orari.get(j).setPerioda(0);
					
				}
			}
		}
		for(int i=0;i<orari.size();i++) 
		{
			if(orari.get(i).getDita()==0 && orari.get(i).getJava()==1)
			{
				for(int j=0;j<wholescore.size();j++)
				{
					if(wholescore.get(j).getPrimaryScore()==0 && wholescore.get(j).getJava()==1)
					{
						orari.get(i).setDita(wholescore.get(j).getDita());
						orari.get(i).setPerioda(wholescore.get(j).getPerioda());
						//System.out.println(orari.get(i).getJava()+" "+orari.get(i).getDita()+" "+orari.get(i).getPerioda());
						wholescore.get(j).setPrimaryScore(1);
						break;
					}
				}
			} 
			else if(orari.get(i).getDita()==0 && orari.get(i).getJava()==2)
			{
				for(int j=0;j<wholescore.size();j++)
				{
					if(wholescore.get(j).getPrimaryScore()==0 && wholescore.get(j).getJava()==2)
					{
						orari.get(i).setDita(wholescore.get(j).getDita());
						orari.get(i).setPerioda(wholescore.get(j).getPerioda());
						//System.out.println(orari.get(i).getJava()+" "+orari.get(i).getDita()+" "+orari.get(i).getPerioda());
						wholescore.get(j).setPrimaryScore(1);
						break;
					}
				}
			} 
			else if(orari.get(i).getDita()==0 && orari.get(i).getJava()==3)
			{
				for(int j=0;j<wholescore.size();j++)
				{
					if(wholescore.get(j).getPrimaryScore()==0 && wholescore.get(j).getJava()==3)
					{
						orari.get(i).setDita(wholescore.get(j).getDita());
						orari.get(i).setPerioda(wholescore.get(j).getPerioda());
						//System.out.println(orari.get(i).getJava()+" "+orari.get(i).getDita()+" "+orari.get(i).getPerioda());
						wholescore.get(j).setPrimaryScore(1);
						break;
					}
				}
			} else if(orari.get(i).getDita()==0 && orari.get(i).getJava()==4)
			{
				for(int j=0;j<wholescore.size();j++)
				{
					if(wholescore.get(j).getPrimaryScore()==0 && wholescore.get(j).getJava()==4)
					{
						orari.get(i).setDita(wholescore.get(j).getDita());
						orari.get(i).setPerioda(wholescore.get(j).getPerioda());
						//System.out.println(orari.get(i).getJava()+" "+orari.get(i).getDita()+" "+orari.get(i).getPerioda());
						wholescore.get(j).setPrimaryScore(1);
						break;
					}
				}
			} 
			
			
			
			
			
		}
		int rrafshiJava=Tempratura(wholescore);
		
		for(int i=0;i<orari.size();i++) {
			if(orari.get(i).getDita()==0 ) {
				for(int j=0;j<wholescore.size();j++)
				{
					if(wholescore.get(j).getPrimaryScore()==0 && wholescore.get(j).getJava()==rrafshiJava)
					{   orari.get(i).setJava(rrafshiJava);
						orari.get(i).setDita(wholescore.get(j).getDita());
						orari.get(i).setPerioda(wholescore.get(j).getPerioda());
						//System.out.println(orari.get(i).getJava()+":"+orari.get(i).getDita()+" "+orari.get(i).getPerioda());
						wholescore.get(j).setPrimaryScore(1);
						break;
					}
				
			}
		}
		}
int rrafshiJava2=Tempratura(wholescore);
		
		for(int i=0;i<orari.size();i++) {
			if(orari.get(i).getDita()==0 ) {
				for(int j=0;j<wholescore.size();j++)
				{
					if(wholescore.get(j).getPrimaryScore()==0 && wholescore.get(j).getJava()==rrafshiJava2)
					{   orari.get(i).setJava(rrafshiJava2);
						orari.get(i).setDita(wholescore.get(j).getDita());
						orari.get(i).setPerioda(wholescore.get(j).getPerioda());
						//System.out.println(orari.get(i).getJava()+":"+orari.get(i).getDita()+" "+orari.get(i).getPerioda());
						wholescore.get(j).setPrimaryScore(1);
						break;
					}
				
			}
		}
		}
int rrafshiJava3=Tempratura(wholescore);
		
		for(int i=0;i<orari.size();i++) {
			if(orari.get(i).getDita()==0 ) {
				for(int j=0;j<wholescore.size();j++)
				{
					if(wholescore.get(j).getPrimaryScore()==0 && wholescore.get(j).getJava()==rrafshiJava3)
					{   orari.get(i).setJava(rrafshiJava2);
						orari.get(i).setDita(wholescore.get(j).getDita());
						orari.get(i).setPerioda(wholescore.get(j).getPerioda());
						//System.out.println(orari.get(i).getJava()+":"+orari.get(i).getDita()+" "+orari.get(i).getPerioda());
						wholescore.get(j).setPrimaryScore(1);
						break;
					}
				
			}
		}
		}
		

		
		
	
		
		
		
		//System.out.println("---------------------------------------------------------------");
		for(int j=0;j<orari.size();j++) {
			if(orari.get(j).getDita()==0) {
		for(int i=0;i<reminderorari.size();i++) {
		if(orari.get(j).getId()==reminderorari.get(i).getId()) {
			orari.get(j).setDita(reminderorari.get(i).getDita());
			orari.get(j).setDita(reminderorari.get(i).getPerioda());
			
			//System.out.println(reminderorari.get(i).getLenda()+" "+reminderorari.get(i).getJava()+" "+reminderorari.get(i).getDita()+" "+reminderorari.get(i).getPerioda());
		}
		}
		}
		}
		//System.out.println("---------------------------------------------------------------");

		for(int i=0;i<orari.size();i++) {
			//System.out.println(orari.get(i).getLenda()+" "+orari.get(i).getJava()+" "+orari.get(i).getDita());
		}
	
		return orari;

	}
	public int Tempratura(List<TableScore> wholescore) {
		
		int temperatura1=0;
		int temperatura2=0;
		int temperatura3=0;
		int temperatura4=0;
		
		int temperatura=0;
		for(int i=0;i<wholescore.size();i++) {
			if(wholescore.get(i).getJava()==1&&wholescore.get(i).getPrimaryScore()==0) {
				temperatura1=temperatura1+1;
			}else if(wholescore.get(i).getJava()==2&&wholescore.get(i).getPrimaryScore()==0) {
				temperatura2=temperatura2+1;
			}else if(wholescore.get(i).getJava()==3&&wholescore.get(i).getPrimaryScore()==0) {
				temperatura3=temperatura3+1;
			}else if(wholescore.get(i).getJava()==4&&wholescore.get(i).getPrimaryScore()==0) {
				temperatura4=temperatura4+1;
			}
		}
		int[] temperaturat = new int[] {temperatura1,temperatura2,temperatura3,temperatura4};
		int max = Arrays.stream(temperaturat).max().getAsInt();
		if(max==temperatura1)
		{
			temperatura=1;
			
		}
		else if(max==temperatura2)
		{
			temperatura=2;
		}
		else if(max==temperatura3)
		{
			
			temperatura=3;
		}
		else if(max==temperatura4)
		{
			
			temperatura=4;
		}
		
		return temperatura;
	}
	public void Percueshmeria(int semestri) {
		
	}
	
	



}
