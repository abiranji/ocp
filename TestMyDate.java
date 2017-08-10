public class TestMyDate{

	public static void main(String[] args){
		TestMyDate date1 = new TestMyDate();

		TestMyDate date2 = new TestMyDate();
		date2.day = 11;
		date2.month = 11;
		date2.year = 1918;

		TestMyDate date3 = new TestMyDate();
		date3.setDate(4,21,1968);
		date3.setmonth=12;

		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}