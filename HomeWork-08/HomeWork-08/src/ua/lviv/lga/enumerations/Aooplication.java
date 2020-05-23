package ua.lviv.lga.enumerations;


import java.util.Scanner;

public class Aooplication {

	static void menu() {
		System.out.println("натисн≥ть 1 щоб перев≥рити чи ≥снуЇ такий м≥с€ць");
		System.out.println("натисн≥ть 2 щоб вивести вс≥ м≥с€ц≥ з такою ж порою року");
		System.out.println("натисн≥ть 3 щоб вивести вс≥ м≥с€ц≥, що мають таку саму к≥льк≥сть дн≥в");
		System.out.println("натисн≥ть 4 щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в");
		System.out.println("натисн≥ть 5 щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");
		System.out.println("натисн≥ть 6 щоб вивести на екран наступну пору року");
		System.out.println("натисн≥ть 7 щоб вивести на екран попередню пору року");
		System.out.println("натисн≥ть 8 щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в");
		System.out.println("натисн≥ть 9 щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в");
		System.out.println("натисн≥ть 10 щоб вивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в");

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
						System.out.println("ћ≥с€ц≥в з меньшою к≥льк≥стю дн≥в не ≥снуЇ");
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
						System.out.println("ћ≥с€ц≥в з б≥льшою к≥льк≥стю дн≥в не ≥снуЇ");
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
							
						System.out.println("Ќаступний сезон : " + monthMas[ ordinal+ 1].getSeason());	
					
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
						
					System.out.println("ѕопередн≥й сезон : " + monthMas[ ordinal - 1].getSeason());	
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
							System.out.println(monthInput.name() + " маЇ парну к≥льк≥сть дн≥в");					
						} else {
							System.out.println(monthInput.name() + " маЇ не парну к≥льк≥сть дн≥в");
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
				System.out.println("“ј »… ћ≤—я÷№ ≤—Ќ”™ !!!");
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("“ј ќ√ќ ћ≤—я÷я Ќ≈ ≤—Ќ”™ !!!");
		}
		return flag;
	}
}
