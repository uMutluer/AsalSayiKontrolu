

//Kullanıcıdan bir sayı alınacak ve bu sayının asal olup olmadığını kontrol edeceğimiz kod parçası

fun main() {

    var number: Int
    var isPrime = true

    println("Lütfen bir sayı giriniz:")
    number = readLine()!!.toInt()
    if (number < 2) {
        println("Lütfen 2 ya da daha büyük değerler giriniz.")
    } else {
        println("İşleminiz devam ediyor.")

    }
    for (i in 2..number - 1) {

        if (number % i == 0) {
             isPrime = false
            break
        } else {
             isPrime = true

        }
    }
    if (isPrime ==false) { println("Girdiğiniz $number sayısı asal değildir.")}

    else { println("Girdiğiniz $number sayısı asaldır.")}

}


