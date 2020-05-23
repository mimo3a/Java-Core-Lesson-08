package ua.lviv.lga.enumerations;


import java.util.Scanner;

public class Aooplication {

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

	public static void main(String[] args) {
		
		Months [] monthMas = Months.values();
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			menu();
			switch(sc.next()) {
			
			case"1" : {
				System.out.println("Enter month");
				
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				monthExits(monthMas, month);
					
				
				break;
			}
				case"2" : {
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
		        	
					for(Months m : monthMas) {
						if(m.getDays() % 2 == 0) {
							System.out.println(m.name());					
						}
					}			    	
					break;
				}
		        case"9" : {
		        	for(Months m : monthMas) {
						if((m.getDays() % 2) != 0) {
							System.out.println(m.name());					
						}
					}			    	
					break;
		        	
		        }
		        case"10" : {
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
}
