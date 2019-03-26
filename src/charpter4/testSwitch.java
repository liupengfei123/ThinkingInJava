package charpter4;

/**
 * switch测试
 *
 * @author liupf
 * @create 2018-08-05 22:12
 */
public class testSwitch {

    public static void main(String[] args) {
        String value = "BC";
        switch (value){
            default : System.out.println("default" + value);break;
            case "A" : System.out.println("one  " + value); break;
            case "AB" : System.out.println("two  " + value); break;
            case "ABC" : System.out.println("three  " + value); break;
        }

    }

}
