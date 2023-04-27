package company;

import company.model.Register;

public class Register_Ex {

	public static void main(String[] args) {
		Register member1 = new Register(); //Reigster.java copy
		Register member2 = new Register(); //Reigster.java copy
		Register member3 = new Register(); //Reigster.java copy
		
		member1.setUserid("Busan");
		member1.setPasswd("12345");
		member1.setName("홍길동");;
		member1.setGrade(5);
		member1.setAddr("부산광역시");
		member1.setTel("010-1234-4564");
		
		member2.setUserid("seoul");
		member2.setPasswd("12345");
		member2.setName("홍길순");;
		member2.setGrade(5);
		member2.setAddr("서울특별시");
		member2.setTel("010-5678-85555");
		
		member3.setUserid("changwon");
		member3.setPasswd("12345");
		member3.setName("홍길준");;
		member3.setGrade(5);
		member3.setAddr("창원시");
		member3.setTel("010-5555-8888");
		
		
		System.out.println(member1.disp());
		System.out.println("<------------------->");
		System.out.println(member2.disp());
		System.out.println("<------------------->");
		System.out.println(member3.disp());
		

	}

}
