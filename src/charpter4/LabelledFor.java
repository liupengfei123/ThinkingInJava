package charpter4;

/**
 * 循环标签的测试
 *
 * @author liupf
 * @create 2018-08-05 21:58
 */
public class LabelledFor {
    public static void main(String[] args) {
        int i = 0;

        outer:
        for(;true;){
            inner:
            for (; i<10;i++){
                System.out.println("i= " + i);
                if(i == 2){
                    continue;
                }
                if(i == 3){
                    System.out.println("break");
                    i++;
                    break;
                }
                if(i == 7){
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if(i == 8){
                    System.out.println("break outer");
                    break outer;
                }

                for (int k = 0; k < 5; k++){
                    if (k == 3){
                        System.out.println("continue  inner");
                        break;
                    }
                }
            }

        }


    }


}
