package com.xworkz.corejava;

public class Exceptionhandlingdemo {
		
		public static void main(String[] args) {
			String id = "MI1234";
			int pass = 12334;
			
			if(id.equals("MI1234")) {
				if(pass==1233) {
					System.out.println("Login successful");
				}
				else {
					try {
					DmartLogin dl = new DmartLogin();
					throw dl;
					} catch(DmartLogin e) {
						System.out.println("Invalid password entered");
						
					}
				}
			}
		}

	}
