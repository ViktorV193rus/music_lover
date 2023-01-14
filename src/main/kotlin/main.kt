fun main() {
    val signature = true
    val itemPrice = 50 //цена товара
    val itemCount = 10 //цена покупки
    val standartDiscount = 100
    val discountStartSmall = 1000 // мин сумма для скидки small
    val discountStartBig = 10000 // мин сумма для скидки big
    var totalPrice = itemPrice * itemCount // покупка + товар = равно
    val discount5: Int = (totalPrice * 5) / 100 //скидка 5%
    val discount1: Int = (totalPrice * 1) / 100 //скидка 1%

    if (totalPrice > discountStartBig) { //false
        totalPrice -= standartDiscount
    } else if (totalPrice > discountStartSmall) { // true истина
        totalPrice -= discount5
    } else {
        totalPrice //тут нужно что-то написать, зачем непонятно, как избавится от этого не ясно
    }
    println("Сумма покупки $totalPrice")

    if (signature) //если значение true делаем скидку
        totalPrice -= discount1
    println("Ранее покупал музыку и получил скидку $discount1 руб., оплата со скидкой $totalPrice")
}

