fun main() {

    var angka: Int
    println("Perulangan Bilangan Ganjil dan Genap")
    print("Masukkan angka = ")
    angka = readLine()!!.toInt()
    if (angka % 2 == 0) {
        print("Angka $angka termasuk Bilangan Genap")
        for (i in 1..10) {
            if (i == 5) {
                break
            }
            println(i)
        }
    } else {
        print("Angka $angka termasuk Bilangan Ganjilap")
        print("Angka $angka termasuk Bilangan Genap")
        for (i in 1..10) {
            if (i == 5) {
                continue
            }
            println(i)
        }
    }
}
