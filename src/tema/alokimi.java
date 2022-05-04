package tema;

import java.util.ArrayList;
import java.util.List;

public class alokimi extends OrariLenda {
	int salla1;
	int salla2;
	int salla3;
	int salla4;
	int salla5;
	int salla6;
	int fleteparaqitjet;
	
	
	public int getFleteparaqitjet() {
		return fleteparaqitjet;
	}
	public void setFleteparaqitjet(int fleteparaqitjet) {
		this.fleteparaqitjet = fleteparaqitjet;
	}
	public int getSalla6() {
		return salla6;
	}
	public void setSalla6(int salla6) {
		this.salla6 = salla6;
	}
	public int getSalla5() {
		return salla5;
	}
	public void setSalla5(int salla5) {
		this.salla5 = salla5;
	}
	public int getSalla1() {
		return salla1;
	}
	public void setSalla1(int salla1) {
		this.salla1 = salla1;
	}
	public int getSalla2() {
		return salla2;
	}
	public void setSalla2(int salla2) {
		this.salla2 = salla2;
	}
	public int getSalla3() {
		return salla3;
	}
	public void setSalla3(int salla3) {
		this.salla3 = salla3;
	}
	public int getSalla4() {
		return salla4;
	}
	public void setSalla4(int salla4) {
		this.salla4 = salla4;
	}
	public alokimi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public alokimi(int j, int d, int p) {
		super(j, d, p);
		// TODO Auto-generated constructor stub
	}
	
	public alokimi(int i, String l, int j, int d, int p, int s,int salla1, int salla2, int salla3, int salla4) {
		super(i, l, j, d, p, s);
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
		
		
	}
	public alokimi(int i, String l, int j, int d, int p, int s,int salla1, int salla2, int salla3, int salla4,int salla5) {
		super(i, l, j, d, p, s);
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
		this.salla5 = salla5;
		
		
	}
	public alokimi(int i, String l, int j, int d, int p, int s,int salla1, int salla2, int salla3, int salla4,int salla5,int salla6) {
		super(i, l, j, d, p, s);
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
		this.salla5 = salla5;
		this.salla6 = salla6;
		 
		
	}
	public alokimi(int i, String l, int j, int d, int p, int s,int salla1, int salla2, int salla3, int salla4,int salla5,int salla6,int fleteparaqitjet) {
		super(i, l, j, d, p, s);
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
		this.salla5 = salla5;
		this.salla6 = salla6;
		this.fleteparaqitjet=fleteparaqitjet;
		 
		
	}
	public alokimi(int i, String l, String prof,int j, int d, int p, int s,int salla1, int salla2, int salla3, int salla4) {
		super(i, l, j, d, p, s);
		profesori=prof;
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
		
	}

	public alokimi(int i, String l, String prof,int j, int d, int p, int s,int salla1, int salla2, int salla3, int salla4,int salla5) {
		super(i, l, j, d, p, s);
		profesori=prof;
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
		this.salla5 = salla5;
		
		
	}
	
	public alokimi(int i, String l, String prof,int j, int d, int p, int s,int salla1, int salla2, int salla3, int salla4,int salla5,int salla6) {
		super(i, l, j, d, p, s);
		profesori=prof;
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
		this.salla5 = salla5;
		this.salla6 = salla6;
		
	}
	public alokimi(int i, String l, String prof,int j, int d, int p, int s,int salla1, int salla2, int salla3, int salla4,int salla5,int salla6,int fleteparaqitjet) {
		super(i, l, j, d, p, s);
		profesori=prof;
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
		this.salla5 = salla5;
		this.salla6 = salla6;
		this.fleteparaqitjet=fleteparaqitjet;
		
	}
	
	
	
	public alokimi(int salla1, int salla2, int salla3, int salla4) {
		super();
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
	}
	public alokimi(int salla1, int salla2, int salla3, int salla4,int salla5) {
		super();
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
		this.salla5 = salla5;
	}
	public alokimi(int salla1, int salla2, int salla3, int salla4,int salla5,int salla6) {
		super();
		this.salla1 = salla1;
		this.salla2 = salla2;
		this.salla3 = salla3;
		this.salla4 = salla4;
		this.salla5 = salla5;
		this.salla6 = salla6;
	}
	public void small(List<Rooms> x) {
		for(int i=0;i<x.size();i++) {
			if(x.get(i).getMadhesia()=='S' && x.get(i).isZene()==false) {
				
			}
		}
	}
	List<Rooms> lista=new ArrayList<Rooms>();
	Rooms SR202 =new Rooms(202,50,'S');
	Rooms SR1   =new Rooms(1,50,'S');
	Rooms SR2   =new Rooms(2,50,'S');
	Rooms MR414 =new Rooms(414,80,'M');
	Rooms MR415 =new Rooms(415,80,'M');
	Rooms MR620 =new Rooms(620,80,'M');
	
	
	Rooms LR408 =new Rooms(408,150,'L');
	
	Rooms SR636 =new Rooms(636,15,'S');
	Rooms SR616 =new Rooms(616,15,'S');
	Rooms SR615 =new Rooms(615,15,'S');
	Rooms SR745 =new Rooms(745,20,'S');
	Rooms SRA3  =new Rooms(3,20,'S');
	Rooms SR310 =new Rooms(310,20,'S');
	Rooms MR611 =new Rooms(611,30,'M');
	Rooms MR626 =new Rooms(626,30,'M');
	Rooms MR621 =new Rooms(621,30,'M');
	Rooms MR202 =new Rooms(202,30,'M');
	Rooms LR411 =new Rooms(411,80,'L');
	
	
	public List<alokimi> RoomCapacity(int java,int dita,int perioda,List<OrariLenda> x)
	{
		OrariLenda o=new OrariLenda();
		Provim p     =new Provim();
		Rooms rooms=new Rooms();
		TableScore sc=new TableScore();
		List<Rooms> dhomat=rooms.ListaSalla();
		List<alokimi> listaalokimi=new ArrayList<alokimi>();
		List<alokimi> orariDhoma=new ArrayList<alokimi>();
		 
		List<OrariLenda> listaOrareve= x;
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
		for(int i=0;i<listaId.size();i++) {
			for(int j=0;j<listaProvimeve.size();j++) 	{
				if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>0&&listaProvimeve.get(j).getNrFletparaqitjeve()<=10) 
				{
					
						
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),404,0,0,0,0));
							listaalokimi.add(new alokimi(404,0,0,0));
						   
					   
				}
				
			else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>10&&listaProvimeve.get(j).getNrFletparaqitjeve()<=15) 
				{
					
						if(SR636.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),636,0,0,0));
							listaalokimi.add(new alokimi(636,0,0,0));
						    SR636.setZene(true);
					      }
						else if(SR616.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),616,0,0,0));
							listaalokimi.add(new alokimi(616,0,0,0));
						    SR616.setZene(true);
					      }
						else if(SR615.isZene()==false) {
								orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),615,0,0,0));
								listaalokimi.add(new alokimi(615,0,0,0));
							    SR615.setZene(true);
						  }else if(SR745.isZene()==false) {
								orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,0,0,0));
								listaalokimi.add(new alokimi(745,0,0,0));
								SR745.setZene(true);
						  }else if(SRA3.isZene()==false) {
								orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),3,0,0,0));
								listaalokimi.add(new alokimi(3,0,0,0));
								SRA3.setZene(true);
						      }
							else if(SR310.isZene()==false) {
								orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,0,0,0));
								listaalokimi.add(new alokimi(310,0,0,0));
								SR310.setZene(true);
							  }else {		
			                        orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));
                                     }
				}
				else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>15&&listaProvimeve.get(j).getNrFletparaqitjeve()<=20)
				{
					
					if(SR745.isZene()==false) {
						orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,0,0,0));
						listaalokimi.add(new alokimi(745,0,0,0));
						SR745.setZene(true);
				      }
					else if(SRA3.isZene()==false) {
						orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),3,0,0,0));
						listaalokimi.add(new alokimi(3,0,0,0));
						SRA3.setZene(true);
				      }
					else if(SR310.isZene()==false) {
						orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,0,0,0));
						listaalokimi.add(new alokimi(310,0,0,0));
						SR310.setZene(true);
					  }else if(MR611.isZene()==false) {
							
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),611,0,0,0));
							listaalokimi.add(new alokimi(611,0,0,0));
							MR611.setZene(true);
					      }
						else if(MR626.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),626,0,0,0));
							listaalokimi.add(new alokimi(626,0,0,0));
							MR626.setZene(true);
					      }
						else if(MR621.isZene()==false) {
								orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),621,0,0,0));
								listaalokimi.add(new alokimi(621,0,0,0));
								MR621.setZene(true);
								
					      }else if(SR636.isZene()==false&&SR615.isZene()==false) {
								orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),636,615,0,0));
								listaalokimi.add(new alokimi(636,615,0,0));
								SR636.setZene(true);
								SR615.setZene(true);						
					      }else if(SR615.isZene()==false&&SR616.isZene()==false) {
								orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),615,616,0,0));
								listaalokimi.add(new alokimi(615,616,0,0));
								SR615.setZene(true);
								SR616.setZene(true);
								}else {
							  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));

					      }
					
			 }else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>20&&listaProvimeve.get(j).getNrFletparaqitjeve()<=30)
				{
					
					if(MR611.isZene()==false) {
						
						orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),611,0,0,0));
						listaalokimi.add(new alokimi(611,0,0,0));
						MR611.setZene(true);
				      }
					else if(MR626.isZene()==false) {
						orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),626,0,0,0));
						listaalokimi.add(new alokimi(626,0,0,0));
						MR626.setZene(true);
				      }
					else if(MR621.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),621,0,0,0));
							listaalokimi.add(new alokimi(621,0,0,0));
							MR621.setZene(true);
							
				      }
					else if(MR202.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),202,0,0,0));
							listaalokimi.add(new alokimi(202,0,0,0));
							MR202.setZene(true);
							
				      }else if(SR636.isZene()==false&&SR616.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),636,616,0,0));
							listaalokimi.add(new alokimi(636,616,0,0));
							SR636.setZene(true);
							SR616.setZene(true);						
				      }else if(SR636.isZene()==false&&SR615.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),636,615,0,0));
							listaalokimi.add(new alokimi(636,615,0,0));
							SR636.setZene(true);
							SR615.setZene(true);						
				      }else if(SR615.isZene()==false&&SR616.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),615,616,0,0));
							listaalokimi.add(new alokimi(615,616,0,0));
							SR615.setZene(true);
							SR616.setZene(true);						
				      }else if(SR745.isZene()==false&&SR616.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,616,0,0));
							listaalokimi.add(new alokimi(745,616,0,0));
							SR745.setZene(true);
							SR616.setZene(true);						
				      }else if(SR745.isZene()==false&&SR636.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,636,0,0));
							listaalokimi.add(new alokimi(745,636,0,0));
							SR745.setZene(true);
							SR636.setZene(true);						
				      }else if(SR310.isZene()==false&&SR636.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,636,0,0));
							listaalokimi.add(new alokimi(310,636,0,0));
							SR310.setZene(true);
							SR636.setZene(true);						
				      }else if(SR310.isZene()==false&&SR616.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,616,0,0));
							listaalokimi.add(new alokimi(310,616,0,0));
							SR310.setZene(true);
							SR616.setZene(true);						
				      }else if(SR202.isZene()==false&&SR615.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),202,615,0,0));
							listaalokimi.add(new alokimi(202,615,0,0));
							SR202.setZene(true);
							SR615.setZene(true);						
				      }else if(SRA3.isZene()==false&&SR615.isZene()==false) {
							orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),3,615,0,0));
							listaalokimi.add(new alokimi(3,615,0,0));
							SRA3.setZene(true);
							SR615.setZene(true);						
				      }else {
						  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));

				      }
				      
					
					
			 }
			 else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>30&&listaProvimeve.get(j).getNrFletparaqitjeve()<=40) 
			     {  
				 if(SR745.isZene()==false&&SRA3.isZene()==false) {
					   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,0,0));
						listaalokimi.add(new alokimi(745,3,0,0));
						SR745.setZene(true);
						SRA3.setZene(true);
			      }
			      else if(SR745.isZene()==false&&SR310.isZene()==false) {
			    	  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,310,0,0));
						listaalokimi.add(new alokimi(745,310,0,0));
						SR745.setZene(true);
						SR310.setZene(true);
				      }
			      else if(SRA3.isZene()==false&&SR310.isZene()==false) {
			    	  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),3,310,0,0));
						listaalokimi.add(new alokimi(3,310,0,0));
						SRA3.setZene(true);
						SR310.setZene(true);
					      
			      }
			      else if(SRA3.isZene()==false&&SR636.isZene()==false) {
			    	  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),3,636,0,0));
						listaalokimi.add(new alokimi(3,636,0,0));
						SRA3.setZene(true);
						SR636.setZene(true);
					      
			      }else if(SRA3.isZene()==false&&SR616.isZene()==false) {
			    	  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),3,636,0,0));
						listaalokimi.add(new alokimi(3,616,0,0));
						SRA3.setZene(true);
						SR616.setZene(true);
					      
			      }
			      else if(SR310.isZene()==false&&SR616.isZene()==false) {
			    	  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,616,0,0));
						listaalokimi.add(new alokimi(310,616,0,0));
						SR310.setZene(true);
						SR616.setZene(true);
					      
			      } else if(SR310.isZene()==false&&SR615.isZene()==false) {
			    	  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,616,0,0));
						listaalokimi.add(new alokimi(310,615,0,0));
						SR310.setZene(true);
						SR615.setZene(true);
					      
			      }
			      else if(SR745.isZene()==false&&SR615.isZene()==false) {
			    	  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,615,0,0));
						listaalokimi.add(new alokimi(745,615,0,0));
						SR745.setZene(true);
						SR615.setZene(true);
					      
			      }else {
					  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));

			      }
			    
				 
				 
			 }
			 else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>40&&listaProvimeve.get(j).getNrFletparaqitjeve()<=50) 
		     { 
				 if(SR310.isZene()==false&&MR611.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,611,0,0));
					 listaalokimi.add(new alokimi(310,611,0,0));
					 SR310.setZene(true);
					 MR611.setZene(true);
				 }
				 else if(SR310.isZene()==false&&MR626.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,626,0,0));
					 listaalokimi.add(new alokimi(310,626,0,0));
			    	    SR310.setZene(true);
			    	    MR626.setZene(true);
			    	   
				 }
				 else if(SR310.isZene()==false&&MR621.isZene()==false) 
				 {
					 
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,621,0,0));
					 listaalokimi.add(new alokimi(310,621,0,0));
					 SR310.setZene(true);
					 MR621.setZene(true);
			    	    
				 }
				 else if(SR310.isZene()==false&&MR202.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,202,0,0));
					 listaalokimi.add(new alokimi(310,202,0,0));
					 SR310.setZene(true);
					 MR202.setZene(true);
			    	   
				
				 }
				 else if(SR745.isZene()==false&&MR611.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,611,0,0));
					 listaalokimi.add(new alokimi(745,611,0,0));
					 SR745.setZene(true);
					 MR611.setZene(true);
			    	   
				 }
				 
				 else if(SR745.isZene()==false&&MR626.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,626,0,0));
					 listaalokimi.add(new alokimi(745,626,0,0));
					 MR626.setZene(true);
			    	    SR745.setZene(true);
			    	   
				 }
				 else if(SR745.isZene()==false&&MR621.isZene()==false) 
				 {
					 
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,621,0,0));
					 listaalokimi.add(new alokimi(745,621,0,0));
					 MR621.setZene(true);
					 SR745.setZene(true);
			    	    
				 }
				 else if(SR745.isZene()==false&&MR202.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,202,0,0));
					 listaalokimi.add(new alokimi(745,202,0,0));
					 SR745.setZene(true);
					 MR202.setZene(true);
			    	   
				
				 }
				 else if(SRA3.isZene()==false&&MR611.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),3,611,0,0));
					 listaalokimi.add(new alokimi(3,611,0,0));
					 SRA3.setZene(true);
					 MR611.setZene(true);
			    	   
				 }
				 
				 else if(SRA3.isZene()==false&&MR626.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),3,626,0,0));
					 listaalokimi.add(new alokimi(3,626,0,0));
					 MR626.setZene(true);
					 SRA3.setZene(true);
			    	   
				 }
				 else if(SRA3.isZene()==false&&MR621.isZene()==false) 
				 {
					 
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),3,621,0,0));
					 listaalokimi.add(new alokimi(3,621,0,0));
					 MR621.setZene(true);
					 SRA3.setZene(true);
			    	    
				 }
				 else if(SRA3.isZene()==false&&SR616.isZene()==false&&SR615.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),3,616,615,0));
					 listaalokimi.add(new alokimi(3,616,615,0));
					 SRA3.setZene(true);
					 SR616.setZene(true);
					 SR616.setZene(true);
				 }
				 else if(SR745.isZene()==false&&SR616.isZene()==false&&SR615.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,616,615,0));
				 listaalokimi.add(new alokimi(745,616,615,0));
				 SR745.setZene(true);
				 SR616.setZene(true);
				 SR616.setZene(true);
			 } 
				 else if(SR310.isZene()==false&&SR616.isZene()==false&&SR615.isZene()==false) 
				 {  
				 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,616,615,0));
				 listaalokimi.add(new alokimi(310,616,615,0));
				 SR310.setZene(true);
				 SR616.setZene(true);
				 SR616.setZene(true);
		 }
				 else {
					  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));

			      }
		     	}
				
			 else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>50&&listaProvimeve.get(j).getNrFletparaqitjeve()<=60) 
		     { 
				 if(MR611.isZene()==false&&MR626.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),611,626,0,0));
					 listaalokimi.add(new alokimi(611,626,0,0));
					 MR611.setZene(true);
					 MR626.setZene(true);
				 }
				 else if(MR611.isZene()==false&&MR621.isZene()==false) 
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),611,621,0,0));
					 listaalokimi.add(new alokimi(611,621,0,0));
					 MR611.setZene(true);
					 MR621.setZene(true);
				 
				 }
				 else if(MR611.isZene()==false&&MR202.isZene()==false) 
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),611,202,0,0));
					 listaalokimi.add(new alokimi(611,202,0,0));
					 MR611.setZene(true);
					 MR202.setZene(true);
				 
				 }
				 else if(MR626.isZene()==false&&MR202.isZene()==false) 
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),626,202,0,0));
					 listaalokimi.add(new alokimi(626,202,0,0));
					 MR611.setZene(true);
					 MR202.setZene(true);
				 
				 }
				 else if(MR626.isZene()==false&&MR621.isZene()==false) 
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),626,621,0,0));
					 listaalokimi.add(new alokimi(626,621,0,0));
					 MR611.setZene(true);
					 MR621.setZene(true);
				 
				 } else if(MR621.isZene()==false&&MR202.isZene()==false) 
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),621,202,0,0));
					 listaalokimi.add(new alokimi(621,202,0,0));
					 MR621.setZene(true);
					 MR202.setZene(true);
				 
				 }
				 else if(SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false) 
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,310,0));
					 listaalokimi.add(new alokimi(745,3,310,0));
					 SR745.setZene(true);
					 SRA3.setZene(true);
					 SR310.setZene(true);
					 
				 
				 }
				 else if(MR621.isZene()==false&&SR616.isZene()==false&&SR615.isZene()==false) 
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),621,616,615,0));
					 listaalokimi.add(new alokimi(621,616,615,0));
					 MR621.setZene(true);
					 SR616.setZene(true);
					 SR615.setZene(true);
					 
				 
				 }
				 else if(MR626.isZene()==false&&SR616.isZene()==false&&SR615.isZene()==false) 
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),626,616,615,0));
					 listaalokimi.add(new alokimi(626,616,615,0));
					 MR626.setZene(true);
					 SR616.setZene(true);
					 SR615.setZene(true);
					 
				 
				 } 
				 else if(MR202.isZene()==false&&SR616.isZene()==false&&SR615.isZene()==false) 
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),202,616,615,0));
					 listaalokimi.add(new alokimi(202,616,615,0));
					 MR202.setZene(true);
					 SR616.setZene(true);
					 SR615.setZene(true);
					 
				 
				 } else {
					  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));

			      }
				 				 
				 
		     	}
				
				
			 else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>60&&listaProvimeve.get(j).getNrFletparaqitjeve()<=90) 
		     { 
				 if(MR611.isZene()==false&&MR626.isZene()==false&&MR621.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,611,0,0));
					 listaalokimi.add(new alokimi(310,611,0,0));
					 SR310.setZene(true);
					 MR611.setZene(true);
				 }
				 else if(MR611.isZene()==false&&MR626.isZene()==false&&MR202.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,626,0,0));
					 listaalokimi.add(new alokimi(310,626,0,0));
			    	    SR310.setZene(true);
			    	    MR626.setZene(true);
			    	   
				 }
				 else if(MR611.isZene()==false&&MR621.isZene()==false&&MR202.isZene()==false) 
				 {
					 
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,621,0,0));
					 listaalokimi.add(new alokimi(310,621,0,0));
					 SR310.setZene(true);
					 MR621.setZene(true);
			    	    
				 }
				 else if(MR621.isZene()==false&&MR626.isZene()==false&&MR202.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),310,202,0,0));
					 listaalokimi.add(new alokimi(310,202,0,0));
					 SR310.setZene(true);
					 MR202.setZene(true);
			    	   
				 }
				 else if(SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false&&MR611.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,310,611,0,0));
					 listaalokimi.add(new alokimi(745,3,310,611,0,0));
					 SR745.setZene(true);
					 SRA3.setZene(true);
					 SR310.setZene(true);
					 MR611.setZene(true);
			    	   
				 }
				 else if(SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false&&MR626.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,310,626,0,0));
					 listaalokimi.add(new alokimi(745,3,310,626,0,0));
					 SR745.setZene(true);
					 SRA3.setZene(true);
					 SR310.setZene(true);
					 MR626.setZene(true);
			    	   
				 }
				 else if(SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false&&MR621.isZene()==false) 
				 { 
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,310,621,0,0));
					 listaalokimi.add(new alokimi(745,3,310,621,0,0));
					 SR745.setZene(true);
					 SRA3.setZene(true);
					 SR310.setZene(true);
					 MR621.setZene(true);
		    	   
				}
				 else if(SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false&&MR202.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,310,202,0,0));
					 listaalokimi.add(new alokimi(745,3,310,202,0,0));
					 SR745.setZene(true);
					 SRA3.setZene(true);
					 SR310.setZene(true);
					 MR202.setZene(true);
			    	   
				 }
				 else if(SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false&&SR636.isZene()==false&&SR616.isZene()==false) 
				 {   orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,310,636,616,0));
					 listaalokimi.add(new alokimi(745,3,310,636,616,0));
					 SR745.setZene(true);
					 SRA3.setZene(true);
					 SR310.setZene(true);
					 SR636.setZene(true);
					 SR616.setZene(true);
			    	   
				 }else if(SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false&&SR636.isZene()==false&&SR615.isZene()==false) 
				 {   
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,310,636,615,0));
					 listaalokimi.add(new alokimi(745,3,310,636,615,0));
					 SR745.setZene(true);
					 SRA3.setZene(true);
					 SR310.setZene(true);
					 SR636.setZene(true);
					 SR616.setZene(true);
					 
		    	   
			    }else if(SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false&&SR615.isZene()==false&&SR616.isZene()==false) 
				 {   
			    	orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,310,615,616,0));
			    	listaalokimi.add(new alokimi(745,3,310,615,616,0));
			    	SR745.setZene(true);
			    	SRA3.setZene(true);
			    	SR310.setZene(true);
			    	MR202.setZene(true);
			    	SR615.setZene(true);
			    	SR616.setZene(true);
		    	   
			 }
			    else {
					  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));

			      }
		     	}
			 
			 else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>90&&listaProvimeve.get(j).getNrFletparaqitjeve()<=120) 
		    
				{

				 if(LR411.isZene()==false&&SR745.isZene()==false&&SRA3.isZene()==false)
				 {  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,745,3,0,0,0));
					 listaalokimi.add(new alokimi(411,745,3,0,0,0));
			    	    LR411.setZene(true);
			    	    SR745.setZene(true);
			    	    SRA3.setZene(true);
			    	      	    
					 				 
				 } 
				 else if(LR411.isZene()==false&&SR745.isZene()==false&&SR310.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,745,310,0,0,0));
					 listaalokimi.add(new alokimi(411,745,310,0,0,0));
		    	     LR411.setZene(true);
		    	     SR745.setZene(true);
		    	     SR310.setZene(true);
		    	       	    
				 				 
			     }
				 else if(LR411.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,3,310,0,0,0));
					 listaalokimi.add(new alokimi(411,3,310,0,0,0));
		    	     LR411.setZene(true);
		    	     SRA3.setZene(true);
		    	     SR310.setZene(true);
		    	       	    
				 				 
			     } 
				 else if(MR611.isZene()==false&&MR626.isZene()==false&&MR621.isZene()==false&&MR202.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),611,626,621,202,0,0));
					 listaalokimi.add(new alokimi(611,626,621,202,0,0));
					 MR611.setZene(true);
					 MR626.setZene(true);
					 MR621.setZene(true);
					 MR202.setZene(true);
		    	       	    
				 				 
			     } 
				 else if(MR611.isZene()==false&&MR626.isZene()==false&&MR621.isZene()==false&&SR636.isZene()==false&&SR615.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),611,626,621,636,615,0));
					 listaalokimi.add(new alokimi(611,626,621,636,615,0));
					 MR611.setZene(true);
					 MR626.setZene(true);
					 MR621.setZene(true);
					 SR636.setZene(true);
					 SR615.setZene(true);
		    	       	    
				 				 
			     } 
				 else if(MR611.isZene()==false&&MR626.isZene()==false&&MR621.isZene()==false&&SR615.isZene()==false&&SR616.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),611,626,621,615,616,0));
					 listaalokimi.add(new alokimi(611,626,621,615,616,0));
					 MR611.setZene(true);
					 MR626.setZene(true);
					 MR621.setZene(true);
					 SR615.setZene(true);
					 SR616.setZene(true);
		    	       	    
				 				 
			     }
				 else {
					  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));

			      }
				 
				 
		    	
		     }
			 else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>120&&listaProvimeve.get(j).getNrFletparaqitjeve()<=150) 
		     {
				 if(LR411.isZene()==false&&MR611.isZene()==false&&MR626.isZene()==false)
				 {  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,611,626,0,0,0));
					 listaalokimi.add(new alokimi(411,611,626,0,0,0));
			    	    LR411.setZene(true);
			    	    MR611.setZene(true);
			    	    MR626.setZene(true);					 
				 } 
				 else if(LR411.isZene()==false&&MR621.isZene()==false&&MR626.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,621,626,0,0,0));
					 listaalokimi.add(new alokimi(411,621,626,0,0,0));
					 LR411.setZene(true);
					 MR621.setZene(true);
					 MR626.setZene(true);					 
				 } 
				 else if(LR411.isZene()==false&&MR621.isZene()==false&&MR202.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,621,202,0,0,0));
					 listaalokimi.add(new alokimi(411,621,202,0,0,0));
					 LR411.setZene(true);
					 MR621.setZene(true);
					 MR202.setZene(true);					 
				 }
				 else if(LR411.isZene()==false&&MR611.isZene()==false&&MR621.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,611,621,0,0,0));
					 listaalokimi.add(new alokimi(411,611,621,0,0,0));
					 LR411.setZene(true);
					 MR621.setZene(true);
					 MR611.setZene(true);					 
				 }else if(LR411.isZene()==false&&SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,745,3,310,0,0));
					 listaalokimi.add(new alokimi(411,745,3,310,0,0));
					 LR411.setZene(true);
					 SR745.setZene(true);
					 SRA3.setZene(true);
					 SR310.setZene(true);
				 }else if(SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false&&MR626.isZene()==false&&MR621.isZene()==false&&MR611.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,310,626,621,611));
					 listaalokimi.add(new alokimi(745,3,310,626,621,611));
					 
					 SR745.setZene(true);
					 SRA3.setZene(true);
					 SR310.setZene(true);
					 MR626.setZene(true);
					 MR621.setZene(true);
					 MR611.setZene(true);
					 
				 }else if(SR745.isZene()==false&&SRA3.isZene()==false&&SR310.isZene()==false&&MR626.isZene()==false&&MR621.isZene()==false&&MR202.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),745,3,310,626,621,202));
					 listaalokimi.add(new alokimi(745,3,310,626,621,202));
					 
					 SR745.setZene(true);
					 SRA3.setZene(true);
					 SR310.setZene(true);
					 MR626.setZene(true);
					 MR621.setZene(true);
					 MR202.setZene(true);
					 
				 }else {
					  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));

			      }
				
				
				 
		     }
			 else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>150&&listaProvimeve.get(j).getNrFletparaqitjeve()<=170) 
		     {
				 if(LR411.isZene()==false&&MR611.isZene()==false&&MR626.isZene()==false && MR202.isZene()==false)
				 {  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,611,626,202,0,0));
					 listaalokimi.add(new alokimi(411,611,626,202,0,0));
			    	    LR411.setZene(true);
			    	    MR611.setZene(true);
			    	    MR202.setZene(true);					 
				 
		        }
				 else if(MR611.isZene()==false&&MR626.isZene()==false&&MR621.isZene()==false&&MR202.isZene()==false&&SR745.isZene()==false&&SR310.isZene()==false)
				 {  
					 orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),611,626,621,202,745,310));
					 listaalokimi.add(new alokimi(611,626,621,202,745,310));
		    	   
		    	    MR611.setZene(true);
		    	    MR626.setZene(true);
		    	    MR621.setZene(true);
		    	    MR202.setZene(true);
		    	    SR745.setZene(true);
		    	    SR310.setZene(true);
				 
			 }
				 else {
					  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));

			      }
		     }
			 else if(listaProvimeve.get(j).getId()==listaId.get(i)&&listaProvimeve.get(j).getNrFletparaqitjeve()>170) 
		     {
				 if(LR411.isZene()==false&&MR611.isZene()==false&&MR626.isZene()==false&&MR621.isZene()==false&&MR202.isZene()==false&&SR745.isZene()==false)
				 {  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,611,626,621,202,745));
					 listaalokimi.add(new alokimi(411,611,626,621,202,745));
			    	    LR411.setZene(true);
			    	    MR611.setZene(true);
			    	    MR626.setZene(true);
			    	    MR621.setZene(true);
			    	    MR202.setZene(true);
			    	    SR745.setZene(true);
					 
				 }else if(LR411.isZene()==false&&MR611.isZene()==false&&MR626.isZene()==false&&MR621.isZene()==false&&MR202.isZene()==false&&SR616.isZene()==false)
				 {  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,611,626,621,202,616));
				 listaalokimi.add(new alokimi(411,611,626,621,202,616));
		    	    LR411.setZene(true);
		    	    MR611.setZene(true);
		    	    MR626.setZene(true);
		    	    MR621.setZene(true);
		    	    MR202.setZene(true);
		    	    SR616.setZene(true);
				 
			 }else if(LR411.isZene()==false&&MR611.isZene()==false&&MR626.isZene()==false&&MR621.isZene()==false&&MR202.isZene()==false&&SR615.isZene()==false)
			 {  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),411,611,626,621,202,615));
			 listaalokimi.add(new alokimi(411,611,626,621,202,615));
	    	    LR411.setZene(true);
	    	    MR611.setZene(true);
	    	    MR626.setZene(true);
	    	    MR621.setZene(true);
	    	    MR202.setZene(true);
	    	    SR615.setZene(true);
			 
		 }else {
			  orariDhoma.add(new alokimi(listaProvimeve.get(j).getId(),listaProvimeve.get(j).getEmri(),listaProvimeve.get(j).getProfesori(),java,dita,perioda,listaProvimeve.get(j).getSemestri(),0,0,0,0));

	      }
				
				
				 
				 
				 
		     }
				
			}
			
		}
		for(int i=0;i<orariDhoma.size();i++) {
			if(orariDhoma.get(i).getSalla2()==0 && orariDhoma.get(i).getSalla3()==0 && orariDhoma.get(i).getSalla3()==0) {
		//	System.out.println(orariDhoma.get(i).getId()+" "+orariDhoma.get(i).getLenda()+" "+orariDhoma.get(i).getProfesori()+" "+orariDhoma.get(i).getJava()+" "+orariDhoma.get(i).getDita()+" "+orariDhoma.get(i).getPerioda()+" Salla: "+orariDhoma.get(i).getSalla1()+" ");
		}else if(orariDhoma.get(i).getSalla3()==0 && orariDhoma.get(i).getSalla4()==0) {
			//System.out.println(orariDhoma.get(i).getId()+" "+orariDhoma.get(i).getLenda()+" "+orariDhoma.get(i).getProfesori()+" "+orariDhoma.get(i).getJava()+" "+orariDhoma.get(i).getDita()+" "+orariDhoma.get(i).getPerioda()+" Sallat: "+orariDhoma.get(i).getSalla1()+" "+orariDhoma.get(i).getSalla2()+" ");
		}else if(orariDhoma.get(i).getSalla4()==0) {
			//System.out.println(orariDhoma.get(i).getId()+" "+orariDhoma.get(i).getLenda()+" "+orariDhoma.get(i).getProfesori()+" "+orariDhoma.get(i).getJava()+" "+orariDhoma.get(i).getDita()+" "+orariDhoma.get(i).getPerioda()+" Sallat: "+orariDhoma.get(i).getSalla1()+" "+orariDhoma.get(i).getSalla2()+" "+orariDhoma.get(i).getSalla3()+" ");
		}else {
			//System.out.println(orariDhoma.get(i).getId()+" "+orariDhoma.get(i).getLenda()+" "+orariDhoma.get(i).getProfesori()+" "+orariDhoma.get(i).getJava()+" "+orariDhoma.get(i).getDita()+" "+orariDhoma.get(i).getPerioda()+" Sallat: "+orariDhoma.get(i).getSalla1()+" "+orariDhoma.get(i).getSalla2()+" "+orariDhoma.get(i).getSalla3()+" "+orariDhoma.get(i).getSalla3()+" ");

		}
		}
		return orariDhoma;
	}
	public List<alokimi> ALokimeNeSalla(List<OrariLenda> y) {
		List<alokimi> alokimet=new ArrayList<alokimi>();
		alokimi a=new alokimi();
		alokimi b=new alokimi();
		alokimi c=new alokimi();
		alokimi d=new alokimi();
		alokimi e=new alokimi();
		
		alokimi a1=new alokimi();
		alokimi b1=new alokimi();
		alokimi c1=new alokimi();
		alokimi d1=new alokimi();
		alokimi e1=new alokimi();
		
		alokimi a2=new alokimi();
		alokimi b2=new alokimi();
		alokimi c2=new alokimi();
		alokimi d2=new alokimi();
		alokimi e2=new alokimi();
		
		alokimi a3=new alokimi();
		alokimi b3=new alokimi();
		alokimi c3=new alokimi();
		alokimi d3=new alokimi();
		alokimi e3=new alokimi();
		
		alokimi a4=new alokimi();
		alokimi b4=new alokimi();
		alokimi c4=new alokimi();
		alokimi d4=new alokimi();
		alokimi e4=new alokimi();
		
		alokimi a5=new alokimi();
		alokimi b5=new alokimi();
		alokimi c5=new alokimi();
		alokimi d5=new alokimi();
		alokimi e5=new alokimi();
		
		alokimi a6=new alokimi();
		alokimi b6=new alokimi();
		alokimi c6=new alokimi();
		alokimi d6=new alokimi();
		alokimi e6=new alokimi();
		
		alokimi a7=new alokimi();
		alokimi b7=new alokimi();
		alokimi c7=new alokimi();
		alokimi d7=new alokimi();
		alokimi e7=new alokimi();
		
		
		
		
		alokimet.addAll(a.RoomCapacity(1, 1, 1,y));
		alokimet.addAll(b.RoomCapacity(1, 2, 1,y));
		alokimet.addAll(c.RoomCapacity(1, 3, 1,y));
		alokimet.addAll(d.RoomCapacity(1, 4, 1,y));
		alokimet.addAll(e.RoomCapacity(1, 5, 1,y));
		alokimet.addAll(a1.RoomCapacity(2, 1, 1,y));
		alokimet.addAll(b1.RoomCapacity(2, 2, 1,y));
		alokimet.addAll(c1.RoomCapacity(2, 3, 1,y));
		alokimet.addAll(d1.RoomCapacity(2, 4, 1,y));
		alokimet.addAll(e1.RoomCapacity(2, 5, 1,y));
		alokimet.addAll(a2.RoomCapacity(3, 1, 1,y));
		alokimet.addAll(b2.RoomCapacity(3, 2, 1,y));
		alokimet.addAll(c2.RoomCapacity(3, 3, 1,y));
		alokimet.addAll(d2.RoomCapacity(3, 4, 1,y));
		alokimet.addAll(e2.RoomCapacity(3, 5, 1,y));
		alokimet.addAll(a3.RoomCapacity(4, 1, 1,y));
		alokimet.addAll(b3.RoomCapacity(4, 2, 1,y));
		alokimet.addAll(c3.RoomCapacity(4, 3, 1,y));
		alokimet.addAll(d3.RoomCapacity(4, 4, 1,y));
		alokimet.addAll(e3.RoomCapacity(4, 5, 1,y));
		alokimet.addAll(a4.RoomCapacity(1, 1, 2,y));
		alokimet.addAll(b4.RoomCapacity(1, 2, 2,y));
		alokimet.addAll(c4.RoomCapacity(1, 3, 2,y));
		alokimet.addAll(d4.RoomCapacity(1, 4, 2,y));
		alokimet.addAll(e4.RoomCapacity(1, 5, 2,y));
		alokimet.addAll(a5.RoomCapacity(2, 1, 2,y));
		alokimet.addAll(b5.RoomCapacity(2, 2, 2,y));
		alokimet.addAll(c5.RoomCapacity(2, 3, 2,y));
		alokimet.addAll(d5.RoomCapacity(2, 4, 2,y));
		alokimet.addAll(e5.RoomCapacity(2, 5, 2,y));		
		alokimet.addAll(a6.RoomCapacity(3, 1, 2,y));
		alokimet.addAll(b6.RoomCapacity(3, 2, 2,y));
		alokimet.addAll(c6.RoomCapacity(3, 3, 2,y));
		alokimet.addAll(d6.RoomCapacity(3, 4, 2,y));
		alokimet.addAll(e6.RoomCapacity(3, 5, 2,y));		
		alokimet.addAll(a7.RoomCapacity(4, 1, 2,y));
		alokimet.addAll(b7.RoomCapacity(4, 2, 2,y));
		alokimet.addAll(c7.RoomCapacity(4, 3, 2,y));
		alokimet.addAll(d7.RoomCapacity(4, 4, 2,y));
		alokimet.addAll(e7.RoomCapacity(4, 5, 2,y));

		return alokimet;
		
	}
	

}
