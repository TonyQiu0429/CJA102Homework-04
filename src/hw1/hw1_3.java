package hw1;
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class hw1_3 {
	public static void main(String[]args) {
		int totalseconds = 256559,
			
			totaldays = 256559 / (60*60*24),
			remaindays = 256559 % (60*60*24),
			
			totalhours = remaindays / (60*60) ,
			remainhours = remaindays % (60*60),
			
			totalminutes = remainhours / 60,
			remainminutes = remainhours % 60,
			
			remainseconds = totalseconds % 60;
			
		System.out.println("總秒數"+totalseconds);
		System.out.println("換算為：");
		System.out.println(totaldays+"天"+totalhours+"小時"+totalminutes+"分"+remainseconds+"秒");
 	}
}
