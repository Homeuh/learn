public class equal {
    public static void main(String[] args) {
        String str1 = new String("good");
        String str2 = new String("good");
        String str3 = "good";
        String str4 = "good";

        //String类型的equals()方法被重写：比较的是值而非地址
        /*1.==：基本数据类型：比较值(byte、short、int、long、float、double、boolean、char8种)
                引用数据类型：比较地址(除以上8种)
          2.equals：基本数据类型：不能用于基本类型；
                   引用数据类型：①比较地址（方法没有被重写情况下）
                              ②比较值（方法被重写：如String、Date）
         */

        System.out.println(str1 == str2);//引用数据类型，比较地址:false
        System.out.println(str1.equals(str2));//引用数据类型，比较值:true
        System.out.println(str3 == str4);/*常量池机制，找不到"good"这个String类型的常量，创建后str4找到了，赋予地址
                                           相当于String str3 = "good";  String str4 = str3;
                                           比较地址：true */
        System.out.println(str3.equals(str4));//引用数据类型，比较值：true
    }
}
