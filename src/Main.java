
class Main{
    public static void mass1(){
        int mass[] = new int[11];
        int j=0;
        for(int i = 0; i<10; i++){
             j+=2;
            mass[i] = j;
            System.out.print(mass[i] + " ");
        }

        System.out.print('\n');

        for(int i = 0; i<10; i++){
            System.out.print(mass[i] + "\n");
        }
    }
    public static void mass2(){
        int mass[] = new int[50];
        int j=1;
        for(int i = 0; i<50; i++){
            mass[i] = j;
            System.out.print(mass[i] + " ");
            j+=2;
        }

        System.out.print('\n');

        for(int i = 49; i>-1; i--){
            System.out.print(mass[i] + " ");
        }
    }
    public static void mass3(){
        int mass[] = new int[14];
        int j=0;
        for(int i=0; i<14; i++){
            mass[i] = (int)(Math.random()*10);
            System.out.print(mass[i] + " ");
            if ((mass[i]%2 == 0 )&&(mass[i]!=0)){j++;}
        }
        System.out.print("\nЧетных чисел в данном массиве " + j);
    }
    public static void mass4(){
        int mass[][] = new int[8][5];
        for (int i=0; i<8; i++){
            for (int j=0; j<5; j++){
                mass[i][j]=(int)(Math.random()*90+10);
            }
        }
        System.out.print('\n');
        for (int i=0; i<8; i++){
            for (int j=0; j<5; j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void mass5(){
        int mass[][] = new int[7][4];
        for (int i=0; i<7; i++){
            for (int j=0; j<4; j++){
                mass[i][j]=(int)(Math.random()*10-5);
                System.out.print(mass[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print('\n');
        int buf = 1;
        int buff, index;
        buff = index = 0;
        for (int i=0; i<7; i++){
           buf = Math.abs(mass[i][0]*mass[i][1]*mass[i][2]*mass[i][3]);
            if (buf > buff) {buff = buf; index = i + 1;}
        }
        System.out.print("\n"+ buff + " индекс " + index);
    }
    public static void main(String argc[]){
        System.out.print("Массив из четных чисел\n");
        mass1();
        System.out.print("\nМассив из нечётных чисел\n");
        mass2();
        System.out.print("\nМассив из случайных чиселппп\n");
        mass3();
        System.out.print("\nДвумерный массив 8 строк 5 столбцов\n");
        mass4();
        System.out.print("\nМассив 7 строк на 5 столбцов\n");
        mass5();
    }
}