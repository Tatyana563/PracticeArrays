public class Break {
// Применение break с меткой для выхода из вложенных циклов
    //Some practice
public static void main(String[] args) {
    outer:
    for(int i=0;i<3;i++){
        System.out.println("Circle:"+i);
        for(int j=0;j<100;j++){

            if(j==10){
                break ;// if break - выход из внутр цикла
            }
            System.out.println(j);
        }
        System.out.println("Don't expect this line");
    }
}

    }

