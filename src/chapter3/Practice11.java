package chapter3;

/**
 *  以一个最高有效位为1 的二进制数字开始，用有符号右移操作符对其进i选哪个右移，直到所有的二进制位都被移出为止，每移一位都要使用  Integer.toBinaryString() 显示结果
 * @author liupf
 * @create 2018-08-02 21:25
 */
public class Practice11 {
    public static void main(String[] args) {
        int num = 0x7FFFFFFF;
        while (num != 0){
            num = num >> 2;
            System.out.println(Integer.toBinaryString(num));
        }
    }
}
