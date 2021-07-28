package com.gjbs.processcontrol;

public class For {


    public static void main(String[] args) {
        int[] a = new int[5];


        If[] ifs = new If[3];

        ifs[0] = new If();
        ifs[1] = new If();
        ifs[2] = new If();

//        System.out.println(ifs.length);

        for(int i = 0; i < ifs.length; i++ ){
            System.out.println("第"+ (i + 1) + "次循环");
            for(int j = 0; j < ifs.length; j++){
                if(j == 1)
                    break;
                System.out.println("j等于"+j);
            }
        }




    }

}
