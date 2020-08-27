import java.awt.SystemColor.menu
import java.util.Scanner;

public var input = Scanner(System.`in`)

fun main() {
    //membuat objek scanner
    val input = Scanner(System.`in`)

    //Menginputkan Identitas
    print("Nama: ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Harap diisi")
        main()
    }
    print("Kelas: ")
    val kelas: String? = input.nextLine()
    print("Nomor Absen: ")
    val absen: String? = input.nextLine()
    println("\t")
    println("\t")

        println("---MENGHITUNG BANGUN RUANG---")
        println("1. Volume Kerucut")
        println("2. Volume Tabung")
        print("Masukan Menu Pilihan [1-2]: ")
        val menu = readLine()

        when (menu) {
            "1" -> {
                println("---Hitung kerucut---")
                print("Masukan jari-jari Kerucut : ")
                val jk: Double = input.nextDouble()
                print("Masukan tinggi krucut : ")
                val tk: Double = input.nextDouble()

                //menghitung kerucut
                val v: Double = (0.333) * Math.PI * (jk * jk) * tk;

                //cetak hasil
                println("---Hasil hitung kerucut---")
                println("Volume kerucut = $v ")

                //kembali ke menu
                println("Kembali ke menu [Y/N] : ")
                val next1 = readLine()
                if(next1=="Y" || next1=="y"){
                    main()
                }
                else{
                    println("Press Enter Key To Exit")
                }

            }
            "2" -> {
                println("---Hitung Tabung---")
                print("Masukan jari-jari tabung : ")
                val jb: Double = input.nextDouble()
                print("Masukan tinggi tabung : ")
                val tb: Double = input.nextDouble()

                //menghitung tabung
                val vt: Double = Math.PI * jb * tb;

                //cetak hasil
                println("---Hasil hitung tabung---")
                print("Volume kerucut = $vt ")

                //kembali ke menu
                println("Kembali ke menu [Y/N] : ")
                val next2 = readLine()
                if(next2=="Y" || next2=="y"){
                    main()
                }
                else{
                    println("Press Enter Key To Exit")
                }

            }
            else-> {
                println("Menu Tidak Tersedia")
            }
        }
    }