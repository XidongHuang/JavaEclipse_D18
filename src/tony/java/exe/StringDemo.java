package tony.java.exe;
/*
 * 	1. 模拟一个trim方法，去除字符串两端的空格。

	2. 将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”

	3. 获取一个字符串在另一个字符串中出现的次数。
    	比如：获取“ ab”在 “abkkcadkabkebfkabkskab”    
    	中出现的次数
 */
public class StringDemo {
	public static void main(String[] args) {
		
		//1.模拟一个trim方法，去除字符串两端的空格。
		String str1 = "    ";
		System.out.println(trim2(str1));
		//2.
		String str2 = " asidfjailsdf";
		String str3 = reverS(str2, 3, 7);
		System.out.println(str3);
		String str4 = reverseS1(str2, 3, 7);
		System.out.println(str4);
		
		//3
		System.out.println(getTimes("asdhfalsdhf", "sd"));
		
	}
	
	
	
	// 获取两个字符串中最大相同子串
	
	
	
	//3.获取一个字符串在另一个字符串中出现的次数。str2在str1里面出现的次数
	public static int getTimes(String str1, String str2){
		int count = 0;
		int len;
		while((len = str1.indexOf(str2)) != -1){
			count++;
			str1 = str1.substring(len+str2.length());
		}
		
		
		
		return count;
	}
	
	
	
	
	
	
	
	
	//将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg” (方法二) 
	//在考虑使用StringBuffer 将此算法优化！
	public static String reverseS1(String str, int begin, int end){
		String str1 = str.substring(0, begin);
		for(int i = end; i>= begin;i--){
			str1 += str.charAt(i);
			
		}
		str1 += str.substring(end+1);
		return str1;
	}
	
	
	
	//2. 将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
	public static String reverS(String str, int begin, int end){
		
		char [] value = str.toCharArray();
		
		
		
		
		return reverC(value, begin, end);
	}
	
	public static String reverC(char[] c, int begin, int end){
		for(int i = begin, j = end;i<j; i++, j-- ){
			char temp = c[i];
			c[i]= c[j];
			c[j]= temp;
		}
		
		return String.valueOf(c);
	}
	
	
	
	
	
	//1. 模拟一个trim方法，去除字符串两端的空格。
	public static String trim2(String str){
		
		/*
		 * public String trim() {
        int len = value.length;
        int st = 0;
        char[] val = value;   

        while ((st < len) && (val[st] <= ' ')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return ((st > 0) || (len < value.length)) ? substring(st, len) : this;
    	}
		 * 
		 * 
		 */
		
		char[] value = str.toCharArray();
		int len = value.length;
		int st = 0;
		int end = len-1;
		
		while((st < len) && (value[st] == ' ')){
			st++;
			
		}
		
		while((st < len) && (value[end] == ' ')){
			end--;
		}
		
		return str.substring(st, end+1);
		
		
	}
	
	
}
