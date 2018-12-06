import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Subject     : saya, kakak, ita, rinda, ibu");
        System.out.println("Predikat    : belajar, mandi, memasak, memancing, membawa");
        System.out.println("Objek       : ayam, algoritma, bunga, belut, kuda");
        System.out.println("Keterangan  : di perpus, sore hari, di dapur, kemarin, setiap hari ");
        System.out.print("Masukkan Kalimat  : ");
        Scanner input = new Scanner(System.in);

        String Has = input.nextLine(); // dapat menerima 1 kalimat, next aja 1 kata doang
        Has = Has.toLowerCase();
        String[] kata = Has.split(" ");
        List<Character>list = new ArrayList<>();

        for (int a = 0 ; a < kata.length; a++) {
            if ("sore".equals(kata[a]) || "di".equals(kata[a])) {
                kata[a] = kata[a] + " " +kata[a+1];
                kata[a+1] = " ";
            }
        }

        for (int a = 0;a< kata.length; a++) {
            //Subject
            if(kata[a].charAt(0)== 's' && kata[a].length() == 4)
                if(kata[a].charAt(1) == 'a')
                    if(kata[a].charAt(2) == 'y')
                        if(kata[a].charAt(3) == 'a'){
                            System.out.println(kata[a] + ": S");
                            list.add('S');
            }
             if(kata[a].charAt(0) == 'i' && kata[a].length() == 3)
                if(kata[a].charAt(1) == 'b')
                    if (kata[a].charAt(2) == 'u'){
                        System.out.println(kata[a] + ": S");
                        list.add('S');
             }
             if(kata[a].charAt(0)== 'k' && kata[a].length() == 5)
                if (kata[a].charAt(1)== 'a')
                    if (kata[a].charAt(2) == 'k')
                        if (kata[a].charAt(3) == 'a')
                            if (kata[a].charAt(4) == 'k'){
                                System.out.println(kata[a] + ": S");
                                list.add('S');
             }
             if (kata[a].charAt(0)== 'r' && kata[a].length() == 5)
                if (kata[a].charAt(1) == 'i')
                    if (kata[a].charAt(2) == 'n')
                        if (kata[a].charAt(3)== 'd')
                            if (kata[a].charAt(4)=='a'){
                                System.out.println(kata[a] + ": S");
                                list.add('S');
            }
             if (kata[a].charAt(0) == 'i' && kata[a].length() == 3)
                if (kata[a].charAt(1) == 't')
                    if (kata[a].charAt(2)== 'a'){
                        System.out.println(kata[a] + ": S");
                        list.add('S');
            }
            // predikat
             if (kata[a].charAt(0)== 'm' && kata[a].length() == 7)
                if (kata[a].charAt(1)== 'e')
                    if (kata[a].charAt(2)== 'm')
                        if (kata[a].charAt(3) == 'a')
                            if (kata[a].charAt(4) == 's')
                                if (kata[a].charAt(5)== 'a')
                                    if (kata[a].charAt(6)== 'k'){
                                        System.out.println(kata[a] + ": P");
                                        list.add('P');
            }
             if (kata[a].charAt(0)== 'm' && kata[a].length() == 5)
                if (kata[a].charAt(1)=='a')
                    if(kata[a].charAt(2)=='n')
                        if (kata[a].charAt(3)== 'd')
                            if (kata[a].charAt(4) == 'i'){
                                System.out.println(kata[a] + ": P");
                                list.add('P');
             }
             if (kata[a].charAt(0) == 'm' && kata[a].length() == 9)
                if (kata[a].charAt(1)=='e')
                    if (kata[a].charAt(2)== 'm')
                        if (kata[a].charAt(3)== 'a')
                            if (kata[a].charAt(4) == 'n')
                                if (kata[a].charAt(5)=='c')
                                    if (kata[a].charAt(6)== 'i')
                                        if (kata[a].charAt(7)=='n')
                                            if (kata[a].charAt(8)=='g'){
                                                System.out.println(kata[a] + ": P");
                                                list.add('P');
             }
             if (kata[a].charAt(0)== 'm' && kata[a].length() == 7)
                if (kata[a].charAt(1)== 'e')
                    if (kata[a].charAt(2) == 'n')
                        if (kata[a].charAt(3) == 'a')
                            if (kata[a].charAt(4) == 'i')
                                if (kata[a].charAt(5) == 'k')
                                    if (kata[a].charAt(6) == 'i'){
                                        System.out.println(kata[a] + ": P");
                                        list.add('P');
            }
             if (kata[a].charAt(0)== 'b' && kata[a].length() == 7)
                if (kata[a].charAt(1)== 'e')
                    if (kata[a].charAt(2) == 'l')
                        if (kata[a].charAt(3) == 'a')
                            if (kata[a].charAt(4) == 'j')
                                if (kata[a].charAt(5) == 'a')
                                    if (kata[a].charAt(6) == 'r'){
                                        System.out.println(kata[a] + ": P");
                                        list.add('P');
            }

            // Object
             if (kata[a].charAt(0)== 'a' && kata[a].length()== 4)
                if (kata[a].charAt(1)== 'y')
                    if (kata[a].charAt(2) == 'a')
                        if (kata[a].charAt(3) == 'm'){
                            System.out.println(kata[a] + ": O");
                            list.add('O');
            }
             if (kata[a].charAt(0)== 'b' && kata[a].length()==5)
                if (kata[a].charAt(1)== 'u')
                    if (kata[a].charAt(2) == 'n')
                        if (kata[a].charAt(3) == 'g')
                            if (kata[a].charAt(4) == 'a') {
                                System.out.println(kata[a] + ": O");
                                list.add('O');
            }
             if (kata[a].charAt(0)== 'b' && kata[a].length()== 5)
                if (kata[a].charAt(1)== 'e')
                    if (kata[a].charAt(2) == 'l')
                        if (kata[a].charAt(3) == 'u')
                            if (kata[a].charAt(4) == 't') {
                                System.out.println(kata[a] + ": O");
                                list.add('O');
            }
             if (kata[a].charAt(0)== 'k' && kata[a].length()== 4)
                if (kata[a].charAt(1)== 'u')
                    if (kata[a].charAt(2) == 'd')
                        if (kata[a].charAt(3) == 'a'){
                            System.out.println(kata[a] + ": O");
                            list.add('O');
            }
             if (kata[a].charAt(0)== 'a' && kata[a].length()== 9)
                if (kata[a].charAt(1)== 'l')
                    if (kata[a].charAt(2) == 'g')
                        if (kata[a].charAt(3) == 'o')
                            if (kata[a].charAt(4) == 'r')
                                if (kata[a].charAt(5) == 'i')
                                    if (kata[a].charAt(6) == 't')
                                        if (kata[a].charAt(7) == 'm')
                                            if (kata[a].charAt(8) == 'a') {
                                                System.out.println(kata[a] + ": O");
                                                list.add('O');
            }
            // Keterangan
             if (kata[a].charAt(0)== 'd' && kata[a].length()== 8)
                if (kata[a].charAt(1)== 'i')
                    if (kata[a].charAt(2) == ' ')
                        if (kata[a].charAt(3) == 'd')
                            if (kata[a].charAt(4) == 'a')
                                if (kata[a].charAt(5)== 'p')
                                    if (kata[a].charAt(6) == 'u')
                                        if (kata[a].charAt(7) == 'r') {
                                            System.out.println(kata[a] + ": K");
                                            list.add('K');
            }
             if (kata[a].charAt(0)== 's' && kata[a].length()== 12)
                if (kata[a].charAt(1)== 'e')
                    if (kata[a].charAt(2) == 't')
                        if (kata[a].charAt(3) == 'i')
                            if (kata[a].charAt(4) == 'a')
                                if (kata[a].charAt(5) == 'p')
                                    if (kata[a].charAt(6) == ' ')
                                        if (kata[a].charAt(7) == 'm')
                                            if (kata[a].charAt(8) == 'a')
                                                if (kata[a].charAt(9)== 'l')
                                                    if (kata[a].charAt(10) == 'a')
                                                        if (kata[a].charAt(11) == 'm') {
                                                            System.out.println(kata[a] + ": K");
                                                            list.add('K');
            }
             if (kata[a].charAt(0)== 's' && kata[a].length()== 9)
                if (kata[a].charAt(1)== 'o')
                    if (kata[a].charAt(2) == 'r')
                        if (kata[a].charAt(3) == 'e')
                            if (kata[a].charAt(4) == ' ')
                                if (kata[a].charAt(5) == 'h')
                                    if (kata[a].charAt(6) == 'a')
                                        if (kata[a].charAt(7) == 'r')
                                            if (kata[a].charAt(8) == 'i') {
                                                System.out.println(kata[a] + ": K");
                                                list.add('K');
            }
             if (kata[a].charAt(0)== 'k' && kata[a].length()== 7)
                if (kata[a].charAt(1)== 'e')
                    if (kata[a].charAt(2) == 'm')
                        if (kata[a].charAt(3) == 'a')
                            if (kata[a].charAt(4) == 'r')
                                if (kata[a].charAt(5) == 'i')
                                    if (kata[a].charAt(6) == 'n') {
                                        System.out.println(kata[a] + ": K");
                                        list.add('K');
            }
             if (kata[a].charAt(0)== 'd' && kata[a].length()== 9)
                if (kata[a].charAt(1)== 'i')
                    if (kata[a].charAt(2) == ' ')
                        if (kata[a].charAt(3) == 'p')
                            if (kata[a].charAt(4) == 'e')
                                if (kata[a].charAt(5)== 'r')
                                    if (kata[a].charAt(6) == 'p')
                                        if (kata[a].charAt(7) == 'u')
                                            if (kata[a].charAt(8)== 's') {
                                                System.out.println(kata[a] + ": K");
                                                list.add('K');
            }
            else{
                System.out.println(kata +": Belum Terdaftar");
            }
        }

        // kondisi untuk mengecek apakah kata yg diinput termasuk s/p/o/k dan valid atau gak valid

        if (list.size() == 2) {
            if (list.get(0) == 'S') {
                if (list.get(1) == 'P') {
                    System.out.println("Benar " + list);
                } else {
                    System.out.println("Tidak Benar " + list);
                }
            } else {
                System.out.println("Tidak Benar" + list);
            }
        } else if (list.size() == 3) {
            if (list.get(0) == 'S') {
                if (list.get(1) == 'P') {
                    if (list.get(2) == 'O') {
                        System.out.println("Benar " + list);
                    } else if (list.get(2) == 'K') {
                        System.out.println("Benar " + list);
                    } else {
                        System.out.println("Tidak Benar " + list);
                    }
                } else {
                    System.out.println("Tidak Benar " + list);
                }
            } else {
                System.out.println("Tidak Benar " + list);
            }
        } else if (list.size() == 4) {
            if (list.get(0) == 'S') {
                if (list.get(1) == 'P') {
                    if (list.get(2) == 'O') {
                        if (list.get(3) == 'K') {
                            System.out.println("Benar " + list);
                        } else {
                            System.out.println("Tidak Benar " + list);
                        }
                    } else {
                        System.out.println("Tidak Benar " + list);
                    }
                } else {
                    System.out.println("Tidak Benar " + list);
                }
            } else {
                System.out.println("Tidak Benar" + list);
            }
        } else {
            System.out.println("Tidak Benar " + list);
        }
        if (list.size() == 2) {
            if (list.get(0) == 'S') {
                if (list.get(1) == 'P') {
                    System.out.println("Benar " + list);
                } else {
                    System.out.println("Tidak Benar " + list);
                }
            } else {
                System.out.println("Tidak Benar " + list);
            }
        } else if (list.size() == 3) {
            if (list.get(0) == 'S') {
                if (list.get(1) == 'P') {
                    if (list.get(2) == 'O') {
                        System.out.println("Benar " + list);
                    } else if (list.get(2) == 'K') {
                        System.out.println("Benar " + list);
                    } else {
                        System.out.println("Tidak Benar " + list);
                    }
                } else {
                    System.out.println("Tidak Benar " + list);
                }
            } else {
                System.out.println("Tidak Benar " + list);
            }
        } else if (list.size() == 4) {
            if (list.get(0) == 'S') {
                if (list.get(1) == 'P') {
                    if (list.get(2) == 'O') {
                        if (list.get(3) == 'K') {
                            System.out.println("Benar " + list);
                        } else {
                            System.out.println("Tidak Benar" + list);
                        }
                    } else {
                        System.out.println("Tidak Benar" + list);
                    }
                } else {
                    System.out.println("Tidak Benar " + list);
                }
            } else {
                System.out.println("Tidak Benar" + list);
            }
        } else {
            System.out.println("Tidak Benar " + list);
        }
    }
}



