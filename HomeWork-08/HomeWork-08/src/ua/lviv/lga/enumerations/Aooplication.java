/*
 * LOGOS academy
 */

package ua.lviv.lga.enumerations;
/***
 * @since java 1.8
 * @author mimo3a
 * @version 1.1
 * 
 * 
 */


import java.util.Scanner;

public class Aooplication {
	/*Name of class*/

	static void menu() {
		System.out.println("�������� 1 ��� ��������� �� ���� ����� �����");
		System.out.println("�������� 2 ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3 ��� ������� �� �����, �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6 ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7 ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9 ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10 ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");

	}
	/*General menu*/

	public static void main(String[] args) throws WrongInputConsoleParametersException {
		
		Months [] monthMas = Months.values();
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			menu();
			
			String enter =  sc.next();
			System.out.println("Enter number is " + enter);
			int i = Integer.parseInt(enter);
			if(i < 1 || i > 10 ) {
				String message = "Sach function dont exists";
				throw new WrongInputConsoleParametersException(message);
				/*Exception of aut area*/
			} else {
			
			
			
			switch(enter) {
			
			case"1" : {
				
				/*�� ���� ����� �����*/
				
				System.out.println("Enter month");
				
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				monthExits(monthMas, month);
					
				
				break;
			}
				case"2" : {
					
					/*�� ����� � ����� � ����� ����*/
					
					System.out.println("Enter month");
					sc = new Scanner(System.in);
					String month = sc.next().toUpperCase();
					
					if (monthExits(monthMas, month) ) {
						
										
					for(Months m : monthMas) {
						
						Months monthInput = Months.valueOf(month);
						if(m.getSeason() == monthInput.getSeason()) {
							System.out.println(m.name());
						}
						}
					} else {
						break;
						}
					
												
						break;											
				}
				
				case"3" : {
					
					/*����� ���� ���� ������� ���*/
					
					System.out.println("Enter month");
					sc = new Scanner(System.in);
					String month = sc.next().toUpperCase();
					if (monthExits(monthMas, month) ) {
					for(Months m : monthMas) {
						Months monthInput = Months.valueOf(month);
						if(m.getDays() == monthInput.getDays()) {
							System.out.println(m.name());					
						}															
			    	}
					} else {
						break;
					}
					break;
				}
				case"4" : {
					
					/*�� ����� �� ����� ����� ������� ���*/
					
					System.out.println("Enter month");
					sc = new Scanner(System.in);
					String month = sc.next().toUpperCase();
					if (monthExits(monthMas, month) ) {
					boolean flag = false;
					for(Months m : monthMas) {
						Months monthInput = Months.valueOf(month);
						if(m.getDays() < monthInput.getDays()) {
							System.out.println(m.name());
							flag = true;
						}															
			    	}
					if (!flag) {
						System.out.println("̳����� � ������� ������� ��� �� ����");
					}
					} else {
						break;
					}
					break;
				}
				case"5" : {
					
					/* �� ����� �� ����� ����� ������� ���*/
					
					System.out.println("Enter month");
					sc = new Scanner(System.in);
					String month = sc.next().toUpperCase();
					if (monthExits(monthMas, month) ) {
					boolean flag = false;
					for(Months m : monthMas) {
						Months monthInput = Months.valueOf(month);
						if(m.getDays() > monthInput.getDays()) {
							System.out.println(m.name());
							flag = true;
						}
						
						
			    	}
					if(!flag) {
						System.out.println("̳����� � ������ ������� ��� �� ����");
					}
					} else {
						break;
					}
					break;
				}
				case"6" : {
					
					/*�������� ���� ����*/
					
					System.out.println("Enter month");
					sc = new Scanner(System.in);
					String month = sc.next().toUpperCase();
					
					if (monthExits(monthMas, month) ) {
						
						Months monthInput = Months.valueOf(month);
						int ordinal = monthInput.ordinal();
						
						if (ordinal == (monthMas.length - 1)) {
							ordinal = 0;}
						
						while( monthMas[ordinal].getSeason() == monthMas[ ordinal+ 1].getSeason()) {
							ordinal += 1;
							}
							
						System.out.println("��������� ����� : " + monthMas[ ordinal+ 1].getSeason());	
					
					} else {
						break;
					}
					
						break;
					
				    	
				}
			
		        case"7" : {
		        	
		        	/*��������� ���� ����*/
		        	
		        	System.out.println("Enter month");
					sc = new Scanner(System.in);
					String month = sc.next().toUpperCase();
					if (monthExits(monthMas, month) ) {
					Months monthInput = Months.valueOf(month);
					int ordinal = monthInput.ordinal();
					
					if (ordinal == 0 ) {
						ordinal = (monthMas.length - 1);}
					
					while( monthMas[ordinal].getSeason() == monthMas[ ordinal - 1].getSeason()) {
						ordinal -= 1;
						}
						
					System.out.println("��������� ����� : " + monthMas[ ordinal - 1].getSeason());	
					} else {
						break;
					}
					
				    break;	
		        	
		        }
		        case"8" : {
		        	
		        	/*�� ����� �� ����� ����� ������� ���*/
		        	
					for(Months m : monthMas) {
						if(m.getDays() % 2 == 0) {
							System.out.println(m.name());					
						}
					}			    	
					break;
				}
		        case"9" : {
		        	
		        	/*�� ����� �� ����� ������� ������� ���*/
		        	
		        	for(Months m : monthMas) {
						if((m.getDays() % 2) != 0) {
							System.out.println(m.name());					
						}
					}			    	
					break;
		        	
		        }
		        case"10" : {
		        	
		        	/*�� �������� � ������ ����� �� ����� ������� ���*/
		        	
		        	System.out.println("Enter month");
					sc = new Scanner(System.in);
					String month = sc.next().toUpperCase();
					if (monthExits(monthMas, month) ) {
											
						Months monthInput = Months.valueOf(month);
						if( monthInput.getDays() % 2 == 0) {
							System.out.println(monthInput.name() + " �� ����� ������� ���");					
						} else {
							System.out.println(monthInput.name() + " �� �� ����� ������� ���");
						}															
			    	
					} else {
						break;
					}
					
					break;
		        }
			}
		        }
			}
		}
		        
			
		
			
		
	
						

	private static boolean monthExits(Months[] monthMas, String month) {
		boolean flag = false;
		for (Months m : monthMas) {
			if (m.name().equals(month)) {
				System.out.println("����� ̲���� ���Ӫ !!!");
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("������ ̲���� �� ���Ӫ !!!");
		}
		return flag;
	}
	
	/*����� ̲���� ���Ӫ  �� ���Ӫ*/
}
