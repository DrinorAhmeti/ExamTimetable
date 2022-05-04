package tema;

import java.util.ArrayList;
import java.util.List;

public  class OralExam extends OrariLenda
{
	int javao;
	int ditao;
	int periodao;
	public int getJavao() {
		return javao;
	}
	public void setJavao(int javao) {
		this.javao = javao;
	}
	public int getDitao() {
		return ditao;
	}
	public void setDitao(int ditao) {
		this.ditao = ditao;
	}
	public int getPeriodao() {
		return periodao;
	}
	public void setPeriodao(int periodao) {
		this.periodao = periodao;
	}
	public OralExam(String l,int javao, int ditao, int periodao) {
		super();
		lenda=l;
		this.javao = javao;
		this.ditao = ditao;
		this.periodao = periodao;
	}
	public OralExam() {
		super();
		// TODO Auto-generated constructor stu b
	}
	public OralExam(int i, String l, int j, int d, int p, int s, String prof) {
		//super(i, l, j, d, p, s, prof);
		// TODO Auto-generated constructor stub
	}
	public OralExam(int i, String l, int j, int d, int p, int s) {
		super(i, l, j, d, p, s);
		// TODO Auto-generated constructor stub
	}
	public OralExam(int i, String l, int j, int d, int p) {
		super(i, l, j, d, p);
		// TODO Auto-generated constructor stub
	}
	
	public void OralOrari() {
		OrariLenda o=new OrariLenda();
		OralExam oe=new OralExam();
		List<OralExam> oralfinal=new ArrayList<OralExam>();
		List<OrariLenda> orallist=o.OrariFillestarV2();
		int java;int dita;int perioda;
		for(int i=0;i<orallist.size();i++) {
			if(orallist.get(i).isOralexam()==true) {
				String lenda=orallist.get(i).getLenda();
				java=orallist.get(i).getJava()+1;
				dita=orallist.get(i).getDita();
				perioda=orallist.get(i).getPerioda()+1;
				oralfinal.add(new OralExam(lenda,java,dita,perioda));
			}
		}
		for(int i=0;i<oralfinal.size();i++) {
			System.out.println(oralfinal.get(i).getLenda()+" "+oralfinal.get(i).getJavao()+" "+oralfinal.get(i).getDitao()+" "+oralfinal.get(i).getPeriodao());
		}
	}

}
